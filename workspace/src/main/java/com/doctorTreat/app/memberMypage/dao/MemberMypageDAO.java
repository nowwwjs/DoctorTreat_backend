package com.doctorTreat.app.memberMypage.dao;


import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberMypageDAO {
	private SqlSession sqlSession;

	public MemberMypageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public MemberDTO showInfo(int memberNumber) {
		return sqlSession.selectOne("memberMypage.memberInfo", memberNumber);
	}
	
	public boolean checkPw(String memberName,String memberPassword){
	      MemberDTO memberDTO = new MemberDTO();
	      memberDTO.setMemberName(memberName);
	      memberDTO.setMemberPw(memberPassword);
	      System.out.println("비번인증 도착했음");
	      return (Integer) sqlSession.selectOne("memberMypage.checkPw",memberDTO) <= 0;
	       
	   }
	
	
	public void Quit1(int memberNumber) {
		sqlSession.delete("memberMypage.memberQuit1",memberNumber);
		System.out.println("주소삭제완료");
	}
	
	public void Quit2(int memberNumber) {
		sqlSession.delete("memberMypage.memberQuit2",memberNumber);
		System.out.println("회원삭제완료");
	}
	

	
	

}
