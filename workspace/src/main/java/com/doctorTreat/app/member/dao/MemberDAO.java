package com.doctorTreat.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.DoctorDTO;
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

}