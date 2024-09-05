package com.doctorTreat.app.doctor.dao;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.DoctorDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorDAO {

	private SqlSession sqlSession;
	
	public DoctorDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void join(DoctorDTO doctorDTO) {
		sqlSession.insert("doctor.join",doctorDTO);
	}
	
	public boolean checkId(String doctorId) {
		return(Integer)sqlSession.selectOne("doctor.checkId",doctorId)<=0;
	}
	
	
}
