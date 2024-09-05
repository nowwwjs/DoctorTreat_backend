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

public class DoctorListController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		// 페이지 처리 관련 변수
		int itemsPerPage = 5;
		int currentPage = request.getParameter("page") == null ? 1 : Integer.parseInt(request.getParameter("page"));
		int offset = (currentPage - 1) * itemsPerPage;

		// DAO 사용하여 데이터 가져오기
		MemberClinicDAO memberClinicDAO = new MemberClinicDAO();
		Result result = new Result();
		List<ClinicDoctorListDTO> doctorList = memberClinicDAO.getEarDoctors(offset, itemsPerPage);
		int totalItems = memberClinicDAO.getTotalEarDoctorCount();
		int maxPages = (int) Math.ceil((double) totalItems / itemsPerPage);

		// JSP로 데이터를 전달
		request.setAttribute("doctorList", doctorList);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("maxPages", maxPages);

		System.out.println("doctorList size: " + doctorList.size());
		System.out.println("currentPage: " + currentPage);
		System.out.println("maxPages: " + maxPages);
		
		// 결과 처리
		result.setRedirect(false);
		result.setPath(request.getContextPath() + "/clinic/doctorListEar.jsp");
		// 성공후 이동할 페이지 설정
		return result;
	}
}
