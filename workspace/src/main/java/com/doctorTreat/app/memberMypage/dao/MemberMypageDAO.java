package com.doctorTreat.app.memberMypage.dao;


import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.DoctorDTO;
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
	
	public boolean checkPw(String memberId, String memberPw) {
	    MemberDTO memberDTO = new MemberDTO();
	    memberDTO.setMemberId(memberId);
	    memberDTO.setMemberPw(memberPw);

	    // MyBatis로 비밀번호 확인 (카운트가 1 이상이면 인증 성공)
	    Integer count = sqlSession.selectOne("memberMypage.memberPwOk", memberDTO);
	    return count != null && count > 0; // 비밀번호가 일치하면 true 반환
	}
	
	
	public int showMember(MemberDTO memberDTO) {
		return sqlSession.selectOne("memberMypage.memberReceive" , memberDTO);
	}
	
	
	//회원삭제
	public int quitMember1(MemberDTO memberDTO) {
		System.out.println("회원정보주소정보조회");
	    return sqlSession.selectOne("memberMypage.memberAddCheck", memberDTO);   
	}
	public void quitMember2(MemberDTO memberDTO) {
	    sqlSession.delete("memberMypage.memberQuit1", memberDTO);
	    System.out.println("회원 삭제 완료");
	}
	public void quitMember3(MemberDTO memberDTO) {
	    sqlSession.delete("memberMypage.memberQuit2", memberDTO);
	    System.out.println("주소 삭제 완료");
	}


	

	
	

}
