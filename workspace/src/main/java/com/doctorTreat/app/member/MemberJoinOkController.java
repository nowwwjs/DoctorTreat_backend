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
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		//인코딩 설정 확인
		request.setCharacterEncoding("UTF-8");
		
		//MemberDTO와 DAO 객체 생성
		System.out.println(1);
		MemberDTO memberDTO = new MemberDTO();
		System.out.println(12);
		MemberDAO memberDAO = new MemberDAO();
//		Result result = new Result();
		System.out.println(123);
		
		//폼데이터 받아오기
		System.out.println(2);
        memberDTO.setMemberId(request.getParameter("memberId"));
        memberDTO.setMemberPw(request.getParameter("memberPw"));
        memberDTO.setMemberName(request.getParameter("memberName"));
        memberDTO.setMemberBirth(request.getParameter("memberBirth"));
        memberDTO.setMemberPhone(request.getParameter("memberPhone"));
        memberDTO.setAddressPostal(request.getParameter("addressPostal"));
        memberDTO.setAddressAddress(request.getParameter("addressAddress"));
        memberDTO.setAddressDetail(request.getParameter("addressDetail"));
        
        System.out.println(3);
        
        //디버깅용 로그 출력
        System.out.println("MemberDTO : " + memberDTO);
        
        
        //데이터베이스에 회원 정보 저장
        try {
			memberDAO.join(memberDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // 결과 처리
//        result.setRedirect(true);
//        result.setPath(request.getContextPath() + "/user/memberLogin.jsp");
		return null;
	}

}
