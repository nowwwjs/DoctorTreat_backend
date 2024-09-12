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
import com.doctorTreat.app.dto.DoctorCommentDTO;

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
        
        // 댓글이 작성된 게시판 번호를 쿼리 파라미터에서 가져오기
        String infoNumberParam = request.getParameter("infoNumber");
        System.out.println(infoNumberParam);
        int infoNumber = (infoNumberParam != null && !infoNumberParam.isEmpty()) ? Integer.parseInt(infoNumberParam) : -1;

        // 댓글 확인 및 페이지 설정
        boolean hasComments = false;
        if (infoNumber != -1) {
            List<DoctorCommentDTO> comments = doctorBoardDAO.showComment(infoNumber);
            if (comments != null && !comments.isEmpty()) {
                hasComments = true;
            }
        }

        if (hasComments) {
            // 댓글이 있는 경우 댓글 페이지로 리디렉션
            result.setPath(request.getContextPath() + "/app/board/boardDetailDoctorAuth.jsp?infoNumber=" + infoNumber);
        } else {
            // 댓글이 없는 경우 기존 리스트 페이지로 리디렉션
            result.setPath(request.getContextPath() + "/app/board/doctorMedicalKnowledgeList.jsp");
        }

        result.setRedirect(true); // 리디렉션을 통해 페이지를 이동
        return result;
    }
}