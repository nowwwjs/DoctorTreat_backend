package com.doctorTreat.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.member.dao.MemberDAO;

public class MemberJoinOkController implements Execute {
   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

	  request.setCharacterEncoding("UTF-8");
	   
      MemberDTO memberDTO = new MemberDTO();
      MemberDAO memberDAO = new MemberDAO();
      Result result = new Result();

      // 회원 정보 셋팅
      memberDTO.setMemberId(request.getParameter("memberId"));
      memberDTO.setMemberPw(request.getParameter("memberPw"));
      memberDTO.setMemberName(request.getParameter("memberName"));
      memberDTO.setMemberBirth(request.getParameter("memberBirth"));
      memberDTO.setMemberPhone(request.getParameter("memberPhone"));
      memberDTO.setAddressPostal(request.getParameter("addressPostal"));
      memberDTO.setAddressAddress(request.getParameter("addressAddress"));
      memberDTO.setAddressDetail(request.getParameter("addressDetail"));

      // 주소 입력 및 해당 주소 번호 받기
      Integer addressNumber = memberDAO.inputAddress(memberDTO);
      if (addressNumber != null) {
         memberDTO.setAddressNumber(addressNumber);
         memberDAO.inputMember(memberDTO);

         // 회원가입 완료 페이지로 리다이렉트
         result.setRedirect(true);
         result.setPath(request.getContextPath() + "/app/user/memberJoinFinish.jsp");

         return result;
      }
      
      return result;
   }
}
