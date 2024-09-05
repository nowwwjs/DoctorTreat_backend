package com.doctorTreat.app.memberBoard;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberBoardDTO;
import com.doctorTreat.app.memberBoard.dao.MemberBoardDAO;

public class MemberBoardListController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
	        throws IOException, ServletException {
	    
		request.setCharacterEncoding("UTF-8");
		Result result = null;
	    System.out.println("안녕 ! 컨틀롤러당");

	    MemberBoardDAO memberBoardDAO = new MemberBoardDAO();
	    System.out.println(memberBoardDAO);
	    
	    // 리스트를 가져와서 request에 설정
	    List<MemberBoardDTO> memberBoardList = memberBoardDAO.showList();
	    request.setAttribute("memberBoardshowlist", memberBoardList);
	    
	    result.setRedirect(true);
	    result.setPath(request.getContextPath() + "/board/medicalKnowledgeList.jsp");
	    
	    // 포워드 처리는 프론트 컨트롤러에서 담당
	    return result;
	    
	}
	
	



}
