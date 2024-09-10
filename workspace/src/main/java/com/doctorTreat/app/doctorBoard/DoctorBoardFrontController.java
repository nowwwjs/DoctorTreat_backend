package com.doctorTreat.app.doctorBoard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;
import com.doctorTreat.app.memberBoard.MemberBoardListController;

/**
 * Servlet implementation class DoctorBoardFrontController
 */
//@WebServlet("/BoardFrontController")
public class DoctorBoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoctorBoardFrontController() {
		super();
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String target = request.getRequestURI().substring(request.getContextPath().length());
		Result result = null;

		switch (target) {
		case "/BoardList.docbo":
			result = new DoctorBoardListController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			System.out.println("의료 게시판 보이기");
			System.out.println("안녕");
			break;
		case "/BoardListDetail.docbo":
			result = new DoctorBoardDetailController().execute(request, response);
			request.getRequestDispatcher(result.getPath()).forward(request, response);
			System.out.println("의료 게시판 상세페이지");
			request.getRequestDispatcher("/app/board/boardDetailDoctor.jsp").forward(request, response);
			break;
		case "/BoardComment.docbo":
			result = new DoctorBoardCommentController().execute(request, response);
			request.getRequestDispatcher("/app/board/boardDetailDoctorAuth.jsp").forward(request, response);
			System.out.println("댓글 작성 될까?");
		}
	}
}