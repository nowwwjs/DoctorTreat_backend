package com.doctorTreat.app.doctorBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorBoard.dao.DoctorBoardDAO;
import com.doctorTreat.app.dto.DoctorCommentDTO;

public class DoctorBoardCommentUpdateController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		
		request.setCharacterEncoding("UTF-8");
		Result result = new Result();
       
		DoctorCommentDTO doctorCommentDTO = new DoctorCommentDTO();
        DoctorBoardDAO doctorBoardDAO = new DoctorBoardDAO();
        
        // 댓글 번호와 수정된 내용 가져오기
        int doctorCommentNumber = Integer.parseInt(request.getParameter("doctorCommentNumber"));
        System.out.println(doctorCommentNumber + "못불러오나?");
        String doctorCommentText = request.getParameter("doctorCommentText");
        System.out.println(doctorCommentText + "이것도 못불러와?");
        
        // DTO에 수정된 정보 설정
        doctorCommentDTO.setDoctorCommentNumber(doctorCommentNumber);
        doctorCommentDTO.setDoctorCommentText(doctorCommentText);
        
        // 댓글 수정
        doctorBoardDAO.updateComment(doctorCommentDTO);
        
        // 수정 완료 후 해당 게시글 상세페이지로 이동
		System.out.println(request.getAttribute("medicalInfoNumber"));
        int medicalInfoNumber = Integer.parseInt((String)request.getAttribute("medicalInfoNumber"));
        result.setRedirect(true);
        result.setPath("/BoardListDetail.docbo?infoNumber=" + medicalInfoNumber);
        
        return result;
    }
}
