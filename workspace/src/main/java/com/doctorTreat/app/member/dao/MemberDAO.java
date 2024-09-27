package com.doctorTreat.app.member.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberDAO {
   private SqlSession sqlSession;

   public MemberDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }

   // 주소 삽입
   public Integer inputAddress(MemberDTO memberDTO) {
      // 주소 삽입
      sqlSession.insert("member.memberAddress", memberDTO);
      System.out.println("주소 삽입 성공");

      // 삽입된 주소의 PK 가져오기
      Integer addressNumber = sqlSession.selectOne("member.getAddressNum");
      memberDTO.setAddressNumber(addressNumber);
      System.out.println("생성된 주소번호: " + addressNumber);

      return addressNumber;
   }

   // 회원 정보 삽입
   public void inputMember(MemberDTO memberDTO) {
      // 주소 번호는 이미 memberDTO에 설정되어 있어야 함
      sqlSession.insert("member.memberJoin", memberDTO);
      System.out.println("회원 정보 삽입 성공");

      // 트랜잭션 커밋
      sqlSession.commit();
   }

   // 회원 로그인
   public MemberDTO memberLogin(MemberDTO memberDTO) {
      System.out.println("로그인 시도 - 입력된 아이디: " + memberDTO.getMemberId() + ", 입력된 비밀번호: " + memberDTO.getMemberPw());

      MemberDTO member = sqlSession.selectOne("member.memberLogin", memberDTO);

      if (member == null) {
         System.out.println("로그인 실패 - 일치하는 회원 정보 없음");
      } else {
         System.out.println("로그인 성공 - 조회된 회원 정보: " + member.toString());
      }

      return member;
   }

   // 회원가입 시 아이디 중복 확인
   public boolean checkId(String memberId) {
      Integer count = sqlSession.selectOne("member.checkId", memberId);
      System.out.println("중복 확인된 아이디 개수: " + count);
      return (Integer) sqlSession.selectOne("member.checkId", memberId) <= 0;
   }

   // 회원 탈퇴
   public void quit(int memberNumber) {
      sqlSession.delete("member.quit", memberNumber);
   }
   
<<<<<<< HEAD
   // 멤버 아이디 찾기
   public MemberDTO findId2(String phone) {
      System.out.println("멤버 findId 도착");
      return sqlSession.selectOne("member.findId2", phone);
   }
   
   //일반 비밀번호 찾기
   public MemberDTO findPw2(String memberName, String memberId) {
	    System.out.println("일반 FindPw 도착했음");
	    
	    // Map을 사용하여 매개변수 전달
	    Map<String, Object> params = new HashMap<>();
	    params.put("memberName", memberName);
	    params.put("memberId", memberId);
	    
	    System.out.println(params);
	    System.out.println("findPw2 - memberDAO");
	    // selectOne으로 결과를 받아 처리
	  return  sqlSession.selectOne("member.findPw2", params);
=======
	// 멤버 아이디 찾기
	public MemberDTO findId2(String phone) {
		System.out.println("멤버 findId 도착");
		return sqlSession.selectOne("member.findId2", phone);
>>>>>>> main
	}

}