package com.doctorTreat.app.memberBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberBoardDTO;
import com.doctorTreat.app.memberBoard.dao.MemberBoardDAO;

public class MemberBoardUpdateController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		Result result = new Result();

		System.out.println("무임");

		MemberBoardDAO memberBoardDAO = new MemberBoardDAO();


		// 폼에서 전달된 데이터 가져오기
		String updateTitle = request.getParameter("updateTitle");
		String updateText = request.getParameter("updateText");
		String sessionNumber = (String) request.getSession().getAttribute("medicalInfoNumber");
		
		int medicalInfoNumber = Integer.valueOf(sessionNumber); 
		
		System.out.println(medicalInfoNumber);

		/* memberBoardDAO.update(updateTitle , updateText , medicalInfoNumber); */

		// 결과 설정
		result.setRedirect(true);

		return result;
	}

}
