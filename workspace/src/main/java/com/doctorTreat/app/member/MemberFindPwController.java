package com.doctorTreat.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.member.dao.MemberDAO;

public class MemberFindPwController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
	      
	      request.setCharacterEncoding("UTF-8");
	      Result result = new Result();

	      MemberDAO memberDAO = new MemberDAO();

	      MemberDTO memberDTO = new MemberDTO();

	   // request에서 memberName, memberId 파라미터 가져오기
	        String memberName = request.getParameter("memberName");
	        String memberId = request.getParameter("memberId");
	        
	        System.out.println(memberName);
	        System.out.println(memberId);

	        // DAO의 findPw 메서드를 호출해서 비밀번호 확인
	        memberDTO = memberDAO.findPw2(memberName,memberId);

	        System.out.println(memberDTO + "여기도 출력되니");
	        
	        request.setAttribute("membershowPw", memberDTO);
	        
	        result.setRedirect(false);

	        return result;

	}

}
