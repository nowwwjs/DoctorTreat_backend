package com.doctorTreat.app.memberMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;

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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
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
	        
	    case "/memberMypage/memberPwOk.mm":
	    	String memberPwOkNumber = request.getParameter("memberNumber");
	    	request.getSession().setAttribute("memberPwOkNumber", memberPwOkNumber);
	    	result = new MemberPwOkController().execute(request, response);
	        request.getRequestDispatcher("app/myPage/memberPwOk.jsp").forward(request, response);
	    }
	    
	    	
	    
	}

}
