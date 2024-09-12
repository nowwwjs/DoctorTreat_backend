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

public class DoctorUpdateProcessController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// 인코딩 설정
		request.setCharacterEncoding("UTF-8");

		DoctorDAO doctorDAO = new DoctorDAO();
		DoctorDTO doctorDTO = new DoctorDTO();

		// 세션에서 doctorNumber 가져오기
		HttpSession session = request.getSession();
		Integer doctorNumber = (Integer) session.getAttribute("doctorNumber");

		// doctorNumber가 세션에서 가져온 값인지 확인
		if (doctorNumber == null) {
			// 세션에 doctorNumber가 없으면 로그인 페이지로 리다이렉트
			Result result = new Result();
			result.setPath(request.getContextPath() + "/app/user/doctorLogin.jsp");
			result.setRedirect(true);
			return result;
		}

		// 폼 데이터 가져오기
		String doctorName = request.getParameter("doctorName");
		String hospitalName = request.getParameter("hospitalName");
		String hospitalCall = request.getParameter("hospitalCall");
		String addressPostal = request.getParameter("postalCode");
		String addressAddress = request.getParameter("address");
		String addressDetail = request.getParameter("detailAddress");

		// DTO에 데이터 설정
		doctorDTO.setDoctorNumber(doctorNumber);
		doctorDTO.setDoctorName(doctorName);
		doctorDTO.setHospitalName(hospitalName);
		doctorDTO.setHospitalCall(hospitalCall);
		doctorDTO.setAddressPostal(addressPostal);
		doctorDTO.setAddressAddress(addressAddress);
		doctorDTO.setAddressDetail(addressDetail);

		// DB 업데이트 처리
		doctorDAO.updateDoctorInfo(doctorDTO);

		// 업데이트 후 내 병원 정보 페이지로 리다이렉트
		Result result = new Result();
		result.setPath(request.getContextPath() + "/doctor/doctorInfo.dm");
		result.setRedirect(true); // 리다이렉트 설정

		return result;
	}
}
