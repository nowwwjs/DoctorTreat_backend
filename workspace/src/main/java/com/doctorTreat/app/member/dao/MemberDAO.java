package com.doctorTreat.app.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.doctorTreat.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberDAO {
	private SqlSession sqlSession;
	
	public MemberDAO() {
        this.sqlSession = MyBatisConfig.getSqlSession();
    }
	
	 public void joinMemberTransaction(MemberDTO memberDTO) {
	        SqlSession sqlSession = sqlSession.openSession();
	        try {
	            // 주소 삽입
	            sqlSession.insert("member.memberAddress", memberDTO);
	            System.out.println("주소 삽입 성공");
	            
	            // 회원 삽입
	            sqlSession.insert("member.memberJoin", memberDTO);
	            System.out.println("회원 삽입 성공");

	            // 모든 작업이 성공하면 커밋
	            sqlSession.commit();
	        } catch (Exception e) {
	            // 에러 발생 시 롤백
	            sqlSession.rollback();
	            e.printStackTrace(); // 로그에 에러를 기록
	        } finally {
	            sqlSession.close(); // 세션 닫기
	        }
	    }
	 
	 public MemberDTO memberLogin(MemberDTO memberDTO) {
		 	MemberDTO member = sqlSession.selectOne("member.memberLogin", memberDTO);
		 	return member;
	 }
}