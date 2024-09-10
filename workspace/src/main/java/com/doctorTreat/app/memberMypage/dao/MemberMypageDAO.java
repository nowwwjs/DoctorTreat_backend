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
	
	

}
