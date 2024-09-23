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

public class DoctorPwChangeOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// 세션에서 doctorId 가져오기
        HttpSession session = request.getSession();
        String doctorId = (String) session.getAttribute("doctorId");

        // 사용자가 입력한 새로운 비밀번호 받기
        String newPassword = request.getParameter("password");
        String newPasswordConfirm = request.getParameter("passwordConfirm");

        // 비밀번호 확인 일치 여부 검사
        if (!newPassword.equals(newPasswordConfirm)) {
            Result result = new Result();
            result.setPath("/app/myPage/doctorPwChange.jsp");  // 비밀번호 변경 페이지로 다시 이동
            result.setRedirect(false);  // forward 방식으로 이동
            request.setAttribute("errorMessage", "비밀번호가 일치하지 않습니다.");
            return result;  // 비밀번호 불일치 시 즉시 반환
        }

        // 비밀번호 변경 로직
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setDoctorId(doctorId);
        doctorDTO.setDoctorPw(newPassword);

        DoctorDAO doctorDAO = new DoctorDAO();
        doctorDAO.updatePassword(doctorDTO);  // DAO에서 비밀번호 업데이트

        // 비밀번호 변경 성공 시 이동할 경로 설정
        Result result = new Result();
        result.setPath("/app/user/doctorLogin.jsp");  // 성공 시 이동할 페이지
        result.setRedirect(true);  // 리다이렉트 설정

        return result;
    }
}
