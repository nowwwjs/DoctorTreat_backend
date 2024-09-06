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
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

//	이비인후과 의사 리스트 조회
	public List<ClinicDoctorListDTO> getEarDoctors(int offset, int limit) {
		Map<String, Object> params = new HashMap<>();
		params.put("offset", offset);
		params.put("limit", limit);
		return sqlSession.selectList("memberClinic.doctorListEar", params);
	}

	public int getTotalEarDoctorCount() {
		return sqlSession.selectOne("memberClinic.getTotalDoctorEarCount");
	}

}
