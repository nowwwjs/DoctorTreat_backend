package com.doctorTreat.app.memberMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.memberMypage.dao.MemberMypageDAO;

public class MemberInfoController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");

		MemberDTO memberDTO = new MemberDTO();
		MemberMypageDAO membermypageDAO = new MemberMypageDAO();
		Result result = new Result();
		String sessionNumber = (String) request.getSession().getAttribute("memberNumber");

		int memNumber = Integer.valueOf(sessionNumber);

		memberDTO = membermypageDAO.showInfo(memNumber);

		System.out.println("일반회원마이페이지 입성");

		request.setAttribute("memberShowInfo", memberDTO);

		result.setRedirect(true);

		return result;

	}

}
