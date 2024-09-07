package com.doctorTreat.app.doctorBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorBoard.dao.BoardDetailDoctorDAO;
import com.doctorTreat.app.dto.BoardDetailDoctorDTO;

public class BoardDetailDoctorController implements Execute {
    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        request.setCharacterEncoding("UTF-8");

        // memberNumber를 파라미터로 받아옴
        String memberNumberStr = request.getParameter("memberNumber");
        
        if (memberNumberStr == null || memberNumberStr.trim().isEmpty()) {
            // memberNumber가 없거나 빈 문자열인 경우 적절한 오류 처리
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "회원 번호가 누락되었습니다.");
            return null;
        }

        int memberNumber;
        try {
            memberNumber = Integer.parseInt(memberNumberStr);
        } catch (NumberFormatException e) {
            // memberNumber가 정수가 아닌 경우 적절한 오류 처리
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "잘못된 회원 번호입니다.");
            return null;
        }

        // DAO를 이용해 게시글 상세 정보 조회
        BoardDetailDoctorDAO dao = new BoardDetailDoctorDAO();
        BoardDetailDoctorDTO boardDetail = dao.getBoardDetailByMember(memberNumber);

        // 조회된 게시글 정보를 request 객체에 설정
        request.setAttribute("boardDetail", boardDetail);

        // 결과 페이지 설정 (게시글 상세 JSP로 포워딩)
        Result result = new Result();
        result.setPath("/app/board/boardDetailDoctor.jsp"); // 게시글 상세 페이지 경로
        result.setRedirect(false); // forward 방식으로 전달

        return result;
    }
}