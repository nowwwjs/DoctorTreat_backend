package com.doctorTreat.app.doctor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;

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
         System.out.println("배부르다");
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
         
      case "/doctor/doctorCheckIdOk.do":
         System.out.println("아이디 체크!!");
         new DoctorCheckIdOkController().execute(request, response);
         break;
         
      case "/doctor/doctorFindId.do":
         System.out.println("아이디 찾기!");
         request.getRequestDispatcher("/app/user/doctorFindId.jsp").forward(request, response);
         break;
         
      case "/doctor/doctorFindIdOk.do":
          System.out.println("아이디 찾기 성공!!");
          new DoctorFindIdOkController().execute(request, response);
          request.getRequestDispatcher("/app/user/doctorFindIdFinish.jsp").forward(request, response);
          break;
         
      case "/doctor/joinSMS.do":
         System.out.println("sms!!");
         new DoctorJoinSMSController().execute(request, response);
         break;

      }
   }
}
