package com.doctorTreat.app.doctor;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;

public class DoctorCheckIdOkController implements Execute {

	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {

		DoctorDAO doctorDAO = new DoctorDAO();
		boolean isTrue = doctorDAO.checkId(request.getParameter("doctorId"));
		String result = null;

		// PrintWriter 가져오기 전에 설정해야함
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		System.out.println(request.getParameter("doctorId"));

		if (isTrue) {
			result = "사용가능";
		} else {
			result = "중복된 아이디";	
		}

		out.print(result);
		out.close();

		return null;
	}

}
