package com.doctorTreat.app.memberBoard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.MemberBoardDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberBoardDAO {
	private SqlSession sqlSession;

	public MemberBoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
    public List<MemberBoardDTO> showList() {
        return sqlSession.selectList("memberBoard.showlist");
    }
    
    

	
}
