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
import com.doctorTreat.app.dto.MemberBoardDTO;

public class DoctorBoardDetailController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	    request.setCharacterEncoding("UTF-8");
	    Result result = new Result();

	    DoctorBoardDAO doctorBoardDAO = new DoctorBoardDAO();

	    // 요청 파라미터에서 memberNumber를 가져옵니다.
	    String infoNumberStr = request.getParameter("memberNumber");

	    // memberNumber가 null이거나 빈 문자열인 경우 처리
	    if (infoNumberStr == null || infoNumberStr.isEmpty()) {
	        System.out.println("Error: memberNumber is missing or invalid.");
	        result.setRedirect(false);
	        result.setPath("/app/error/errorPage.jsp"); // 에러 페이지로 이동
	        return result;
	    }

	    int infoNumber;
	    try {
	        // infoNumberStr을 정수로 변환
	        infoNumber = Integer.valueOf(infoNumberStr);
	        System.out.println("Info Number: " + infoNumber);
	    } catch (NumberFormatException e) {
	        // 숫자로 변환할 수 없는 경우 처리
	        System.out.println("Error: Cannot parse memberNumber to Integer. Value: " + infoNumberStr);
	        result.setRedirect(false);
	        result.setPath("/app/error/errorPage.jsp"); // 에러 페이지로 이동
	        return result;
	    }

	    // memberNumber에 따라 상세 정보를 가져옵니다.
	    List<DoctorBoardDTO> doctorBoardDetail = doctorBoardDAO.showDetail(infoNumber);
	    System.out.println(doctorBoardDetail);
	    
	    // 결과를 요청 속성에 저장합니다.
	    request.setAttribute("doctorBoardshowDetail", doctorBoardDetail);
	    
	    result.setRedirect(false);
	    result.setPath("/app/board/boardDetailDoctor.jsp");
	    
	    return result;
	}

}
