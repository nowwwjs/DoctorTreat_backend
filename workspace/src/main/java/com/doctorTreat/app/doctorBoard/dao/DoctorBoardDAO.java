package com.doctorTreat.app.doctorBoard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.DoctorBoardDTO;
import com.doctorTreat.app.dto.DoctorCommentDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorBoardDAO {
    private SqlSession sqlSession;

    public DoctorBoardDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    }

    // 게시글 목록 조회
    public List<DoctorBoardDTO> showList() {
        return sqlSession.selectList("DoctorBoard.showlist");
    }

    
    // 게시글 상세페이지 검색
    public DoctorBoardDTO searchByText(int medicalInfoNumber) {
        return sqlSession.selectOne("DoctorBoard.showListDetail", medicalInfoNumber);
    }
    
    // 댓글 삽입
    public void insertComment(DoctorCommentDTO doctorCommentDTO) {
        sqlSession.insert("doctorComment.insertComment", doctorCommentDTO);
    }
    
    
//    // 댓글 조회
//    public DoctorCommentDTO showComment(String docComment) {
//    	return sqlSession.selectOne("doctorComment.showComment", docComment);
//    }
}