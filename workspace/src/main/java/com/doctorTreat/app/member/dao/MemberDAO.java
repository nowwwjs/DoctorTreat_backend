package com.doctorTreat.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberDAO {
	private SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public void join(MemberDTO member) throws Exception {
		try {

			sqlSession.insert("main.joinAddress", member);

			
			sqlSession.insert("main.join", member);

			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	

	

}