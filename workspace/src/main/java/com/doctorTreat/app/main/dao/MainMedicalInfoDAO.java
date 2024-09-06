package com.doctorTreat.app.main.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.doctorTreat.app.dto.MainMedicalInfoDTO;

public class MainMedicalInfoDAO {
    
    private SqlSessionFactory sqlSessionFactory;

    // 생성자를 통해 SqlSessionFactory 주입
    public MainMedicalInfoDAO(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    // 의학 정보 제목만 가져오는 메서드
    public List<String> getMedicalInfoTitles() {
        SqlSession session = null;
        List<String> medicalInfoTitles = null;

        try {
            session = sqlSessionFactory.openSession(); // 세션 열기
            // MyBatis Mapper 파일에서 "MedicalInfo" 쿼리 실행
            medicalInfoTitles = session.selectList("main.getMedicalInfoTitles");
        } finally {
            if (session != null) {
                session.close(); // 세션 닫기
            }
        }

        return medicalInfoTitles;
    }
}
