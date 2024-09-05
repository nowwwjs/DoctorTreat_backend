package com.doctorTreat.app.memberClinic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;

/**
 * Servlet implementation class ClinicFrontController
 */
public class MemberClinicFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberClinicFrontController() {
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
		System.out.println("의사 비대면진료 시작");

		// 전체 URI에서 ContextPath를 제외시킨 부분만 변수에 저장(분기처리할 때 비교할 변수로 사용)
		String target = request.getRequestURI().substring(request.getContextPath().length());
//	      System.out.println(target);

//	      Result result = null; // Result 클래스 객체

		Result result = new Result();
		switch (target) {
		case "/doctorListEar.memcl":
//	    	 new DoctorListController().execute(request, response);
//	    	 response.sendRedirect(request.getContextPath());
			result = new DoctorListController().execute(request, response);
			// 기타 case 처리
			if (result != null) {
				if (result.isRedirect()) {
					response.sendRedirect(result.getPath());
				} else {
					request.getRequestDispatcher(result.getPath()).forward(request, response);
				}
			}
			break;
		case "/doctorListInner.memcl":
			request.getRequestDispatcher("/app/clinic/doctorListInner.jsp").forward(request, response);
			break;
		case "/app/clinic/doctorDetail.memcl":
			request.getRequestDispatcher("/app/clinic/doctorDetail.jsp").forward(request, response);
			break;
		case "/chatListMember.memcl":
			request.getRequestDispatcher("/app/clinic/chatListMember.jsp").forward(request, response);
			break;
		case "/app/clinic/chatRoomMember.memcl":
			request.getRequestDispatcher("/app/clinic/chatRoomMember.jsp").forward(request, response);
			break;
		}

//	      if (result != null) {
//	         if (result.isRedirect()) {
//	            response.sendRedirect(result.getPath());
//	         } else {
//	            request.getRequestDispatcher(result.getPath()).forward(request, response);
//	         }
//	      }
	}
}
