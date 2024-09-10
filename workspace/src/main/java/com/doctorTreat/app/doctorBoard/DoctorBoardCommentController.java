package com.doctorTreat.app.doctorBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorBoard.dao.DoctorBoardDAO;
import com.doctorTreat.app.dto.DoctorCommentDTO;

public class DoctorBoardCommentController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
	        throws IOException, ServletException {

	    request.setCharacterEncoding("UTF-8");
	    Result result = new Result();

	    DoctorBoardDAO doctorBoardDAO = new DoctorBoardDAO();
	    DoctorCommentDTO doctorCommentDTO = new DoctorCommentDTO();

	    // 댓글 내용과 닥터 번호를 요청 파라미터에서 가져옴
	    String commentText = request.getParameter("doctorCommentText");
	    Integer doctorNumber = (Integer) request.getSession().getAttribute("doctorNumber");

	    // DTO에 데이터 설정
	    doctorCommentDTO.setDoctorCommentText(commentText);
	    doctorCommentDTO.setDoctorNumber(doctorNumber);

	    // 댓글 삽입
	    doctorBoardDAO.insertComment(doctorCommentDTO);
	    
	    

	    // 디버깅용 로그 출력
	    System.out.println("댓글 삽입 완료: " + doctorCommentDTO);

	    // 댓글 삽입 후 게시글 상세페이지로 리다이렉트
	    result.setRedirect(true);

	    return result;
	}
}