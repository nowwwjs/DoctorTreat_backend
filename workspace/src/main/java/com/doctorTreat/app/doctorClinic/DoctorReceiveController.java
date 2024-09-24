package com.doctorTreat.app.doctorClinic;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorClinic.dao.DoctorClinicDAO;
import com.doctorTreat.app.dto.ChatDTO;

public class DoctorReceiveController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");

		Result result = null;

		// 로그인정보 담기
		HttpSession session = request.getSession(false);

		// 해당 세션의 새로운 메시지 조회
		Integer sessionNumber = Integer.valueOf(request.getParameter("sessionNumber"));
		DoctorClinicDAO doctorClinicDAO = new DoctorClinicDAO();

		List<ChatDTO> newMessages = doctorClinicDAO.getNewMessages(sessionNumber);

		// JSON으로 응답하기 위해 JSON 객체로 변환
		JSONArray jsonArray = new JSONArray();
		for (ChatDTO message : newMessages) {
			JSONObject jsonMessage = new JSONObject();
			jsonMessage.put("message", message.getChatText());
			jsonMessage.put("sender", message.getMemberName()); // 의사는 환자의 채팅을 가져와야 하므로
			jsonMessage.put("timestamp", message.getChatMsgDate());
			jsonArray.add(jsonMessage);
		}

		// 비동기 응답
		response.setContentType("application/json; charset=UTF-8");
		response.getWriter().write(jsonArray.toString());

		return result;
	}
}
