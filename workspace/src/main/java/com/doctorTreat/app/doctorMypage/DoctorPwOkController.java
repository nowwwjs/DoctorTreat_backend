package com.doctorTreat.app.doctorMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;

public class DoctorPwOkController implements Execute {
    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        // 인코딩 설정
        request.setCharacterEncoding("utf-8");

        System.out.println("-pwok컨트롤러----");
        // DTO와 DAO 객체 생성
        DoctorDAO doctorDAO = new DoctorDAO();
        Result result = new Result();

        // 폼에서 전달된 값 가져오기
        String doctorId = request.getParameter("doctorId");
        String doctorPw = request.getParameter("doctorPw");
        
        System.out.println(doctorId);
        System.out.println(doctorPw);

        // 비밀번호 확인 결과 (True: 인증 성공, False: 인증 실패)
        boolean isPasswordCorrect = doctorDAO.checkPassword(doctorId, doctorPw);

        if (isPasswordCorrect) {
            // 비밀번호 인증 성공 시
        	System.out.println("비밀번호 인증 성공-pwok컨트롤러----");
        	result.setRedirect(false);
//        	result.setPath("/app/myPage/doctorUpdateMember.jsp");  // 수정 페이지로 리다이렉트
			request.getRequestDispatcher("/app/myPage/doctorUpdateMember.jsp").forward(request, response);

        } else {
            // 비밀번호 인증 실패 시
        	System.out.println("비밀번호 인증 실패-pwok컨트롤러----");
        	result.setRedirect(false);
        	request.getRequestDispatcher("/app/myPage/doctorInfo.jsp").forward(request, response);   // 실패 페이지로 이동
        }

        return result;
    }
}