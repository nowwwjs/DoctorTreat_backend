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

      // 입력된 doctorId와 doctorPw 가져오기
      String doctorId = request.getParameter("doctorId");
      String doctorPw = request.getParameter("doctorPw");

      // 디버깅을 위한 출력
      System.out.println("Doctor ID: " + doctorId);
      System.out.println("Doctor Pw: " + doctorPw);
      
      // 값이 null인지 확인
      if (doctorId == null || doctorPw == null) {
          System.out.println("doctorId 또는 doctorPw가 null입니다.");
          response.sendRedirect(request.getContextPath() + "/app/myPage/doctorOut.jsp");
          return null;  // result 반환 없이 종료
      }

      doctorDTO.setDoctorId(doctorId);
      doctorDTO.setDoctorPw(doctorPw);

      System.out.println(doctorDTO);

      // 회원 탈퇴 시도
      boolean delete = doctorDAO.quitDoctor(doctorId, doctorPw);

      if (delete) {
          System.out.println("탈퇴 성공");

          session.invalidate(); // 세션 무효화
          System.out.println("세션 무효화");

          // 쿠키 삭제
          Cookie cookie = new Cookie("doctorNumber", null);
          cookie.setMaxAge(0);
          response.addCookie(cookie);
          System.out.println("쿠키 삭제");

          result.setRedirect(true);
          result.setPath("/index.jsp");
      } else {
          System.out.println("탈퇴 실패");
          // 탈퇴 실패 시 메시지 전달 또는 오류 처리
          response.sendRedirect(request.getContextPath() + "/app/myPage/doctorOut.jsp");
      }

      return result;
  }
}