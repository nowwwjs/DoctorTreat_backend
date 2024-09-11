package com.doctorTreat.app.memberMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.memberMypage.dao.MemberMypageDAO;

public class MemberPwOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		  // 인코딩 설정
	      request.setCharacterEncoding("UTF-8");

	      // DTO와 DAO 객체 생성
	      MemberDTO memberDTO = new MemberDTO();
	      MemberMypageDAO membermypageDAO = new MemberMypageDAO();
	      Result result = new Result();

	      // 쿼리실행
	      System.out.println("memberDTO" + memberDTO);

	      String memberName = request.getParameter("memberName");
	      String memberPassword = request.getParameter("memberPw");



	      System.out.println("나닷!"+ memberDTO);
	      boolean outCome = membermypageDAO.checkPw(memberName,memberPassword);
	      
	      
	      
	      System.out.println(outCome);

	      if (outCome == true) {
	         result.setRedirect(true);
	         result.setPath("/myPage/memberUpdate.jsp");
	      } else {
	         result.setRedirect(false);
	         result.setPath("/myPage/memberInfo.jsp");
	      }

        

        return result;
	}

}
