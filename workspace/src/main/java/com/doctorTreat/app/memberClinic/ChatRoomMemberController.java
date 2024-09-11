package com.doctorTreat.app.memberClinic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;

public class ChatRoomMemberController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
//		로그인정보 담기
		System.out.println("세션 가져오는중");
		// false를 넣으면 값을 세션이 없을때 null을 반환
		// 매개변수를 넣지 않으면 세션이 없을때 세션을 만들어서 반환
		HttpSession session = request.getSession(false);
		System.out.println("세션 : " + session);
		
		System.out.println("현재회원 회원번호 : " + session.getAttribute("memberNumber"));
		//세션에 있는 회원번호 형변환 하여 저장.
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");
		System.out.println("형변환 회원번호 : " + memberNumber);
		
		
		// 결과 처리
		Result result = new Result();
		result.setRedirect(true);
		result.setPath("/app/clinic/chatRoomMember.jsp");
		return result;
	}

}
