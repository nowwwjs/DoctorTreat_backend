package com.doctorTreat.app.doctorMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorOutOkController implements Execute {

   @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
      
      HttpSession session = request.getSession(false);
        
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
        
        boolean delete = doctorDAO.quitDoctor(doctorId, doctorPw);
        
        if(delete = true) {
           System.out.println("탈퇴성공이요");
           
            session.invalidate(); // 세션 무효화
            System.out.println("세션 무효화");
           
            Cookie cookie = new Cookie("memberNumber", null);
            cookie.setMaxAge(0);
            response.addCookie(cookie);
            System.out.println(cookie);
            System.out.println("쿠키삭제");
            
            result.setRedirect(true);
            result.setPath("/index.jsp");
        }else {
           System.out.println("탈퇴실패");
           response.sendRedirect(request.getContextPath() + "/app/myPage/doctorOut.jsp");
        }
        
 
        return result;
    }
}