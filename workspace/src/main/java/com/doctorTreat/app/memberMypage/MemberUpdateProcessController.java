package com.doctorTreat.app.memberMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.memberMypage.dao.MemberMypageDAO;

public class MemberUpdateProcessController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// 인코딩 설정
		request.setCharacterEncoding("UTF-8");

		MemberMypageDAO membermypageDAO = new MemberMypageDAO();
		MemberDTO memberDTO = new MemberDTO();

		// 세션에서 memberNumber 가져오기
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		// memberNumber가 세션에서 가져온 값인지 확인
		if (memberNumber == null) {
			// 세션에 memberNumber가 없으면 로그인 페이지로 리다이렉트
			Result result = new Result();
			result.setPath(request.getContextPath() + "/app/user/memberLogin.jsp");
			result.setRedirect(true);
			return result;
		}

		// 폼 데이터 가져오기
		String memberName = request.getParameter("memberName");
		String memberBirth = request.getParameter("memberBirth");
		String memberPhone = request.getParameter("memberPhone");
		String addressPostal = request.getParameter("postalCode");
		String addressAddress = request.getParameter("address");
		String addressDetail = request.getParameter("detailAddress");

		// DTO에 데이터 설정
		memberDTO.setMemberNumber(memberNumber);
		memberDTO.setMemberName(memberName);
		memberDTO.setMemberBirth(memberBirth);
		memberDTO.setMemberPhone(memberPhone);
		memberDTO.setAddressPostal(addressPostal);
		memberDTO.setAddressAddress(addressAddress);
		memberDTO.setAddressDetail(addressDetail);


		// DB 업데이트 처리
		membermypageDAO.updateMemberInfo(memberDTO);
		

		// 업데이트 후 내 정보 페이지로 리다이렉트
		Result result = new Result();
		result.setPath(request.getContextPath() + "/memberMypage/memberInfo.mm");
		result.setRedirect(true); // 리다이렉트 설정

		return result;
	}

}
