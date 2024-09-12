package com.doctorTreat.app.memberMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.memberMypage.dao.MemberMypageDAO;

public class MemberOutOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
	        throws IOException, ServletException {
	    
	    MemberDTO memberDTO = new MemberDTO();
	    MemberMypageDAO membermypageDAO = new MemberMypageDAO();
	    Result result = new Result();

	    // 파라미터로부터 아이디와 비밀번호 가져오기
	    String memberId = request.getParameter("memberId");
	    String memberPw = request.getParameter("memberPw");

	    memberDTO.setMemberId(memberId);
	    memberDTO.setMemberPw(memberPw);
		
	    
	    return result;
	    

	    
	
	
	}
}
