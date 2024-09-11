package com.doctorTreat.app.doctorMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
<<<<<<< HEAD

public class DoctorOutOkController implements Execute {

    @Override
=======
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorOutOkController implements Execute {

	@Override
>>>>>>> 944d97b840fd54622e002dcf21815fcdfc7e9aed
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        
        request.setCharacterEncoding("UTF-8");
        Result result = new Result();

        DoctorDAO doctorDAO = new DoctorDAO();
<<<<<<< HEAD

        // 세션에서 doctorNumber를 가져와 사용자가 맞는지 확인
        String sessionNumber = (String) request.getSession().getAttribute("doctorNumber");

        if (sessionNumber != null) {
            int doctorNumber = Integer.valueOf(sessionNumber);
            
            // 회원 탈퇴 처리: 주소, 병원, 의사 정보 삭제
            doctorDAO.quit1(doctorNumber);
            doctorDAO.quit2(doctorNumber);
            doctorDAO.quit3(doctorNumber);

            // 탈퇴 후 세션 무효화
            request.getSession().invalidate();

            // 탈퇴 완료 페이지로 리다이렉트
            result.setRedirect(true);
            result.setPath("/app/myPage/doctorOut-Caution.jsp");  // 탈퇴 경고 페이지로 이동
        } else {
            // 세션에 doctorNumber가 없으면 로그인 페이지로 리다이렉트
            result.setRedirect(true);
            result.setPath("/doctor/login.dm");
        }
        
=======
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
 
>>>>>>> 944d97b840fd54622e002dcf21815fcdfc7e9aed
        return result;
    }
}