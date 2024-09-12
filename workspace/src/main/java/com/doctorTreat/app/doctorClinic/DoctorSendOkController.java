package com.doctorTreat.app.doctorClinic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorClinic.dao.DoctorClinicDAO;
import com.doctorTreat.app.dto.ChatDTO;
import com.doctorTreat.app.dto.ChatSessionDTO;
import com.doctorTreat.app.memberClinic.dao.MemberClinicDAO;

public class DoctorSendOkController implements Execute{
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		
		Result result = null;
		
		//로그인정보 담기
		HttpSession session = request.getSession(false);
		Integer doctorNumber = (Integer) session.getAttribute("doctorNumber");

		//환자가 보낸 메세지
        String message = request.getParameter("message");
        Integer sessionNumber = Integer.valueOf(request.getParameter("sessionNumber"));
        System.out.println("메세지 : " + message);
        System.out.println("채팅세션번호 : " + sessionNumber);
		
        //DB값 넣기
        DoctorClinicDAO doctorClinicDAO = new DoctorClinicDAO();
        ChatDTO chatDTO = new ChatDTO();
        chatDTO.setSessionNumber(sessionNumber);
        chatDTO.setDoctorNumber(doctorNumber);
        chatDTO.setChatText(message);
        doctorClinicDAO.inputDoctorChat(chatDTO);
		
		return result;
	}
}
