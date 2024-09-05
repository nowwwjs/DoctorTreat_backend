package com.doctorTreat.app.memberClinic.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.ClinicDoctorListDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberClinicDAO {
	public SqlSession sqlSession;

	public MemberClinicDAO() {
		System.out.println("생성자 생성중");
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
		System.out.println("생성자 생성완료");
	}

	public List<ClinicDoctorListDTO> getEarDoctors(int offset, int limit) {
		System.out.println("이비인후과 의사목록 메소드 시작");
		Map<String, Object> params = new HashMap<>();
		System.out.println("맵생성");
		params.put("offset", offset);
		System.out.println("offset 추가");
		params.put("limit", limit);
		System.out.println("limit 추가");
		return sqlSession.selectList("memberClinic.doctorListEar", params);
	}

	public int getTotalEarDoctorCount() {
		System.out.println("이비인후과 의사 인원 메소드 시작");
		return sqlSession.selectOne("memberClinic.getTotalDoctorEarCount");
	}

}
