package com.doctorTreat.app.doctorMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorOutOkController implements Execute {

	@Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        
        request.setCharacterEncoding("UTF-8");
        Result result = new Result();

        DoctorDAO doctorDAO = new DoctorDAO();
        DoctorDTO doctorDTO = new DoctorDTO();

        System.out.println("꼬르륵");
        
        String doctorId = request.getParameter("doctorId");
        String doctorPw = request.getParameter("doctorPw");
        
        
        doctorDTO.setDoctorId(doctorId);
        doctorDTO.setDoctorPw(doctorPw);
        
        System.out.println(doctorDTO);
        
        int docNum = doctorDAO.showDoctor(doctorDTO);
        
        System.out.println("뭐야" + docNum);
        
        if(docNum != 0) {
        doctorDAO.quit1(docNum);
        doctorDAO.quit2(docNum);
        doctorDAO.quit3(docNum);
        
        result.setRedirect(true);
        result.setPath("/app/myPage/doctorOut-Caution.jsp");
        }
        
        else {
        	  result.setRedirect(false);
        	  result.setPath("/app/myPage/doctorInfo.jsp");
        }
 
        return result;
    }
}