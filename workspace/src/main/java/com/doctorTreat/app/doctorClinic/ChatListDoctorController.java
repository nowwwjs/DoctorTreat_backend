package com.doctorTreat.app.doctorClinic;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.doctorClinic.dao.DoctorClinicDAO;

public class ChatListDoctorController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");
//		로그인정보 담기
		System.out.println("세션 가져오는중");
		// false를 넣으면 값을 세션이 없을때 null을 반환
		// 매개변수를 넣지 않으면 세션이 없을때 세션을 만들어서 반환
		HttpSession session = request.getSession(false);
		System.out.println("세션 : " + session);

		System.out.println("현재의사 의사번호 : " + session.getAttribute("doctorNumber"));
		// 세션에 있는 회원번호 형변환 하여 저장.
		Integer doctorNumber = (Integer) session.getAttribute("doctorNumber");
		System.out.println("형변환 의사번호 : " + doctorNumber);

		//페이지 처리 관련 변수
		int itemsPerPage = 5; // 페이지당 항목 수
		int currentPage = request.getParameter("page") == null ? 1 : Integer.parseInt(request.getParameter("page"));

		// DAO 사용하여 전체 데이터 가져오기
		DoctorClinicDAO doctorClinicDAO = new DoctorClinicDAO();
		List<MemberDTO> allMemberList = doctorClinicDAO.getChatMembers(doctorNumber); // DB에서 환자 리스트 가져오기
		int totalItems = allMemberList.size(); // 전체 항목 수
		int maxPages = (int) Math.ceil((double) totalItems / itemsPerPage); // 전체 페이지 수 계산

		// 현재 페이지에 표시할 데이터만 추출
		int start = (currentPage - 1) * itemsPerPage;
		int end = Math.min(start + itemsPerPage, totalItems);
		List<MemberDTO> memberList = allMemberList.subList(start, end);

		// 페이지네이션 범위 설정 (5페이지씩 표시)
		int pageBlockSize = 5;
		int startPage = ((currentPage - 1) / pageBlockSize) * pageBlockSize + 1;
		int endPage = Math.min(startPage + pageBlockSize - 1, maxPages);

		// JSP로 데이터를 전달
		request.setAttribute("memberList", memberList);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("maxPages", maxPages);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);

		// 결과 처리
		Result result = new Result();
		result.setRedirect(false);
		result.setPath("/app/clinic/chatListDoctor.jsp");
		return result;
	}
}
