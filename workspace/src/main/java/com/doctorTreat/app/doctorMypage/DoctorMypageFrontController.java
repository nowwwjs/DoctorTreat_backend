package com.doctorTreat.app.doctorMypage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;

/**
 * Servlet implementation class MemberFrontController
 */
public class DoctorMypageFrontController extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#HttpServlet()
    */
   public DoctorMypageFrontController() {
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

<<<<<<< HEAD
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(target);
		Result result = null;
		
		
		
		switch(target) {
		case "/doctor/doctorInfo.dm":
			System.out.println("나 여기까지 왔어요");
			
			 
	         // medicalInfoNumber 값을 세션에 저장
	         String doctorNumber = request.getParameter("doctorNumber");
	         request.getSession().setAttribute("doctorNumber", doctorNumber);
			
			result = new DoctorInfoOkController().execute(request, response);
			request.getRequestDispatcher("/app/myPage/doctorInfo.jsp").forward(request, response);
			break;
			
		case "/doctor/doctorPw.dm":
			System.out.println("안뇽하세요");
			request.getRequestDispatcher("/app/myPage/doctorPwOk.jsp").forward(request, response);
			break;
			
		case "/doctor/doctorPwOk.dm":
		    System.out.println("나 여기 또 왔어요");

		    // medicalInfoNumber 값을 세션에 저장
		    String doctorPwNumber = request.getParameter("doctorNumber");
		    request.getSession().setAttribute("doctorPwNumber", doctorPwNumber);
		    result = new DoctorPwOkController().execute(request, response);	    
		    break;
		    
		case "/doctor/doctorOut.dm":
=======
   protected void doProcess(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      String target = request.getRequestURI().substring(request.getContextPath().length());
      System.out.println(target);
      Result result = null;
      
      
      
      switch(target) {
      case "/doctor/doctorInfo.dm":
         System.out.println("나 여기까지 왔어요");
         
          
            // medicalInfoNumber 값을 세션에 저장
            String doctorNumber = request.getParameter("doctorNumber");
            request.getSession().setAttribute("doctorNumber", doctorNumber);
         
         result = new DoctorInfoOkController().execute(request, response);
         request.getRequestDispatcher("/app/myPage/doctorInfo.jsp").forward(request, response);
         break;
         
      case "/doctor/doctorPw.dm":
         System.out.println("안뇽하세요");
         request.getRequestDispatcher("/app/myPage/doctorPwOk.jsp").forward(request, response);
         break;
         
      case "/doctor/doctorPwOk.dm":
          System.out.println("나 여기 또 왔어요");

          // medicalInfoNumber 값을 세션에 저장
          String doctorPwNumber = request.getParameter("doctorNumber");
          request.getSession().setAttribute("doctorPwNumber", doctorPwNumber);
          result = new DoctorPwOkController().execute(request, response);       
          break;
          
      case "/doctor/doctorOut.dm":
>>>>>>> 944d97b840fd54622e002dcf21815fcdfc7e9aed
            System.out.println("탈퇴 페이지로 이동");
            request.getRequestDispatcher("/app/myPage/doctorOut.jsp").forward(request, response);
            break;

        case "/doctor/doctorOutOk.dm":  // 회원 탈퇴 요청 처리
            System.out.println("회원 탈퇴 처리 중...");
<<<<<<< HEAD
=======
            
>>>>>>> 944d97b840fd54622e002dcf21815fcdfc7e9aed
            result = new DoctorOutOkController().execute(request, response);
            request.getRequestDispatcher(result.getPath()).forward(request, response);
            break;
    }
}

}
