package com.doctorTreat.app.doctor;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctor.dao.DoctorDAO;
import com.doctorTreat.app.dto.DoctorDTO;

public class DoctorJoinController implements Execute{

	
	
	
	
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException {
		// TODO Auto-generated method stub
		  // 인코딩 설정확인
	    request.setCharacterEncoding("UTF-8");

	    // MemberDTO와 DAO 객체 생성
	    DoctorDTO memberDTO = new DoctorDTO();
	    DoctorDAO memberDAO = new DoctorDAO();
	    Result result = new Result();

	    // 폼데이터 받아오기
	    memberDTO.setDoctorId(request.getParameter("doctorId"));
	    memberDTO.setDoctorPw(request.getParameter("doctorPw"));
	    memberDTO.setDoctorName(request.getParameter("doctorName"));
	    // 문자열 Integer로 변환
	    String ageParam = request.getParameter("doctorAge");
	    if (ageParam != null && !ageParam.isEmpty()) {
	       memberDTO.setDoctorAge(Integer.parseInt(ageParam));
	    }
	    memberDTO.setDoctorGender(request.getParameter("doctorGender"));

	    // 디버깅용 로그 출력
	    System.out.println("MemberDTO : " + memberDTO);

	    // 데이터베이스에 회원 정보 저장
	    memberDAO.join(memberDTO);

	    // 결과 처리
	    result.setRedirect(true);
	    result.setPath(request.getContextPath() + "/doctor/doctorLogin.jsp");
	    // 성공후 이동할 페이지 설정
	    return result;
	 }

	}
