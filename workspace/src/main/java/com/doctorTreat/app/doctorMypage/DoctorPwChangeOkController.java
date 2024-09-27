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
		Result result = new Result();

		// 세션에서 doctorNumber 가져오기
        HttpSession session = request.getSession();
        Integer doctorNumber = (Integer) session.getAttribute("doctorNumber");
        
        System.out.println("여기까지는 왔니?");
        System.out.println(doctorNumber);
        

        // 사용자가 입력한 새로운 비밀번호 받기
        String newPassword = request.getParameter("password");
        String newPasswordConfirm = request.getParameter("passwordConfirm");
        

        System.out.println("입력된 새 비밀번호: " + newPassword);
        System.out.println("입력된 비밀번호 확인: " + newPasswordConfirm);

        // 비밀번호 확인 일치 여부 검사
        if (!newPassword.equals(newPasswordConfirm)) {
            result.setPath("/app/myPage/doctorPwChange.jsp");  // 비밀번호 변경 페이지로 다시 이동
            result.setRedirect(false);  // forward 방식으로 이동
            request.setAttribute("errorMessage", "비밀번호가 일치하지 않습니다.");
            return result;  // 비밀번호 불일치 시 즉시 반환
        }

        // 비밀번호 변경 로직
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setDoctorNumber(doctorNumber);  // 세션에서 가져온 doctorNumber 설정
        doctorDTO.setDoctorPw(newPassword);
        
        System.out.println(doctorDTO);

        DoctorDAO doctorDAO = new DoctorDAO();
        doctorDAO.updatePassword(doctorDTO);  // DAO에서 비밀번호 업데이트

        result.setPath("/app/user/doctorLogin.jsp");  // 여기가 null일 수 있으니 경로 확인 필요
        result.setRedirect(true);  // 리다이렉트 설정

        return result;
    }
}
