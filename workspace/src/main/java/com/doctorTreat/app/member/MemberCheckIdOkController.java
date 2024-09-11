package com.doctorTreat.app.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.member.dao.MemberDAO;

public class MemberCheckIdOkController implements Execute {
	

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {

      MemberDAO memberDAO = new MemberDAO();
      boolean isTrue = memberDAO.checkId(request.getParameter("memberId"));
        String resultMsg = "";
      String result = null;

      System.out.println("======================");
      

      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();

      System.out.println(request.getParameter("memberId"));

      if (isTrue) {
         resultMsg = "사용가능";
      } else {
         resultMsg = "중복된 아이디";
      }

      out.print(resultMsg);
      out.close();

      return null;
   }

}