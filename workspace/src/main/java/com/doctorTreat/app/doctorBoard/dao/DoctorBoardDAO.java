package com.doctorTreat.app.doctorBoard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.DoctorBoardDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorBoardDAO {
    private SqlSession sqlSession;

    public DoctorBoardDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    }

    // 게시글 목록 조회
    public List<DoctorBoardDTO> showList() {
        return sqlSession.selectList("DoctorBoard.showList");
    }

//    // 회원 번호로 게시글 상세 조회
//    public List<DoctorBoardDTO> showDetail(int memberNumber) {
//        return sqlSession.selectList("DoctorBoard.showDetail", memberNumber);
//    }
}