package com.doctorTreat.app.doctorBoard;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorBoard.dao.DoctorBoardDAO;
import com.doctorTreat.app.dto.DoctorBoardDTO;

public class DoctorBoardListController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");
		Result result = new Result();

		DoctorBoardDAO doctorBoardDAO = new DoctorBoardDAO();

		// 리스트를 가져와서 request에 설정
		List<DoctorBoardDTO> doctorBoardList = doctorBoardDAO.showList();
		request.setAttribute("doctorBoardshowlist", doctorBoardList);
		
		System.out.println(doctorBoardList);
		result.setRedirect(false);
		result.setPath(request.getContextPath() + "/app/board/doctorMedicalKnowledgeList.jsp");
		
		// 포워드 처리는 프론트 컨트롤러에서 담당
		return result;

	}

}
