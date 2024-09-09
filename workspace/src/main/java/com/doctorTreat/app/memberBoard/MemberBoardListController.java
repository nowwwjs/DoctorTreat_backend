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
        Result result = new Result();

        MemberBoardDAO memberBoardDAO = new MemberBoardDAO();

        // 페이지 번호와 페이지 크기를 파라미터로 받음. 기본값은 페이지 1, 페이지 크기 5로 설정
        int page = request.getParameter("page") != null ? Integer.parseInt(request.getParameter("page")) : 1;
        int pageSize = 5; // 한 페이지에 보여줄 게시물 수

        // DAO 호출해서 페이지네이션 적용된 리스트 가져오기
        List<MemberBoardDTO> memberBoardList = memberBoardDAO.showList(page, pageSize);

        // 전체 게시물 수와 총 페이지 수 계산
        int totalCount = memberBoardDAO.getTotalCount(); 
        int totalPage = (int) Math.ceil((double) totalCount / pageSize);

        // request에 필요한 데이터 설정
        request.setAttribute("memberBoardshowlist", memberBoardList);
        request.setAttribute("currentPage", page);
        request.setAttribute("totalPage", totalPage);

   
        // 리다이렉트 대신 포워딩을 사용하여 뷰로 이동
        result.setRedirect(true);
      
        // 프론트 컨트롤러에서 포워드 처리
        return result;
    }
}
