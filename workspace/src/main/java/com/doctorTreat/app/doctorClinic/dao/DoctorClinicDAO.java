package com.doctorTreat.app.doctorClinic.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class DoctorClinicDAO{
	public SqlSession sqlSession;

	public DoctorClinicDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

}
