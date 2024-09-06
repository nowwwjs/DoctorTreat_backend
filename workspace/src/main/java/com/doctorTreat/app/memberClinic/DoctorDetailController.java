package com.doctorTreat.app.memberClinic;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.DoctorDetailDTO;
import com.doctorTreat.app.memberClinic.dao.MemberClinicDAO;

public class DoctorDetailController implements Execute{
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		String hospitalCall = request.getParameter("hospitalCall");
		System.out.println(hospitalCall);
		
		MemberClinicDAO memberClinicDAO = new MemberClinicDAO();
		List<DoctorDetailDTO> doctorDetail = memberClinicDAO.getDoctorDetail(hospitalCall);
		System.out.println(doctorDetail);
		
		  // JSP로 데이터를 전달
        request.setAttribute("doctorDetail", doctorDetail);

//		결과처리
        Result result = new Result();
        result.setRedirect(true);
        result.setPath("/app/clinic/doctorDetail.jsp");
        return result;
	}
}
