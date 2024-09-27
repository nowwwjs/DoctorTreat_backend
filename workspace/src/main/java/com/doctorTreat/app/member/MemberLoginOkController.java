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

      if (member == null) {
          response.getWriter().print("<script>alert('아이디 또는 비밀번호를 다시 입력해주세요.'); location.href='http://localhost:9000/member/memberLogin.me';</script>");
          response.getWriter().flush();
      } else {
          HttpSession session = request.getSession();
          session.setAttribute("userType", "doctor");
          session.setAttribute("memberNumber", member.getMemberNumber());

<<<<<<< HEAD
          result.setPath(request.getContextPath() + "/index.main");   
          result.setRedirect(true);
=======
         result.setPath(request.getContextPath() + "/index.main");
         result.setRedirect(true);
>>>>>>> main
      }
      return result;
  }
}
