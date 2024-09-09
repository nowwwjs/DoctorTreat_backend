package com.doctorTreat.app.doctor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.DoctorDTO;

/**
 * Servlet implementation class MemberFrontController
 */
public class DoctorFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoctorFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(target);
		Result result = null;

		switch (target) {
		case "/doctor/doctorJoin.do":
			request.getRequestDispatcher("/app/user/doctorJoin.jsp").forward(request, response);
			System.out.println("의사 회원가입 중");
			break;

		case "/doctor/doctorJoinOk.do":
			result = new DoctorJoinOkController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

		case "/doctor/doctorLogin.do":
			System.out.println("의사로그인중");
			request.getRequestDispatcher("/app/user/doctorLogin.jsp").forward(request, response);
			break;

		case "/doctor/doctorLoginOk.do":
			System.out.println("의사 로그인 완료");
			result = new DoctorLoginOkController().execute(request, response);
			if (result.isRedirect()) {
				response.sendRedirect(result.getPath());
			} else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);
			}
			break;
		case "/doctor/doctorLogout.do":
			System.out.println("의사 로그아웃");
			result = new DoctorLogoutOkController().execute(request, response);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			break;
		 case "/doctor/doctorInfo.do":
	            // doctorInfo.do로 요청이 들어오면 세션에 저장된 로그인된 의사 정보를 JSP로 전달
	            DoctorDTO doctorInfo = (DoctorDTO) request.getSession().getAttribute("loggedDoctor");
	            if (doctorInfo != null) {
	                request.setAttribute("doctorInfo", doctorInfo);
	                request.getRequestDispatcher("/app/myPage/doctorInfo.jsp").forward(request, response);
	            } else {
	                response.sendRedirect("/doctor/doctorLogin.do");
	            }
	            break;

		}
	}
}
