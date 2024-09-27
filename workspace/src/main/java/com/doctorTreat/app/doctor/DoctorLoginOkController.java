package com.doctorTreat.app.doctor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorLoginOkController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        // 인코딩 설정
        response.setContentType("text/html; charset=utf-8");

        DoctorDTO doctorDTO = new DoctorDTO();
        DoctorDAO doctorDAO = new DoctorDAO();

        doctorDTO.setDoctorId(request.getParameter("doctorId"));
        doctorDTO.setDoctorPw(request.getParameter("doctorPw"));

        DoctorDTO doctor = doctorDAO.doctorLogin(doctorDTO);
        Result result = new Result();

        if (doctor == null) {
            response.getWriter().print("<script>alert('아이디 또는 비밀번호를 다시 입력해주세요.'); location.href='http://localhost:9000/doctor/doctorLogin.do';</script>");
            response.getWriter().flush();
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("userType", "doctor");
            session.setAttribute("doctorNumber", doctor.getDoctorNumber());

            result.setPath(request.getContextPath() + "/index.main");   
            result.setRedirect(true);
        }
        return result;
    }
}	