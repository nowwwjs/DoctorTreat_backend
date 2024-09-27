package com.doctorTreat.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.DoctorJoinSMSController;


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
      case "/member/memberJoin.me":
         request.getRequestDispatcher("/app/user/memberJoin.jsp").forward(request, response);
         System.out.println("회원가입 중");
         break;
      case "/member/memberJoinOk.me":
         result = new MemberJoinOkController().execute(request, response);
         request.getRequestDispatcher(result.getPath()).forward(request, response);
         System.out.println("회원가입 완료");
         break;
      case "/member/memberLogin.me":
         System.out.println("일반회원 로그인 중!!");
         request.getRequestDispatcher("/app/user/memberLogin.jsp").forward(request, response);
         break;
      // 회원 로그인 처리
      case "/member/memberLoginOk.me":
          System.out.println("일반회원 로그인 완료");
          result = new MemberLoginOkController().execute(request, response);
          if (result.isRedirect()) {
              response.sendRedirect(result.getPath());
          } else {
              request.getRequestDispatcher(result.getPath()).forward(request, response);
          }
          break;
      // 아이디 중복 체크
      case "/member/memberCheckIdOk.me":
          System.out.println("아이디 중복 체크!!");
          new MemberCheckIdOkController().execute(request, response);
          break;
      case "/member/memberLogout.me":
         System.out.println("회원 로그아웃");
         result = new MemberLogoutOkController().execute(request, response);
         request.getRequestDispatcher("/index.jsp").forward(request, response);
         break;
      case "/member/memberFindId.me":
         System.out.println("멤버 아이디 찾기 !");
         result = new MemberFindIdController().execute(request, response);
         request.getRequestDispatcher("/app/user/memberFindIdFinish.jsp").forward(request, response);
         break;
         
      case "/member/memberFindPw.me" :
    	  System.out.println("비밀번호 찾기 중 !!");
    	  System.out.println(request);
    	  request.getRequestDispatcher("/app/user/memberFindPw.jsp").forward(request, response);
    	  break;
    	  
      case "/member/memberFindPwOk.me":
    	  System.out.println("비밀번호 찾기 완료!!");
    	  result = new MemberFindPwController().execute(request, response);
    	  request.getRequestDispatcher("/app/user/memberFindPwFinish.jsp").forward(request, response);
    	  break;

      case "/member/joinSMS.me":
         System.out.println("sms!!");
         new MemberJoinSMSController().execute(request, response);
         break;
      }
   }

}