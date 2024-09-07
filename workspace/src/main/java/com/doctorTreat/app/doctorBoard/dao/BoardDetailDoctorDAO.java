package com.doctorTreat.app.doctorBoard.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.doctorTreat.app.dto.BoardDetailDoctorDTO;  // DTO 클래스 변경
import com.mybatis.config.MyBatisConfig;

public class BoardDetailDoctorDAO {
    private SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
    private SqlSession sqlSession;

    public BoardDetailDoctorDAO() {
        sqlSession = sqlSessionFactory.openSession(true);
    }

    // 특정 회원이 작성한 게시글의 제목, 작성자, 날짜, 내용을 조회하는 메서드
    public BoardDetailDoctorDTO getBoardDetailByMember(int memberNumber) {
        return sqlSession.selectOne("DoctorBoard.getBoardDetailByMember", memberNumber);
    }
}