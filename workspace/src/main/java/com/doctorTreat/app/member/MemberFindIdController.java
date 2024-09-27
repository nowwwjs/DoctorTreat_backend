package com.doctorTreat.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.member.dao.MemberDAO;

public class MemberFindIdController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
      
      request.setCharacterEncoding("UTF-8");
      Result result = new Result();

      MemberDAO memberDAO = new MemberDAO();

      MemberDTO memberDTO = new MemberDTO();

      String phoneNumber = request.getParameter("phoneNum2");
      
      System.out.println(phoneNumber + "으아ㅏ");

      memberDTO = memberDAO.findId2(phoneNumber);

      System.out.println("안뇽" + memberDTO);

      request.setAttribute("membershowId", memberDTO);

      result.setRedirect(true);

      return result;
   }

}
