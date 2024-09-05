package com.doctorTreat.app.memberBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;
import com.doctorTreat.app.memberBoard.MemberBoardListController;

public class MemberBoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberBoardFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String target = request.getRequestURI().substring(request.getContextPath().length());
		Result result = null;

		switch (target) {
		case "/memberBoardList.membo":
			System.out.println("게시글 리스트 !");
			new MemberBoardListController().execute(request, response);
			break;
		case "/memberBoard/write.membo":
			System.out.println("글 작성!");
			break;
		case "/memberBoard/update.membo":
			System.out.println("업데이트!");
			break;
		case "/memberBoard/delete.membo":
			System.out.println("삭제!");
			break;

		}
	}

}