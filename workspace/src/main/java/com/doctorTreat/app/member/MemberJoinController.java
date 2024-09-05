package com.doctorTreat.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.member.dao.MemberDAO;

public class MemberJoinController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		MemberDTO memberDTO = new MemberDTO();
		MemberDAO memberDAO = new MemberDAO();
		Result result = new Result();
		
	      memberDTO.setMemberId(request.getParameter("memberId"));
	      memberDTO.setMemberPassword(request.getParameter("memberPassword"));
	      memberDTO.setMemberName(request.getParameter("memberName"));
	      memberDTO.setMemberBirth(request.getParameter("memberBirth"));
	      memberDTO.setMemberPhone(request.getParameter("memberPhone"));
	      memberDTO.setMemberPostcode(request.getParameter("memberPostcode"));
	      memberDTO.setMemberAddress(request.getParameter("memberAddress"));
	      memberDTO.setMemberAddress1(request.getParameter("memberAddress1"));
	      
	      System.out.println("MemberDTO : " + memberDTO);
	      
	      memberDAO.join(memberDTO);
	      
	      result.setRedirect(true);
	      result.setPath(request.getContextPath() + "/user/memberjoin.jsp");
	      
		return result;
	}

}
