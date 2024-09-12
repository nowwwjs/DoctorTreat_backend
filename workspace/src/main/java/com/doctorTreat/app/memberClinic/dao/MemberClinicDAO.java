package com.doctorTreat.app.memberClinic.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.ChartDTO;
import com.doctorTreat.app.dto.ChatDTO;
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

	//의사 번호 조회
	public Integer getDoctorNumber(String hospitalCall) {
		return sqlSession.selectOne("memberClinic.getDoctorNumber", hospitalCall);
	}

	//채팅방 생성
	public void inputChatSession(ChatSessionDTO chatSessionDTO) {
		sqlSession.insert("memberClinic.createChatRoom", chatSessionDTO);
	}

	//이비인후과 채팅목록 조회
	public List<DoctorDTO> getChatListEar(int memberNumber) {
		return sqlSession.selectList("memberClinic.getEarDocChat", memberNumber);
	}

	//내과 채팅목록 조회
	public List<DoctorDTO> getChatListInner(int memberNumber) {
		return sqlSession.selectList("memberClinic.getInnerDocChat", memberNumber);
	}

	//처방전 조회
	public List<ChartDTO> getChart(int memberNumber) {
		return sqlSession.selectList("memberClinic.getChart", memberNumber);
	}
	
	//채팅방 번호 조회
	public List<ChatSessionDTO> getChatRoomNumber(Map<String, Object> queryMap) {
		return sqlSession.selectList("memberClinic.getChatRoomNumber", queryMap);
	}
	
	//환자입력 채팅 저장
	public void inputMemberChat(ChatDTO chatDTO) {
		sqlSession.insert("memberClinic.inputMemberChat", chatDTO);
	}
}
