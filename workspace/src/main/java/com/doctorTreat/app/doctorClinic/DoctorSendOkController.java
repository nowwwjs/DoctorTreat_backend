package com.doctorTreat.app.doctorClinic;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

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

		//의사가 보낸 메세지
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
        
//        // 최근 채팅정보(이름,시간)조회
//        Map<String,Object> queryMap = new HashMap();
//        queryMap.put("sessionNumber", sessionNumber);
//        queryMap.put("doctorNumber", doctorNumber);
//        List<ChatDTO> doctorChatInfo = doctorClinicDAO.getChatDoctorInfo(queryMap);
//        
//        // 메시지 및 필요한 정보 JSON으로 응답
//        JSONObject jsonResponse = new JSONObject();
//        jsonResponse.put("message", message);
//        jsonResponse.put("doctorName", doctorChatInfo.get(0).getDoctorName());  // 고정된 값으로 예시
//        jsonResponse.put("timestamp", doctorChatInfo.get(0).getChatMsgDate());  // 실제로는 현재 시간을 사용
//        
//        // 비동기 응답
//        response.setContentType("application/json; charset=UTF-8");
//        response.getWriter().write(jsonResponse.toString());
		
		return result;
	}
}
