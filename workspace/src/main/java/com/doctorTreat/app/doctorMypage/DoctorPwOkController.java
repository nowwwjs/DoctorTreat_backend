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
        request.setCharacterEncoding("UTF-8");

        // DTO와 DAO 객체 생성
        DoctorDAO doctorDAO = new DoctorDAO();
        Result result = new Result();

        // 폼에서 전달된 값 가져오기
        String doctorName = request.getParameter("doctorName");
        String doctorPw = request.getParameter("doctorPw");

        // 비밀번호 확인 결과 (True: 인증 성공, False: 인증 실패)
        boolean isPasswordCorrect = doctorDAO.checkPassword(doctorName, doctorPw);

        if (isPasswordCorrect) {
            // 비밀번호 인증 성공 시
            result.setRedirect(true);
            result.setPath("/app/myPage/doctorUpdateMember.jsp");  // 수정 페이지로 리다이렉트
        } else {
            // 비밀번호 인증 실패 시
            result.setRedirect(false);
            result.setPath("/app/myPage/doctorInfo.jsp");  // 실패 페이지로 이동
        }

        return result;
    }
}