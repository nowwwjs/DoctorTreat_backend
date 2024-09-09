package com.doctorTreat.app.doctor;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;

public class DoctorLogoutOkController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, ServerException {
      System.out.println("로그아웃 실행");
      HttpSession session = request.getSession();
      session.invalidate();
      System.out.println("로그아웃 완료");
      Result result = new Result();
      
      
      result.setRedirect(true);
      result.setPath("/index.jsp");
      
      return result;
   }

}