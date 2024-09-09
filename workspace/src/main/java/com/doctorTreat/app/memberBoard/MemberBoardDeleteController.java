package com.doctorTreat.app.memberBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.memberBoard.dao.MemberBoardDAO;

public class MemberBoardDeleteController implements Execute {

	private MemberBoardDAO memberBoardDAO = new MemberBoardDAO(); // DAO 객체 생성

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Result result = new Result();
		
		System.out.println("안녕안녕!");

		int medicalInfoNumber = Integer.parseInt(request.getParameter("InfoNumber2")); // 게시글 번호 가져오기
		memberBoardDAO.delete(medicalInfoNumber); // 게시글 삭제

		// 삭제 후 목록 페이지로 리다이렉트
		result.setRedirect(true);

		return result; // Result 반환
	}
}
