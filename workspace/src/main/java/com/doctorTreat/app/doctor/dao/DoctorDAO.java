package com.doctorTreat.app.doctor.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.doctorTreat.app.dto.DoctorDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorDAO {

<<<<<<< HEAD
	private SqlSession sqlSession;

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
	
=======
   private SqlSession sqlSession;

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
   
>>>>>>> main
}
