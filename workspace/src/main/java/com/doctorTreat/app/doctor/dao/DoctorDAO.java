package com.doctorTreat.app.doctor.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.doctorTreat.app.dto.DoctorDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorDAO {

    private SqlSessionFactory sqlSessionFactory;

    public DoctorDAO() {
        this.sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
    }

    public void joinDoctorTransaction(DoctorDTO doctorDTO) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            // 주소 삽입
            sqlSession.insert("doctor.doctorJoinAddress", doctorDTO);
            System.out.println("주소 삽입 성공");

            // 주소 삽입 후 ADDRESS_NUMBER가 doctorDTO에 설정되어 있어야 함
            // 병원 삽입
            sqlSession.insert("doctor.doctorJoinHospital", doctorDTO);
            System.out.println("병원 삽입 성공");

            // 병원 삽입 후 HOSPITAL_NUMBER가 doctorDTO에 설정되어 있어야 함
            // 의사 삽입
            sqlSession.insert("doctor.doctorJoin", doctorDTO);
            System.out.println("의사 삽입 성공");

            // 모든 작업이 성공하면 커밋
            sqlSession.commit();
        } catch (Exception e) {
            // 에러 발생 시 롤백
            sqlSession.rollback();
            e.printStackTrace(); // 로그에 에러를 기록
        } finally {
            sqlSession.close(); // 세션 닫기
        }
    }
}
