package com.doctorTreat.app.memberClinic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;

public class ChatListMemberController implements Execute{
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");
		
		
//		결과처리
        Result result = new Result();
        result.setRedirect(true);
        result.setPath("/app/clinic/chatListMember.jsp");
        return result;
	}
}
