package com.doctorTreat.app.memberClinic;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.ChartDTO;
import com.doctorTreat.app.memberClinic.dao.MemberClinicDAO;

public class ChartController implements Execute {
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
		System.out.println("현재회원 회원번호 : " + session.getAttribute("memberNumber"));
		//세션에 있는 회원번호 형변환 하여 저장.
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");
		System.out.println("형변환 회원번호 : " + memberNumber);
		
		//처방전에 들어갈 정보 조회 쿼리
		MemberClinicDAO memberClinicDAO = new MemberClinicDAO();
		List<ChartDTO> chart = memberClinicDAO.getChart(memberNumber);
		System.out.println("처방전 불러오기 성공 \n" + chart);
		
		//처방전 jsp로 보내기
		request.setAttribute("chart", chart);
		
		//결과처리
		Result result = new Result();
		result.setRedirect(false);
		result.setPath("/app/clinic/chart.jsp");
		return result;
	}
}
