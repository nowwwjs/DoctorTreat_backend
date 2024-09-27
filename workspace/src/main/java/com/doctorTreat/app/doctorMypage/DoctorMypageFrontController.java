package com.doctorTreat.app.doctorMypage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Result;

public class DoctorMypageFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DoctorMypageFrontController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 세션에서 로그인 여부 확인 (세션이 없거나 로그인 정보가 없으면 로그인 페이지로 리다이렉트)
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("doctorNumber") == null) {
			System.out.println("로그인되지 않음. 로그인 페이지로 이동.");
			response.sendRedirect(request.getContextPath() + "/app/user/doctorLogin.jsp");
			return;
		}

		// 로그인 되어 있을 때 요청 처리
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("요청 경로: " + target);
		Result result = null;

		switch (target) {
		case "/doctor/doctorInfo.dm":
			System.out.println("doctorInfo 요청 처리 중...");
			result = new DoctorInfoOkController().execute(request, response);
			break;

		case "/doctor/doctorPw.dm":
			System.out.println("비밀번호 확인 페이지 요청 처리 중...");
			result = new Result();
			result.setPath("/app/myPage/doctorPwOk.jsp");
			result.setRedirect(false);
			break;

		case "/doctor/doctorPwOk.dm":
			System.out.println("비밀번호 확인 요청 처리 중...");
			result = new DoctorPwOkController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

		case "/doctor/doctorUpdateProcess.dm":
			result = new DoctorUpdateProcessController().execute(request, response);
			break;

<<<<<<< HEAD
            case "/doctor/doctorOut.dm":
            	System.out.println("나 회원탈퇴야 !!");
                result = new DoctorOutOkController().execute(request, response);
                break;           
        }
=======
		case "/doctor/doctorOut.dm":
			System.out.println("나 회원탈퇴야 !!");
			result = new DoctorOutOkController().execute(request, response);
			break;
>>>>>>> main

		case "/doctor/doctorPwChangeOk.dm":
			System.out.println("비밀번호 변경 요청 처리 중...");

			result = new DoctorPwChangeOkController().execute(request, response);

			if (result.isRedirect()) {
				response.sendRedirect(result.getPath());
			} else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);
			}

			break;

		case "/doctor/doctorPwChangeGo.dm":
			request.getRequestDispatcher("/app/myPage/doctorPwChange.jsp").forward(request, response);
			break;
		}

		// 리다이렉트 또는 forward 처리
		if (result != null) {
			// 응답이 이미 커밋되지 않은 상태에서만 처리
			if (!response.isCommitted()) {
				if (result.isRedirect()) {
					response.sendRedirect(result.getPath());
				} else {
					request.getRequestDispatcher(result.getPath()).forward(request, response);
				}
			} else {
				System.out.println("응답이 이미 커밋되었습니다. 더 이상의 처리 불가.");
			}
		}
	}
}
