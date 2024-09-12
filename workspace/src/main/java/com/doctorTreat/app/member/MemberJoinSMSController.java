package com.doctorTreat.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.SMS_Service;

public class MemberJoinSMSController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String phoneNumber = request.getParameter("phoneNumber");
		SMS_Service smsService = new SMS_Service();
		try {
			String verificationCode = smsService.sendVerificationSms(phoneNumber);
			// 세션에 인증 코드 저장
			HttpSession session = request.getSession();
			session.setAttribute("verificationCode", verificationCode);
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write("인증번호가 발송되었습니다.");
		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("SMS 발송 실패: " + e.getMessage());
		}
		return null; // AJAX 요청을 처리하므로 null을 반환

	}

}
