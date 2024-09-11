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

public class DoctorBoardCommentDeleteController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
        Result result = new Result();
        
        // 댓글 번호와 게시글 번호 파라미터 가져오기
        int doctorCommentNumber = Integer.parseInt((String)request.getAttribute("doctorCommentNumber"));
        int medicalInfoNumber = Integer.valueOf(request.getParameter("infoNumber"));
        
        System.out.println(doctorCommentNumber);
        System.out.println(medicalInfoNumber);
    	DoctorBoardDAO doctorBoardDAO = new DoctorBoardDAO();
    	
        // 댓글 삭제 메서드 호출
        doctorBoardDAO.deleteComment(doctorCommentNumber);
        
        // 삭제 후 게시글 상세페이지로 리다이렉트
        result.setRedirect(true);
        result.setPath("/app/board/boardDetailDoctor?infoNumber=" + medicalInfoNumber);
        
		return result;
	}
}