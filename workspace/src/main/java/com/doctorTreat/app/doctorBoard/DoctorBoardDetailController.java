package com.doctorTreat.app.doctorBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorBoard.dao.DoctorBoardDAO;
import com.doctorTreat.app.dto.DoctorBoardDTO;

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
			throw new ServletException("infoNumber 파라미터가 유효한 정수가 아닙니다.");
		}

		System.out.println(infoNumber);

		DoctorBoardDTO doctorBoardDetail = doctorBoardDAO.searchByText(infoNumber);

		request.setAttribute("doctorBoardshowDetail", doctorBoardDetail);
		request.setAttribute("infoNumber", infoNumber);

		// 포워딩 경로 설정
		result.setRedirect(true); // 리다이렉트가 아닌 포워딩을 사용
		result.setPath("/app/board/boardDetailDoctor.jsp");

		return result;
	}
}