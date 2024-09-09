package com.doctorTreat.app.doctor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
      
      DoctorDTO loggedDoctor = doctorDAO.doctorLogin(doctorDTO);

      Result result = new Result();

      if (loggedDoctor != null) {
          // 로그인 성공
          request.setAttribute("doctor", loggedDoctor);  // request에 로그인된 정보 설정
          result.setPath("/doctor/doctorInfo.do");  // 로그인 후 병원 정보 페이지로 이동
      } else {
          // 로그인 실패
          result.setPath("/app/user/doctorLogin.jsp");
      }

      return result;
  }


   }

