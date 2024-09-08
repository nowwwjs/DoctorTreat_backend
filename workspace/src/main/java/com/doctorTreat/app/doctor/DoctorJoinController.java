package com.doctorTreat.app.doctor;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorJoinController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 인코딩 설정
		request.setCharacterEncoding("UTF-8");

		// DTO와 DAO 객체 생성
		DoctorDTO doctorDTO = new DoctorDTO();
		DoctorDAO doctorDAO = new DoctorDAO();
		Result result = new Result();

		  String doctorNumber = request.getParameter("doctorNumber");
		  
	      if (doctorNumber != null && !doctorNumber.isEmpty()) {
	         doctorDTO.setAddressNumber(Integer.valueOf(doctorNumber));
	      }
	      
		doctorDTO.setDoctorId(request.getParameter("doctorId"));
		doctorDTO.setDoctorPw(request.getParameter("doctorPassword"));
		doctorDTO.setDoctorName(request.getParameter("doctorName"));
		doctorDTO.setDoctorPhone(request.getParameter("doctorPhoneNumber"));
		doctorDTO.setDoctorLicense(request.getParameter("doctorLicense"));
		doctorDTO.setDoctorMajor(request.getParameter("doctorMedicalSubject"));
		doctorDTO.setHospitalName(request.getParameter("doctorHospitalName"));
		doctorDTO.setAddressPostal(request.getParameter("addressPostal"));
		doctorDTO.setAddressAddress(request.getParameter("addressAddress"));
		doctorDTO.setAddressDetail(request.getParameter("addressDetail"));

		System.out.println(doctorDTO);

		try {
			// DAO 메서드 호출
			doctorDAO.joinDoctorTransaction(doctorDTO); // 트랜잭션 메서드 호출

			// 성공 처리
			result.setRedirect(true);
		} catch (Exception e) {
			e.printStackTrace(); // 에러 로그 기록
			result.setRedirect(false);
			System.out.println("에러!");
			// 에러 처리: 적절한 에러 메시지를 설정하거나 페이지로 리다이렉트
		}

		return result;
	}
}
