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

//	현재접속중인 의사회원의 채팅목록 조회
	public List<MemberDTO> getChatMembers(int doctorNumber){
		return sqlSession.selectList("doctorClinic.getChatList", doctorNumber);
	}
	
//	처방전 작성시 자동작성 일반회원정보
	public List<ChartDTO> getChartInfo(Map<String, Object> queryMap){
		return sqlSession.selectList("doctorClinic.getChartInfo", queryMap);
	}
	
//	처방전 저장
	public void inputChart(ChartDTO chartDTO) {
		sqlSession.insert("doctorClinic.inputChart", chartDTO);
	}
	
}
