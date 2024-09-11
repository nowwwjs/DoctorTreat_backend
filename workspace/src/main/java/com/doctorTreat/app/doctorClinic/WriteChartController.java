package com.doctorTreat.app.doctorClinic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorClinic.dao.DoctorClinicDAO;
import com.doctorTreat.app.dto.ChartDTO;

public class WriteChartController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");

		System.out.println("세션 가져오는중");
		// false를 넣으면 값을 세션이 없을때 null을 반환
		// 매개변수를 넣지 않으면 세션이 없을때 세션을 만들어서 반환
		HttpSession session = request.getSession(false);
		System.out.println("세션 : " + session);

		// 세션에 있는 회원번호 형변환 하여 저장.
		int doctorNumber = (int) session.getAttribute("doctorNumber");
		System.out.println("의사번호 : " + doctorNumber);

		// 선택한 환자정보
		int memberNumber = Integer.valueOf(request.getParameter("memberNumber"));
		System.out.println("환자 번호 : " + memberNumber);

		// 쿼리로 DTO에 JSP로 보낼 값 저장
		DoctorClinicDAO doctorClinicDAO = new DoctorClinicDAO();
		Map<String, Object> queryMap = new HashMap<>();
		queryMap.put("doctorNumber", doctorNumber);
		queryMap.put("memberNumber", memberNumber);
		List<ChartDTO> chart = doctorClinicDAO.getChartInfo(queryMap);
		System.out.println(chart);

		// JSP 로 셋팅
		request.setAttribute("chart", chart);

		// 결과처리
		Result result = new Result();
		result.setRedirect(true);
		result.setPath("/app/clinic/writeChart.jsp");
		return result;
	}
}
