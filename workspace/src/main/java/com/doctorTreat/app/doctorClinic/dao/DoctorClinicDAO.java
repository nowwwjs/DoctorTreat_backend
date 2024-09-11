package com.doctorTreat.app.doctorClinic.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.ChartDTO;
import com.doctorTreat.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorClinicDAO{
	public SqlSession sqlSession;

	public DoctorClinicDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public List<MemberDTO> getChatMembers(int doctorNumber){
		return sqlSession.selectList("doctorClinic.getChatList", doctorNumber);
	}
	
	public List<ChartDTO> getChartInfo(Map<String, Object> map){
		return sqlSession.selectList("doctorClinic.getChartInfo", map);
	}
	
	public void inputChart(ChartDTO chartDTO) {
		sqlSession.insert("doctorClinic.inputChart", chartDTO);
	}
	
}
