package com.doctorTreat.app.memberClinic.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.ClinicDoctorListDTO;
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
		System.out.println("메소드");
		return sqlSession.selectList("memberClinic.getDoctorDetail", hospitalCall); //+++++++
		//쿼리스트링으로 들어가는 값을 전달하지 않음
	}

}
