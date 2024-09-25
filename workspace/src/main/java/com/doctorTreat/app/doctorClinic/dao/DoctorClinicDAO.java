package com.doctorTreat.app.doctorClinic.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.ChartDTO;
import com.doctorTreat.app.dto.ChatDTO;
import com.doctorTreat.app.dto.ChatSessionDTO;
import com.doctorTreat.app.dto.DoctorDTO;
import com.doctorTreat.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorClinicDAO {
	public SqlSession sqlSession;

	public DoctorClinicDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

//	현재접속중인 의사회원의 채팅목록 조회
	public List<MemberDTO> getChatMembers(int doctorNumber) {
		return sqlSession.selectList("doctorClinic.getChatList", doctorNumber);
	}

//	처방전 작성시 자동작성 일반회원정보
	public List<ChartDTO> getChartInfo(Map<String, Object> queryMap) {
		return sqlSession.selectList("doctorClinic.getChartInfo", queryMap);
	}

//	처방전 저장
	public void inputChart(ChartDTO chartDTO) {
		sqlSession.insert("doctorClinic.inputChart", chartDTO);
	}

//	조회에 필요한 의사이름, 병원이름 조회
	public List<DoctorDTO> getDoctorInfo(int doctorNumber) {
		return sqlSession.selectList("doctorClinic.getDoctorInfo", doctorNumber);
	}

	// 채팅방 번호 조회
	public List<ChatDTO> getChatRoomNumber(Map<String, Object> queryMap) {
		return sqlSession.selectList("doctorClinic.getChatRoomNumber", queryMap);
	}

	// 의사입력 채팅 저장
	public void inputDoctorChat(ChatDTO chatDTO) {
		sqlSession.insert("doctorClinic.inputDoctorChat", chatDTO);
	}

	// 의사 채팅 정보 조회
	public List<ChatDTO> getChatDoctorInfo(Map<String, Object> queryMap) {
		return sqlSession.selectList("doctorClinic.getChatDoctorInfo", queryMap);
	}

}
