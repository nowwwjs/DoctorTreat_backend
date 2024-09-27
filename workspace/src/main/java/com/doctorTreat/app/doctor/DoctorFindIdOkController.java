package com.doctorTreat.app.doctor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.member.dao.MemberDAO;

public class DoctorFindIdOkController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {

      request.setCharacterEncoding("UTF-8");
      Result result = new Result();

      DoctorDAO doctorDAO = new DoctorDAO();

      DoctorDTO doctorDTO = new DoctorDTO();

      String phoneNumber = request.getParameter("phoneNum");
      
      System.out.println(phoneNumber + "으아ㅏ");

      doctorDTO = doctorDAO.findId1(phoneNumber);

      System.out.println("안뇽" + doctorDTO);

      request.setAttribute("doctorshowId", doctorDTO);

      result.setRedirect(true);

      return result;
<<<<<<< HEAD
=======
      
      
>>>>>>> main

   }

}



