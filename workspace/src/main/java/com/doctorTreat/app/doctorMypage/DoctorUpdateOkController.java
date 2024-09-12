package com.doctorTreat.app.doctorMypage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorUpdateOkController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // 인코딩 설정
        request.setCharacterEncoding("UTF-8");
        Result result = new Result();

        DoctorDAO doctorDAO = new DoctorDAO();
        String doctorNumber = request.getParameter("doctorNumber");

        if (doctorNumber != null) {
        	int docNumber = Integer.parseInt(doctorNumber);  
            DoctorDTO doctorInfo = doctorDAO.showInfo(docNumber); 
            
            request.setAttribute("showInfo", doctorInfo); 
            result.setPath("/app/myPage/doctorUpdateMember.jsp");
            result.setRedirect(false);
        } else {
            result.setPath("/app/user/doctorLogin.jsp");
            result.setRedirect(true);
        }

        return result;
    }
}
