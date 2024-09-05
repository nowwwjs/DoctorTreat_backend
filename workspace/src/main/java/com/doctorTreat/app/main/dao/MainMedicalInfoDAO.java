package com.doctorTreat.app.main.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.doctorTreat.app.dto.MainMedicalInfoDTO;

public class MainMedicalInfoDAO {
    private SqlSessionFactory sqlSessionFactory;

    public MainMedicalInfoDAO(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    // 모든 의료 정보 제목을 가져오는 메소드
    public List<String> getAllMedicalInfoTitles() {
        
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectList("main.MedicalInfo");
           
        }
    }
}
