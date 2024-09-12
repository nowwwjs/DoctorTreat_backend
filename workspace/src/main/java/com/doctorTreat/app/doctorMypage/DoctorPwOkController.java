package com.doctorTreat.app.doctorMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorPwOkController implements Execute {
    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        // 인코딩 설정
        request.setCharacterEncoding("utf-8");

        DoctorDAO doctorDAO = new DoctorDAO();
        Result result = new Result();

        Integer doctorNumber = (Integer) request.getSession().getAttribute("doctorNumber");

        if (doctorNumber == null) {
            System.out.println("세션에 doctorNumber 값 없음. 로그인 페이지로 이동");
            result.setPath("/app/user/doctorLogin.jsp");
            result.setRedirect(true);
            return result;
        }

        String doctorId = request.getParameter("doctorId");
        String doctorPw = request.getParameter("doctorPw");

        if (doctorId == null || doctorPw == null || doctorId.isEmpty() || doctorPw.isEmpty()) {
            System.out.println("아이디 또는 비밀번호가 입력되지 않음");

            // 의사 정보를 조회하여 다시 전달
            DoctorDTO doctorInfo = doctorDAO.showInfo(doctorNumber);
            request.setAttribute("doctorShowInfo", doctorInfo);

            // 다시 doctorInfo 페이지로 이동
            request.getRequestDispatcher("/app/myPage/doctorInfo.jsp").forward(request, response);
            return result;
        }

        // 비밀번호 확인 결과 (True: 인증 성공, False: 인증 실패)
        boolean isPasswordCorrect = doctorDAO.checkPassword(doctorId, doctorPw);

        if (isPasswordCorrect) {
            System.out.println("비밀번호 인증 성공");

            // 의사 정보를 조회하여 수정 페이지로 전달
            DoctorDTO doctorInfo = doctorDAO.showInfo(doctorNumber);
            request.setAttribute("doctorShowInfo", doctorInfo);

            // 수정 페이지 포워딩
            request.getRequestDispatcher("/app/myPage/doctorUpdateMember.jsp").forward(request, response);

        } else {
            System.out.println("비밀번호 인증 실패");

            // 기존 정보를 다시 조회하여 request에 저장
            DoctorDTO doctorInfo = doctorDAO.showInfo(doctorNumber);
            request.setAttribute("doctorShowInfo", doctorInfo);

            // 다시 doctorInfo 페이지로 이동
            request.getRequestDispatcher("/app/myPage/doctorInfo.jsp").forward(request, response);
        }

        return result;
    }
}