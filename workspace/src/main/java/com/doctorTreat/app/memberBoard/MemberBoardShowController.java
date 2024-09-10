package com.doctorTreat.app.memberBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberBoardDTO;
import com.doctorTreat.app.memberBoard.dao.MemberBoardDAO;

public class MemberBoardShowController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		Result result = new Result();

		MemberBoardDAO memberBoardDAO = new MemberBoardDAO();
		MemberBoardDTO memberBoardDTO = new MemberBoardDTO();

		String sessionNumber = (String) request.getSession().getAttribute("medicalInfoNumber");

		int medicalInfoNumber = Integer.valueOf(sessionNumber);

		memberBoardDTO = memberBoardDAO.show(medicalInfoNumber);

		System.out.println("어 뭐야" + memberBoardDTO);

		request.setAttribute("memberBoardShowPage", memberBoardDTO);

		result.setRedirect(true);

		return result;
	}

}
