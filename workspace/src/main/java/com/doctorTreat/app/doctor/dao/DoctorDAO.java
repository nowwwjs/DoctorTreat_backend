package com.doctorTreat.app.doctor.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.doctorTreat.app.dto.DoctorDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorDAO {

    private SqlSessionFactory sqlSessionFactory;

    public DoctorDAO() {
       System.out.println(456);
        this.sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
        System.out.println(123);
    }

    public void joinDoctor(DoctorDTO doctorDTO) throws Exception {
        try (SqlSession session = sqlSessionFactory.openSession(false)) { // 트랜잭션 관리
            try {
                // 1. 주소 삽입
                session.insert("main.joinAddress", doctorDTO);

                // 2. 삽입된 주소의 ADDRESS_NUMBER 가져오기
                Integer addressNumber = (Integer) session.selectOne("main.getLastAddressNumber");
                doctorDTO.setAddressNumber(addressNumber);

                // 3. 회원 정보 삽입
                session.insert("main.doctorJoin", doctorDTO);

                // 4. 트랜잭션 커밋
                session.commit();
            } catch (Exception e) {
                // 예외 발생 시 트랜잭션 롤백
                session.rollback();
                throw e;
            }
        }
    }
}