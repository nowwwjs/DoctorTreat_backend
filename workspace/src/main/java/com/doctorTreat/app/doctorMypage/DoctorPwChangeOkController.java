package com.doctorTreat.app.doctorMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorPwChangeOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// 인코딩 설정
		request.setCharacterEncoding("utf-8");

		Result result = new Result();
		DoctorDAO doctorDAO = new DoctorDAO();

		// 세션에서 의사 ID 가져오기
		HttpSession session = request.getSession();
		String doctorId = (String) session.getAttribute("doctorId");

		// 새로운 비밀번호 가져오기
		String newDoctorPw = request.getParameter("newDoctorPw");

		// DTO에 설정
		DoctorDTO doctorDTO = new DoctorDTO();
		doctorDTO.setDoctorId(doctorId);
		doctorDTO.setDoctorPw(newDoctorPw);
		System.out.println("값 확인");

		// 비밀번호 변경
		doctorDAO.updatePassword(doctorDTO);

		// 결과 페이지 설정
		result.setPath("/app/myPage/doctorInfo.jsp");
		result.setRedirect(true);

		return result;
	}
}
