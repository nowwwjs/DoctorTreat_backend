package com.doctorTreat.app.memberClinic;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.ClinicDoctorListDTO;
import com.doctorTreat.app.memberClinic.dao.MemberClinicDAO;

public class InnerDoctorListController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");

		// 페이지 처리 관련 변수
		int itemsPerPage = 5; // 페이지당 항목 수
		int currentPage = request.getParameter("page") == null ? 1 : Integer.parseInt(request.getParameter("page"));

		// DAO 사용하여 전체 데이터 가져오기
		MemberClinicDAO memberClinicDAO = new MemberClinicDAO();
		List<ClinicDoctorListDTO> allDoctorList = memberClinicDAO.getInnerDoctors(); // 전체 리스트 조회
		int totalItems = allDoctorList.size(); // 전체 항목 수
		int maxPages = (int) Math.ceil((double) totalItems / itemsPerPage); // 전체 페이지 수 계산

		// 현재 페이지에 표시할 데이터만 추출
		int start = (currentPage - 1) * itemsPerPage;
		int end = Math.min(start + itemsPerPage, totalItems);
		List<ClinicDoctorListDTO> doctorList = allDoctorList.subList(start, end);

		// 페이지네이션 범위 설정 (5페이지씩 표시)
		int pageBlockSize = 5;
		int startPage = ((currentPage - 1) / pageBlockSize) * pageBlockSize + 1;
		int endPage = Math.min(startPage + pageBlockSize - 1, maxPages);

		// JSP로 데이터를 전달
		request.setAttribute("doctorList", doctorList);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("maxPages", maxPages);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);

		// 결과 처리
		Result result = new Result();
		result.setRedirect(false);
		result.setPath("/app/clinic/doctorListInner.jsp");
		return result;
	}
}
