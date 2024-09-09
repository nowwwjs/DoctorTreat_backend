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
      System.out.println("확인=========");

      DoctorDTO doctor = doctorDAO.doctorLogin(doctorDTO);
      System.out.println(doctor);
      System.out.println(doctor.getDoctorNumber());

      Result result = new Result();

      if (doctor == null) {
         result.setPath("/user/doctorLogin.jsp");
         result.setRedirect(false);
      } else {
          HttpSession session = request.getSession();
          session.setAttribute("userType", "doctor");
          session.setAttribute("doctorNumber", doctor.getDoctorNumber());

         result.setPath(request.getContextPath() + "/index.jsp");
         result.setRedirect(true);
      }
       return result;

   }
}
