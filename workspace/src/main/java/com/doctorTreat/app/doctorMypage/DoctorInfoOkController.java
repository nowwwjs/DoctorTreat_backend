package com.doctorTreat.app.doctorMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorInfoOkController implements Execute {
    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        request.setCharacterEncoding("UTF-8");
        Result result = new Result();

        DoctorDAO doctorDAO = new DoctorDAO();
        
        // 세션에서 doctorNumber 가져오기 (Integer로 캐스팅)
        HttpSession session = request.getSession();
        Integer doctorNumber = (Integer) session.getAttribute("doctorNumber");

        // doctorNumber가 null일 경우 로그인 페이지로 리다이렉트
        if (doctorNumber == null) {
            result.setPath("/app/user/doctorLogin.jsp");
            result.setRedirect(true);
            return result;
        }

        // DB에서 doctorNumber로 의사 정보 가져오기
        DoctorDTO doctorDTO = doctorDAO.showInfo(doctorNumber);

        // 의사 정보가 존재하는지 확인
        if (doctorDTO == null) {
            result.setPath("/app/error/noDoctorInfo.jsp"); // 오류 처리 페이지로 이동
            result.setRedirect(true);
            return result;
        }

        // 의사 정보 request에 저장
        request.setAttribute("doctorShowInfo", doctorDTO);

        result.setPath("/app/myPage/doctorInfo.jsp");
        result.setRedirect(false); // forward 처리
        return result;
    }
}