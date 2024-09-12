package com.doctorTreat.app.memberClinic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.ChatDTO;
import com.doctorTreat.app.dto.ChatSessionDTO;
import com.doctorTreat.app.memberClinic.dao.MemberClinicDAO;

public class MemberSendOkController implements Execute{
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		
		Result result = null;
		
//		로그인정보 담기
		HttpSession session = request.getSession(false);
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		//환자가 보낸 메세지
        String message = request.getParameter("message");
        Integer sessionNumber = Integer.valueOf(request.getParameter("sessionNumber"));
        System.out.println("메세지 : " + message);
        System.out.println("채팅세션번호 : " + sessionNumber);
		
        //DB값 넣기
        MemberClinicDAO memberClinicDAO = new MemberClinicDAO();
        ChatDTO chatDTO = new ChatDTO();
        chatDTO.setSessionNumber(sessionNumber);
        chatDTO.setMemberNumber(memberNumber);
        chatDTO.setChatText(message);
        memberClinicDAO.inputMemberChat(chatDTO);
		
		return result;
	}
}
