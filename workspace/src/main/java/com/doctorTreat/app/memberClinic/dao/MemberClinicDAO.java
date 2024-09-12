package com.doctorTreat.app.memberClinic.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.ChartDTO;
import com.doctorTreat.app.dto.ChatSessionDTO;
import com.doctorTreat.app.dto.ClinicDoctorListDTO;
import com.doctorTreat.app.dto.DoctorDTO;
import com.doctorTreat.app.dto.DoctorDetailDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberClinicDAO {
	public SqlSession sqlSession;

	public MemberClinicDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 이비인후과 의사 전체 리스트 조회 (매개변수 없음)
	public List<ClinicDoctorListDTO> getEarDoctors() {
		return sqlSession.selectList("memberClinic.doctorListEar");
	}

	// 내과 의사 전체 리스트 조회 (매개변수 없음)
	public List<ClinicDoctorListDTO> getInnerDoctors() {
		return sqlSession.selectList("memberClinic.doctorListInner");
	}

	// 의사 상세정보 조회
	public List<DoctorDetailDTO> getDoctorDetail(String hospitalCall) {
		return sqlSession.selectList("memberClinic.getDoctorDetail", hospitalCall);
	}

	public Integer getDoctorNumber(String hospitalCall) {
		return sqlSession.selectOne("memberClinic.getDoctorNumber", hospitalCall);
	}

	public void inputChatSession(ChatSessionDTO chatSessionDTO) {
		sqlSession.insert("memberClinic.createChatRoom", chatSessionDTO);
	}

	public List<DoctorDTO> getChatListEar(int memberNumber) {
		return sqlSession.selectList("memberClinic.getEarDocChat", memberNumber);
	}

	public List<DoctorDTO> getChatListInner(int memberNumber) {
		return sqlSession.selectList("memberClinic.getInnerDocChat", memberNumber);
	}

	public List<ChartDTO> getChart(int memberNumber) {
		return sqlSession.selectList("memberClinic.getChart", memberNumber);
	}

	public List<ChatSessionDTO> getChatRoomNumber(Map<String, Object> queryMap) {
		return sqlSession.selectList("memberClinic.getChatRoomNumber", queryMap);
	}

}
