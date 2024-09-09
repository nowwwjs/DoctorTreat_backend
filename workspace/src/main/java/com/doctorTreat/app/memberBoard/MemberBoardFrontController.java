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
		case "/BoardList.membo":
			System.out.println("의사 지식인 페이지 이동");
			result = new MemberBoardListController().execute(request, response);
			request.getRequestDispatcher("/app/board/medicalKnowledgeList.jsp").forward(request, response);
			break;
		case "/memberBoardDetail.membo":
			System.out.println("상세 페이지 이동");
			result = new MemberBoardDetailController().execute(request, response);
			request.getRequestDispatcher("/app/board/boardDetailAuth.jsp").forward(request, response);
			break;
		case "/memberBoardWrite.membo":
<<<<<<< HEAD
			System.out.println("글 작성!");
			break;
		case "/memberBoard/delete.membo":
			System.out.println("삭제!");
=======
			System.out.println("글 작성 페이지 이동");
			request.getRequestDispatcher("/app/board/write.jsp").forward(request, response);
			break;
		case "/memberBoardWriteOk.membo":
			System.out.println("글 작성!");
			result = new MemberBoardWriteController().execute(request, response);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			break;
		case "/updateBoard.membo":
			System.out.println("글 수정!");
			result = new MemberBoardUpdateController().execute(request, response);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			break;
		case "deleteBoard.membo":
			System.out.println("글 삭제!");
			result = new MemberBoardDeleteController().execute(request, response);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
>>>>>>> main
			break;
		}

		// Result 객체가 null이 아닌 경우, 리다이렉트 또는 포워드 처리
		if (result != null) {
			if (result.isRedirect()) {
				response.sendRedirect(result.getPath()); // 리다이렉트 처리
			} else {
				request.getRequestDispatcher(result.getPath()).forward(request, response); // 포워드 처리
			}
		}
	}

}