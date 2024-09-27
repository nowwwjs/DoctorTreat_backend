package com.doctorTreat.app.doctorClinic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;
import com.doctorTreat.app.memberClinic.EarDoctorListController;
import com.doctorTreat.app.memberClinic.MemberSendOkController;

/**
 * Servlet implementation class ClinicFrontController
 */
public class DoctorClinicFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoctorClinicFrontController() {
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
		// 비대면진료 클릭시 진료시작하기 페이지로
		case "/clinicStartDoctor.doccl":
			request.getRequestDispatcher("/app/clinic/clinicStartDoctor.jsp").forward(request, response);
			break;

		// 진료 시작클릭시 의사가 소유한 채팅 리스트 페이지
		case "/chatListDoctor.doccl":
			result = new ChatListDoctorController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;
		// 닥터트리톡 버튼으로 리스트 접근시 경로
		case "/app/clinic/chatListDoctor.doccl":
			result = new ChatListDoctorController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

		// 목록에서 채팅 선택시 해당 채팅방 페이지 이동
		case "/app/clinic/chatRoomDoctor.doccl":
			result = new ChatRoomDoctorController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

		// 채팅방에서 처방전 작성 클릭시 작성페이지 이동
		case "/writeChart.doccl":
			result = new WriteChartController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;

		// 처방전 등록 클릭시 등록
		case "/writeChartOk.doccl":
			result = new WriteChartOkController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			break;
		//채팅방에서 채팅입력 db저장 (비동기)
		case "/sendOkController.doccl":
			result = new DoctorSendOkController().execute(request, response);
			break;
			
		}

	}

//	      if (result != null) {
//	         if (result.isRedirect()) {
//	            response.sendRedirect(result.getPath());
//	         } else {
//	            request.getRequestDispatcher(result.getPath()).forward(request, response);
//	         }
//	      }
}
