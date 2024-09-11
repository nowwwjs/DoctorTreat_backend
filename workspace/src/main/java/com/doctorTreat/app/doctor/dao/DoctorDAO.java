package com.doctorTreat.app.doctor.dao;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.DoctorDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorDAO {

	private SqlSession sqlSession;
	private Object doctorId;

	public DoctorDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public void inputAddress(DoctorDTO doctorDTO) {
		sqlSession.insert("doctor.doctorJoinAddress", doctorDTO);
		System.out.println("주소 삽입 성공");
	}

	public void inputHospital(DoctorDTO doctorDTO) {
		// 주소 삽입시 생성된 주소번호PK 시퀀스를 조회하여 AddressNumber의 값으로 담기
		Integer addressNumber = sqlSession.selectOne("doctor.getAddressNum"); // 시퀀스 조회
		doctorDTO.setAddressNumber(addressNumber); // DTO에 시퀀스 값 설정
		System.out.println("생성된 주소번호: " + addressNumber);

		// 주소 삽입 후 ADDRESS_NUMBER가 doctorDTO에 설정되어 있어야 함
		// 병원 삽입
		sqlSession.insert("doctor.doctorJoinHospital", doctorDTO);
		System.out.println("병원 삽입 성공");
	}

	public void inputDoctor(DoctorDTO doctorDTO) {
		// 주소 삽입시 생성된 주소번호PK 시퀀스를 조회하여 AddressNumber의 값으로 담기
		Integer hospitalNumber = sqlSession.selectOne("doctor.getHospitalNum"); // 시퀀스 조회
		doctorDTO.setHospitalNumber(hospitalNumber); // DTO에 시퀀스 값 설정
		System.out.println("생성된 병원번호: " + hospitalNumber);

		// 주소 삽입 후 ADDRESS_NUMBER가 doctorDTO에 설정되어 있어야 함
		// 병원 삽입
		sqlSession.insert("doctor.doctorJoin", doctorDTO);
		System.out.println("의사 삽입 성공");
	}

	// 로그인
	public DoctorDTO doctorLogin(DoctorDTO doctorDTO) {
		System.out.println("닥터");
		System.out.println("로그인 시도 - 입력된 아이디: " + doctorDTO.getDoctorId() + ", 입력된 비밀번호: " + doctorDTO.getDoctorPw());

		DoctorDTO doctor = sqlSession.selectOne("doctor.doctorLogin", doctorDTO);

		if (doctor == null) {
			System.out.println("로그인 실패 - 일치하는 의사 정보 없음");
		} else {
			System.out.println("로그인 성공 - 조회된 의사 정보: " + doctor.toString());
		}

		return doctor;
	}

	// 비밀번호 인증
	public boolean checkPassword(String doctorId, String doctorPw) {
		DoctorDTO doctorDTO = new DoctorDTO();
		doctorDTO.setDoctorId(doctorId);
		doctorDTO.setDoctorPw(doctorPw);

		// 비밀번호가 일치하는지 확인 (카운트가 1 이상이면 비밀번호 일치)
		Integer count = sqlSession.selectOne("doctorMypage.checkPassword", doctorDTO);
		System.out.println(count);
		return count != null && count > 0;
	}
	
	//마이페이지 내 병원 수정 페이지 정보 조회
	public DoctorDTO showUpdateInfo(int doctorNumber) {
		return sqlSession.selectOne("doctorMypage.showUpdateInfo",doctorNumber);
	}
	
	
	
	
	
	

	// 아이디 중복확인
	public boolean checkId(String doctorId) {
		System.out.println("중복확인도착");
		// selectOne() 반환타입은 Object 타입이라 비교를 위해 Integer로 형 변환
		// DB에서 memberId가 존재하는지 확인하는 쿼리를 실행하고
		// 존재하면 true, 존재하지 않으면 false로 반환하도록 한다
		return (Integer) sqlSession.selectOne("doctor.checkId", doctorId) <= 0;
		// 값이 0 이하면 아이디가 존재하지 않음 => true 반환
		// 아이디가 존재하면 false 반환
	}

	// 마이페이지 정보 조회
	public DoctorDTO showInfo(int doctorNumber) {
		return sqlSession.selectOne("doctorMypage.showInfo", doctorNumber);
	}

	// 회원 탈퇴: 의사 번호로 해당 주소, 병원, 의사 정보를 삭제

	public int showDoctor(DoctorDTO doctorDTO) {
		System.out.println("하이루");
		return sqlSession.selectOne("doctorMypage.doctorReceive", doctorDTO);

	}

	public void quit1(int doctorNumber) {
		sqlSession.delete("doctorMypage.doctorQuit1", doctorNumber); // 주소 삭제
		System.out.println("주소 삭제 완료");
	}

	public void quit2(int doctorNumber) {
		sqlSession.delete("doctorMypage.doctorQuit2", doctorNumber); // 병원 삭제
		System.out.println("병원 삭제 완료");
	}

	public void quit3(int doctorNumber) {
		sqlSession.delete("doctorMypage.doctorQuit3", doctorNumber); // 의사 정보 삭제
		System.out.println("의사 정보 삭제 완료");
	}

}
