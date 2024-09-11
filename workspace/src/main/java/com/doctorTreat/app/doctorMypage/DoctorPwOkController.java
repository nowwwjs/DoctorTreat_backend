package com.doctorTreat.app.doctorMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorPwOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// 인코딩 설정
		request.setCharacterEncoding("UTF-8");

		// DTO와 DAO 객체 생성
		DoctorDTO doctorDTO = new DoctorDTO();
		DoctorDAO doctorDAO = new DoctorDAO();
		Result result = new Result();

		// 쿼리실행
		System.out.println("나 디티오야" + doctorDTO);

		String doctorname = request.getParameter("doctorName");
		String doctorpassword = request.getParameter("doctorPw");



		System.out.println("나닷!"+ doctorDTO);
		boolean outCome = doctorDAO.checkPw(doctorname,doctorpassword);
		
		
		
		System.out.println(outCome);

		if (outCome == true) {
			result.setRedirect(true);
			result.setPath("/app/myPage/doctorUpdateMember.jsp");
		} else {
			result.setRedirect(false);
			result.setPath("/app/myPage/doctorInfo.jsp");
		}

		return result;

	}

}
