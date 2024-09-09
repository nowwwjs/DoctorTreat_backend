package com.doctorTreat.app.doctor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorFindPwController {

    public Result execute(HttpServletRequest request, HttpServletResponse response) {
        Result result = new Result();
        String doctorName = request.getParameter("doctorName");
        String doctorId = request.getParameter("doctorId");

        DoctorDAO doctorDAO = new DoctorDAO();
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setDoctorName(doctorName);
        doctorDTO.setDoctorId(doctorId);

        String password = doctorDAO.findPassword(doctorDTO);

        if (password != null) {
            request.setAttribute("password", password);
            result.setPath("/app/user/doctorShowPw.jsp"); // 비밀번호 보여줄 JSP 경로 설정
        } else {
            result.setPath("/app/user/doctorPwNotFound.jsp"); // 실패 시 경로
        }
        
        return result;
    }
}