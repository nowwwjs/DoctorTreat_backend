package com.doctorTreat.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.member.dao.MemberDAO;

public class MemberLoginOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		response.setContentType("text/html; charset=utf-8");
		
		MemberDTO memberDTO = new MemberDTO();
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO member = null;
		
		memberDTO.setMemberId(request.getParameter("memberId"));
		memberDTO.setMemberPw(request.getParameter("memberPw"));
		
		member = memberDAO.memberLogin(memberDTO);
		
		if(member == null) {
			String 
		}
		
		
		
		
		
		
		
		
		
		
		return null;
	}

}
