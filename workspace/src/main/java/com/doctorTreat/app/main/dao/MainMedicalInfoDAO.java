package com.doctorTreat.app.main.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.DoctorBoardDTO;
import com.doctorTreat.app.dto.DoctorCommentDTO;
import com.doctorTreat.app.dto.MainDTO;
import com.mybatis.config.MyBatisConfig;

public class MainMedicalInfoDAO {
	private SqlSession sqlSession;

	public MainMedicalInfoDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 메인 페이지에서 의료지식인 페이지 최신순으로 보여주기
	public List<MainDTO> mainShowList() {
		return sqlSession.selectList("main.medicalInfoTitles");
	}
    
}
