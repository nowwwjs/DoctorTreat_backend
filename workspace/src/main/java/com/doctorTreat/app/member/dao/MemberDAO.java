package com.doctorTreat.app.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.doctorTreat.app.dto.DoctorDTO;
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

		// 주소 삽입 후 ADDRESS_NUMBER가 memberDTO에 설정되어 있어야 함
		// 멤버 추가
		sqlSession.insert("member.memberJoin", memberDTO);
	}

}