package com.doctorTreat.app.memberClinic;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.ChatSessionDTO;
import com.doctorTreat.app.memberClinic.dao.MemberClinicDAO;

public class ChatRoomMemberController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
//		로그인정보 담기
		System.out.println("세션 가져오는중");
		// false를 넣으면 값을 세션이 없을때 null을 반환
		// 매개변수를 넣지 않으면 세션이 없을때 세션을 만들어서 반환
		HttpSession session = request.getSession(false);
		System.out.println("세션 : " + session);
		
		System.out.println("현재회원 회원번호 : " + session.getAttribute("memberNumber"));
		//세션에 있는 회원번호 형변환 하여 저장.
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");
		System.out.println("형변환 회원번호 : " + memberNumber);
		
		//현재 채팅방을 알기 위해 쿼리스트링의 의사 정보받고 맵에 넣기
		String doctorName = request.getParameter("doctor");
		String hospitalName = request.getParameter("hospital");
		System.out.println(doctorName + "\n" +hospitalName);
		
		Map<String, Object> queryMap = new HashMap<>();
		queryMap.put("hospitalName", hospitalName);
		queryMap.put("doctorName", doctorName);
		queryMap.put("memberNumber", memberNumber);
		
		//현재 채팅방 번호
		MemberClinicDAO memberClinicDAO = new MemberClinicDAO();
		List<ChatSessionDTO> chatRoom = memberClinicDAO.getChatRoomNumber(queryMap);
		System.out.println(chatRoom);
		
		// 결과 처리
		Result result = new Result();
		result.setRedirect(true);
		result.setPath("/app/clinic/chatRoomMember.jsp");
		return result;
	}

}
