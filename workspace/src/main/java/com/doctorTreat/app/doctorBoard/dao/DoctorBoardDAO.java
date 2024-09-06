package com.doctorTreat.app.doctorBoard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.DoctorBoardDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorBoardDAO {
	private SqlSession sqlSession;

	public DoctorBoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public List<DoctorBoardDTO> showList() {
		return sqlSession.selectList("DoctorBoard.showlist");
	}

}
