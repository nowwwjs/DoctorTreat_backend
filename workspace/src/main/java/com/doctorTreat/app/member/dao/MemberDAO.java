package com.doctorTreat.app.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.doctorTreat.app.dto.MemberDTO;

public class MemberDAO {
	private SqlSessionFactory sqlSessionFactory;

	public MemberDAO(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public void join(MemberDTO member) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {

			sqlSession.insert("main.joinAddress", member);

			sqlSession.insert("main.join", member);

			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

}