package com.doctorTreat.app.memberBoard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberBoardDTO;
import com.doctorTreat.app.memberBoard.dao.MemberBoardDAO;

public class MemberBoardDetailController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	    request.setCharacterEncoding("UTF-8");
	    Result result = new Result();

	    MemberBoardDAO memberBoardDAO = new MemberBoardDAO();

	    // 요청 파라미터에서 info_number만 가져옵니다.
	    String infoNumberStr = request.getParameter("infoNumber");

	    
	    // infoNumberStr을 정수로 변환
	    int infoNumber = Integer.valueOf(infoNumberStr);

	    // 값이 제대로 담겼는지 확인하기 위한 출력
	    System.out.println("Info Number: " + infoNumber);

	    // DAO 메서드를 호출하여 상세 정보를 가져옵니다.
	    MemberBoardDTO memberBoardDetail = memberBoardDAO.showDetail(infoNumber);
	   System.out.println("ㅎㅎ"+memberBoardDetail);
	    // 결과를 요청 속성에 저장합니다.
	    request.setAttribute("memberBoardshowDetail", memberBoardDetail);
	    
	    result.setRedirect(true);
	    result.setPath("/app/board/boardDetailAuth.jsp");
	    
	    return result;
	    
	}

}
