package com.doctorTreat.app.doctor;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorJoinOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 인코딩 설정
		request.setCharacterEncoding("UTF-8");

		// DTO와 DAO 객체 생성
		DoctorDTO doctorDTO = new DoctorDTO();
		DoctorDAO doctorDAO = new DoctorDAO();
		Result result = new Result();

		doctorDTO.setDoctorId(request.getParameter("doctorId"));
		doctorDTO.setDoctorPw(request.getParameter("doctorPassword"));
		doctorDTO.setDoctorName(request.getParameter("doctorName"));
		doctorDTO.setDoctorPhone(request.getParameter("doctorPhoneNumber"));
		doctorDTO.setDoctorLicense(request.getParameter("doctorLicense"));
		doctorDTO.setDoctorMajor(request.getParameter("doctorMedicalSubject"));
		doctorDTO.setHospitalName(request.getParameter("doctorHospitalName"));
		doctorDTO.setHospitalCall(request.getParameter("doctorHospitalCall"));
		doctorDTO.setAddressPostal(request.getParameter("addressPostal"));
		doctorDTO.setAddressAddress(request.getParameter("addressAddress"));
		doctorDTO.setAddressDetail(request.getParameter("addressDetail"));

		// 쿼리 실행
		System.out.println(doctorDTO);
		doctorDAO.inputAddress(doctorDTO);
		doctorDAO.inputHospital(doctorDTO);
		doctorDAO.inputDoctor(doctorDTO);

		// 결과처리
		result.setRedirect(true);
		result.setPath("/app/user/doctorJoinFinish.jsp");

		return result;
	}
}
