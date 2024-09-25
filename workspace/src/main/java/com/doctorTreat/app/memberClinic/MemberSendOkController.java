package com.doctorTreat.app.memberClinic;

import java.io.IOException;
import java.util.ArrayList;
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
import com.doctorTreat.app.dto.ChatDTO;
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
        
//        //방금 입력값 조회
//        Map<String, Object> queryMap = new HashMap<>();
//        queryMap.put("sessionNumber", sessionNumber);
//        queryMap.put("memberNumber", memberNumber);
//        List<ChatDTO> memberChatInfo = memberClinicDAO.getChatMemberInfo(queryMap);
//        
//        // JSON 응답 생성
//        JSONObject jsonResponse = new JSONObject();
//        jsonResponse.put("message", message);
//        jsonResponse.put("memberName", memberChatInfo.get(0).getMemberName()); // 실제로는 세션에서 받아올 수 있음
//        jsonResponse.put("timestamp", memberChatInfo.get(0).getChatMsgDate()); // 현재 시간을 사용할 수 있음
//
//        // 비동기 응답
//        response.setContentType("application/json; charset=UTF-8");
//        response.getWriter().write(jsonResponse.toString());
		
		return result;
	}
}
