package com.doctorTreat.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.member.dao.MemberDAO;

public class MemberLoginOkController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {

      response.setContentType("text/html; charset=utf-8");

      MemberDTO memberDTO = new MemberDTO();
      MemberDAO memberDAO = new MemberDAO();

      memberDTO.setMemberId(request.getParameter("memberId"));
      memberDTO.setMemberPw(request.getParameter("memberPw"));
      MemberDTO member = memberDAO.memberLogin(memberDTO);
      Result result = new Result();

      System.out.println("----------------");
      if ( member == null) {
         result.setPath("/user/memberLogin.jsp");
         result.setRedirect(false);
      } else {
          HttpSession session = request.getSession();
          session.setAttribute("userType", "member");
          session.setAttribute("memberNumber", member.getMemberNumber());   

         result.setPath(request.getContextPath() + "/index.jsp");
         result.setRedirect(true);
      }
       return result;

   }
}
