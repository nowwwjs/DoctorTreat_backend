package com.doctorTreat.app.memberBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberBoardDTO;
import com.doctorTreat.app.memberBoard.dao.MemberBoardDAO;

public class MemberBoardUpdateController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        Result result = new Result();

        MemberBoardDAO memberBoardDAO = new MemberBoardDAO();

        // 폼에서 전달된 데이터 가져오기
        String updateTitle = request.getParameter("updateTitle");
        String updateText = request.getParameter("updateText");
        String sessionNumber = (String) request.getSession().getAttribute("medicalInfoNumber");
        
        // 세션에서 게시글 번호 가져오기
        int medicalInfoNumber = Integer.valueOf(sessionNumber); 

        // DTO 객체 생성 및 값 설정
        MemberBoardDTO memberBoardDTO = new MemberBoardDTO();
        memberBoardDTO.setMedicalInfoNumber(medicalInfoNumber);
        memberBoardDTO.setMedicalInfoTitle(updateTitle);
        memberBoardDTO.setMedicalInfoText(updateText);

        // DAO 호출하여 업데이트 수행
        memberBoardDAO.update(memberBoardDTO);

        // 결과 설정
        result.setRedirect(true);

        return result;
    }
}
