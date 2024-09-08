package com.doctorTreat.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.DoctorJoinController;

/**
 * Servlet implementation class MemberFrontController
 */
public class MemberFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(target);
		Result result = null;
		switch(target) {
		case "/member/memberJoin.me":
			request.getRequestDispatcher("/app/user/memberJoin.jsp").forward(request, response);
			System.out.println("회원가입 중");
			break;
		case "/member/memberJoinOk.me":
			result = new MemberJoinOkController().execute(request, response);
			request.getRequestDispatcher("/app/user/memberJoinFinish.jsp").forward(request, response);
		    System.out.println("회원가입 완료");
		    break;
		case "/memberlogin.me":
		     System.out.println("Login!!");
		     request.getRequestDispatcher("/app/user/memberLogin.jsp").forward(request, response);
		     break;	
		case "/member/memberLoginOk.me" :
			System.out.println("로그인 완료");
			
		}
	}

}
