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
import com.doctorTreat.app.dto.DoctorDTO;
import com.doctorTreat.app.memberClinic.dao.MemberClinicDAO;

public class ClinicApplicationOk implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");

		// 진료신청한 의사의 UK 전화번호(쿼리스트링 참조)
		String hospitalCall = request.getParameter("hospitalCall");
		System.out.println(hospitalCall);

//		로그인정보 담기
		System.out.println("세션 가져오는중");
		// false를 넣으면 값을 세션이 없을때 null을 반환
		// 매개변수를 넣지 않으면 세션이 없을때 세션을 만들어서 반환
		HttpSession session = request.getSession(false);
		System.out.println("세션 : " + session);

		System.out.println("현재회원 회원번호 : " + session.getAttribute("memberNumber"));
		// 세션에 있는 회원번호 형변환 하여 저장.
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		System.out.println("형변환 회원번호 : " + memberNumber);

		// 맵퍼에서 파라미터 타입으로 받기위한 맵 생성하여 선택한 병원, 로그인중인 유저 저장
		Map<String, Object> queryMap = new HashMap<>();
		queryMap.put("memberNumber", memberNumber); // 회원 번호
		queryMap.put("hospitalCall", hospitalCall); // 의사의 전화번호
		System.out.println(queryMap);

		// 쿼리실행
		// 채팅방 생성(테이블에 행 추가)
		MemberClinicDAO memberClinicDAO = new MemberClinicDAO();
		int doctorNumber = memberClinicDAO.getDoctorNumber(hospitalCall);
		ChatSessionDTO chatSessionDTO = new ChatSessionDTO();
		chatSessionDTO.setMemberNumber(memberNumber);
		chatSessionDTO.setDoctorNumber(doctorNumber);
		memberClinicDAO.inputChatSession(chatSessionDTO);
		System.out.println("채팅방 생성완료");

		//회원이 갖고있는 채팅목록 2건씩 생성
		List<DoctorDTO> doctorOfEar = memberClinicDAO.getChatListEar(memberNumber);
		List<DoctorDTO> doctorOfInner = memberClinicDAO.getChatListInner(memberNumber);
		System.out.println(doctorOfEar);
		System.out.println(doctorOfInner);
		
		//jsp에서 사용가능하게 처리
		request.setAttribute("doctorOfEar", doctorOfEar);
		request.setAttribute("doctorOfInner", doctorOfInner);

//		결과처리
		Result result = new Result();
		result.setRedirect(true);
		result.setPath("/app/clinic/chatListMember.jsp");
		return result;
	}
}
