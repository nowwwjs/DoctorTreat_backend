package com.doctorTreat.app.memberMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorMypage.DoctorOutOkController;

/**
 * Servlet implementation class MemberMypageFrontController
 */
public class MemberMypageFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberMypageFrontController() {
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
	    Result result = new Result();
	    switch(target) {
	    case "/memberMypage/memberInfo.mm":
	    	 String memberNumber = request.getParameter("memberNumber");
	         request.getSession().setAttribute("memberNumber", memberNumber);
	         result = new MemberInfoController().execute(request, response);
	         request.getRequestDispatcher("/app/myPage/memberInfo.jsp").forward(request, response);
	         break;
	         
	    case "/memberMypage/memberPw.mm":
	         System.out.println("확인1");
	         request.getRequestDispatcher("/app/myPage/memberPwOk.jsp").forward(request, response);
	         break;
	         
	    case "/memberMypage/memberPwOk.mm":
	    	  System.out.println("확인2");
	          String memberPwNumber = request.getParameter("memberNumber");
	          request.getSession().setAttribute("memberPwNumber", memberPwNumber);
	          result = new MemberPwOkController().execute(request, response);
	          break;      
	    case "/memberMypage/memberOut.mm":
	    	System.out.println("확인3");
	    	request.getRequestDispatcher("/app/myPage/memberOut.jsp").forward(request, response);
	    	break;
	    	
	    case "/memberMypage/memberOutOk.mm":
	    	System.out.println("회원탈퇴처리중...");
	    	result = new MemberOutOkController().execute(request, response);
            request.getRequestDispatcher(result.getPath()).forward(request, response);
            break;
	    	
	    }
	}
}
