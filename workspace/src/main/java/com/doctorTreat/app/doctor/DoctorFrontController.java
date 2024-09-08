package com.doctorTreat.app.doctor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;
import com.doctorTreat.app.memberClinic.ChatListMemberController;

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
      case "/doctor/doctorJoin.do":
         request.getRequestDispatcher("/app/user/doctorJoin.jsp").forward(request, response);
         System.out.println("회원가입 중");
         break;

      case "/doctor/doctorJoinOk.do":
  		result = new DoctorJoinController().execute(request, response);
		request.getRequestDispatcher(result.getPath()).forward(request, response);
		break;

      }
   }

}