package com.doctorTreat.app.memberClinic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;

/**
 * Servlet implementation class ClinicFrontController
 */
public class MemberClinicFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberClinicFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 전체 URI에서 ContextPath를 제외시킨 부분만 변수에 저장(분기처리할 때 비교할 변수로 사용)
		String target = request.getRequestURI().substring(request.getContextPath().length());
		Result result = new Result();

		switch (target) {
//		헤더에서 비대면진료 클릭시 일반회원 과 선택 페이지로 이동
		case "/app/clinic/clinicStartMember.memcl":
			request.getRequestDispatcher("/app/clinic/clinicStartMember.jsp").forward(request, response);
			break;

//		과 선택에서 이비인후과 선택시 이비인후과컨트롤러 실행 후 의사리스트목록 출력
		case "/doctorListEar.memcl":
			result = new EarDoctorListController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

//		과 선택에서 내과 선택시 내과컨트롤러 실행 후 의사리스트목록 출력
		case "/doctorListInner.memcl":
			result = new InnerDoctorListController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

//		의사 목록에서 의사 선택시 해당 의사와 일치하는 상세페이지
		case "/app/clinic/doctorDetail.memcl":
			result = new DoctorDetailController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

//		의사 상세정보에서 진료신청 제출시 해당의사와의 채팅방 연결 후 채팅리스트 페이지
		case "/ClinicApplicationOk.memcl":
			result = new ClinicApplicationOk().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

//		로그인 상태의 일반회원이 헤더쪽 아이콘으로 채팅 리스트 접근
		case "/chatListMember.memcl":
			result = new ChatListMemberController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

//		로그인 상태의 일반회원이 헤더쪽 아이콘으로 최근 처방전 접근
		case "/chart.memcl":
			result = new ChartController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

//		로그인 상태의 일반회원이 채팅리스트에서 채팅방으로 접근
		case "/app/clinic/chatRoomMember.memcl":
			result = new ChatRoomMemberController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

//		채팅방에서 채팅입력 db저장 (비동기)
		case "/sendOkController.memcl":
			result = new MemberSendOkController().execute(request, response);
			break;
					}

	}

//			if (result != null) {
//				if (result.isRedirect()) {
//					request.getRequestDispatcher(result.getPath()).forward(request, response);
//				} else {
//					response.sendRedirect(result.getPath());
//				}
//			}

//	      if (result != null) {
//	         if (result.isRedirect()) {
//	            response.sendRedirect(result.getPath());
//	         } else {
//	            request.getRequestDispatcher(result.getPath()).forward(request, response);
//	         }
//	      }
}
