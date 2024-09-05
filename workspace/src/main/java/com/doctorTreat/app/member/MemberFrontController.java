package com.doctorTreat.app.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		switch(target) {
		case "/memberjoin.me":
			request.getRequestDispatcher("/app/user/memberjoin.jsp").forward(request, response);
			System.out.println("회원가입 중");
			break;
		case "/memberjoinOk.me":
			System.out.println("회원가입 완료");
			break;
		case "/memberlogin.me":
<<<<<<< HEAD
			System.out.println("login!!");
			request.getRequestDispatcher("/app/user/memberlogin.jsp").forward(request, response);
=======
		     System.out.println("login!!");
		     request.getRequestDispatcher("/app/user/memberlogin.jsp").forward(request, response);
		     break;	
		case "/memberloginOk.me" :
			System.out.println("로그인 완료");
>>>>>>> main
			break;
		}
	}

}
