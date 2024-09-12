package com.doctorTreat.app.doctorBoard;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorBoard.dao.DoctorBoardDAO;
import com.doctorTreat.app.dto.DoctorBoardDTO;
import com.doctorTreat.app.dto.DoctorCommentDTO;

public class DoctorBoardCommentController implements Execute {
    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        request.setCharacterEncoding("UTF-8");
        Result result = new Result();

        DoctorBoardDAO doctorBoardDAO = new DoctorBoardDAO();
        DoctorCommentDTO doctorCommentDTO = new DoctorCommentDTO();        

        // 게시글 번호 파라미터 가져오기
        int medicalInfoNumber1 = Integer.valueOf(request.getParameter("infoNumber"));
        request.setAttribute("infoNumber", request.getParameter("infoNumber"));
        // 댓글 내용과 닥터 번호 가져오기
        String commentText = request.getParameter("doctorCommentText");
        Integer doctorNumber = (Integer) request.getSession().getAttribute("doctorNumber");

        // 댓글 DTO 설정
        doctorCommentDTO.setDoctorCommentText(commentText);
        doctorCommentDTO.setDoctorNumber(doctorNumber);
        doctorCommentDTO.setMedicalInfoNumber(medicalInfoNumber1);

        // 댓글 삽입
        doctorBoardDAO.insertComment(doctorCommentDTO);

        // 게시글 상세 정보와 댓글 리스트 가져오기
        DoctorBoardDTO doctorBoardDetail = doctorBoardDAO.searchByText(medicalInfoNumber1);
        List<DoctorCommentDTO> comments = doctorBoardDAO.showComment(medicalInfoNumber1);

        request.setAttribute("doctorBoardshowDetail", doctorBoardDetail);
        request.setAttribute("comments", comments);

        // 댓글 삽입 후 게시글 상세페이지로 리다이렉트
//        result.setRedirect(true);
//        result.setPath("/app/board/boardDetailDoctor?infoNumber=" + medicalInfoNumber1);

        return result;
    }
}