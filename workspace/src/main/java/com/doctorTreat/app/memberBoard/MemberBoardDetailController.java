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
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        Result result = new Result();

        MemberBoardDAO memberBoardDAO = new MemberBoardDAO();

        // 요청에서 ID 가져오기
        String medicalInfoNumberParam = request.getParameter("medicalInfoNumber");
        int medicalInfoNumber = Integer.parseInt(medicalInfoNumberParam); // ID를 정수로 변환

        // DAO 호출해서 특정 게시글의 상세 정보 가져오기
        MemberBoardDTO memberBoardDetail = memberBoardDAO.showDetail(medicalInfoNumber);

        // 가져온 상세 정보를 request에 저장
        request.setAttribute("memberBoardshowDetail", memberBoardDetail);

        // 리다이렉트 대신 포워딩을 사용하여 뷰로 이동
        result.setRedirect(false);
        result.setPath("/app/board/boardDetailAuth.jsp");

        // 프론트 컨트롤러에서 포워드 처리
        return result;
    }
}
