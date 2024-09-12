package com.doctorTreat.app.memberMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.memberMypage.dao.MemberMypageDAO;

public class MemberPwOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		  // 인코딩 설정
	      request.setCharacterEncoding("UTF-8");

	      Result result = new Result();
	        MemberMypageDAO memberMypageDAO = new MemberMypageDAO();
	        
	        System.out.println("컨트롤러 통과");

	        // 폼에서 입력된 회원 아이디와 비밀번호를 가져옴
	        String memberId = request.getParameter("memberId");
	        String memberPw = request.getParameter("memberPw");
	        
	        System.out.println(memberId);
	        System.out.println(memberPw);
	        
	        // DAO를 사용하여 비밀번호가 일치하는지 확인
	        boolean isPwCorrect = memberMypageDAO.checkPw(memberId, memberPw);

	        if (isPwCorrect) {
	            // 비밀번호가 맞으면 memberupdate.jsp로 이동
	        	System.out.println("비밀번호 일치");
	        	request.getRequestDispatcher("/app/myPage/memberUpdate.jsp").forward(request, response);
	        } else {
	            // 비밀번호가 틀리면 memberinfo.jsp로 이동
	        	System.out.println("비밀번호 불일치");
	        	request.getRequestDispatcher("/app/myPage/memberInfo.jsp").forward(request, response);
	        }

	        result.setRedirect(false); // forward 방식으로 페이지 이동
	        return result;
	}

}
