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

    // 이비인후과 의사 전체 리스트 조회 (매개변수 없음)
    public List<ClinicDoctorListDTO> getEarDoctors() {
        return sqlSession.selectList("memberClinic.doctorListEar");
    }

    // 이비인후과 의사 수 조회 (페이지네이션에 필요)
    public int getTotalEarDoctorCount() {
        return sqlSession.selectOne("memberClinic.getTotalDoctorEarCount");
    }

}
