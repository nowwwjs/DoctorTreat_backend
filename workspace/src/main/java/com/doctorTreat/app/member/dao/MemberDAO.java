package com.doctorTreat.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberDAO {
	private SqlSession sqlSession;

	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public void inputAddress(MemberDTO memberDTO) {
		sqlSession.insert("member.memberAddress", memberDTO);
		System.out.println("주소 삽입 성공");
	}

	public void inputMember(MemberDTO memberDTO) {
		// 주소 삽입시 생성된 주소번호PK 시퀀스를 조회하여 AddressNumber의 값으로 담기
		Integer addressNumber = sqlSession.selectOne("member.getAddressFK"); // 시퀀스 조회
		memberDTO.setAddressNumber(addressNumber); // DTO에 시퀀스 값 설정
		System.out.println("생성된 주소번호: " + addressNumber);

		// 주소 삽입 후 ADDRESS_NUMBER가 doctorDTO에 설정되어 있어야 함
		// 병원 삽입
		sqlSession.insert("member.memberJoin", memberDTO);
		System.out.println("병원 삽입 성공");
	}

	public MemberDTO memberLogin(MemberDTO memberDTO) {
		System.out.println("일반");
		System.out.println("로그인 시도 - 입력된 아이디: " + memberDTO.getMemberId() + ", 입력된 비밀번호: " + memberDTO.getMemberPw());

		MemberDTO member = sqlSession.selectOne("member.memberLogin", memberDTO);

		if (member == null) {
			System.out.println("로그인 실패 - 일치하는 일반 정보 없음");
		} else {
			System.out.println("로그인 성공 - 조회된 일반 정보: " + member.toString());
		}

		return member;

	}

	// 회원가입시 아이디 중복 확인
	public boolean memberCheckId(String memberId) {
		return (Integer) sqlSession.selectOne("member.memberCheckId", memberId) <= 0;
	}

	// 회원탈퇴
	public void quit(int memberNumber) {
		sqlSession.delete("member.quit", memberNumber);
	}

}