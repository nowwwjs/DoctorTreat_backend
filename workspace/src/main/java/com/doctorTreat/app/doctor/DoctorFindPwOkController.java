package com.doctorTreat.app.doctor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorFindPwOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
        Result result = new Result();

        // DAO 객체 생성
        DoctorDAO doctorDAO = new DoctorDAO();
        
        DoctorDTO doctorDTO = new DoctorDTO();
        
        // request에서 doctorName, doctorId 파라미터 가져오기
        String doctorName = request.getParameter("doctorName");
        String doctorId = request.getParameter("doctorId");
        
        System.out.println("잘받아왔지롱" + doctorName);
        System.out.println("잘받아왔지롱" + doctorId);

        // DAO의 findPassword 메서드를 호출해서 비밀번호 확인
        doctorDTO = doctorDAO.findPassword(doctorName,doctorId);

        System.out.println("뇽안" + doctorDTO);
        
        request.setAttribute("doctorshowPw", doctorDTO);
        
        result.setRedirect(true);

        return result;
    
    }
	
	
	
}



