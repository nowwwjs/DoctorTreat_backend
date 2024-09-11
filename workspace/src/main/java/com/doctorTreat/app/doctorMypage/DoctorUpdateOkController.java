package com.doctorTreat.app.doctorMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorUpdateOkController implements Execute{
	


	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		Result result = new Result();
		
		DoctorDAO doctorDAO = new DoctorDAO();
		
		DoctorDTO doctorDTO = new DoctorDTO();
		
		String sessionNumber = (String) request.getSession().getAttribute("doctorNumber");
		
		
		int docInfo = Integer.valueOf(sessionNumber);
		
	
	
	doctorDTO = doctorDAO.showUpdateInfo(docInfo);
	
	System.out.println("안녕!" + doctorDTO);
	
	request.setAttribute("doctorshowUpdateInfo", doctorDTO);
	
	result.setRedirect(true);
	
	return result;
	
	
	}
}
