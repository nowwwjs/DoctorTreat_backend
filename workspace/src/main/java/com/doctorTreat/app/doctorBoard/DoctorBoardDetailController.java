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

public class DoctorBoardDetailController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");
		Result result = new Result();

		DoctorBoardDAO doctorBoardDAO = new DoctorBoardDAO();

		String infoNumberStr = request.getParameter("infoNumber");
		
		int infoNumber;
		try {
			infoNumber = Integer.parseInt(infoNumberStr);
		} catch (NumberFormatException e) {
			throw new ServletException("제발 됬으면");
		}

		System.out.println(infoNumber);
		
		List<DoctorCommentDTO> comments = doctorBoardDAO.showComment(infoNumber);

		DoctorBoardDTO doctorBoardDetail = doctorBoardDAO.searchByText(infoNumber);

		request.setAttribute("doctorBoardshowDetail", doctorBoardDetail);
		request.setAttribute("infoNumber", infoNumber);
		request.setAttribute("comments", comments);

	
		result.setRedirect(true);
		result.setPath("/app/board/boardDetailDoctor.jsp");

		return result;
	}
}