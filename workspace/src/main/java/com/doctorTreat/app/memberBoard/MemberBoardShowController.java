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

		// 세션으로 넘버 가져오기
		String sessionNumber = (String) request.getSession().getAttribute("medicalInfoNumber");
		int medicalInfoNumber = Integer.valueOf(sessionNumber);
		
		// 넘버를 통해 해당하는 글과 제목 넘기기
		memberBoardDTO = memberBoardDAO.show(medicalInfoNumber);
		request.setAttribute("memberBoardShowPage", memberBoardDTO);

		result.setRedirect(true);

		return result;
	}

}
