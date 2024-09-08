package com.doctorTreat.app.memberBoard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberBoardDTO;
import com.doctorTreat.app.memberBoard.dao.MemberBoardDAO;

public class MemberBoardWriteController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        Result result = new Result();

        MemberBoardDAO memberBoardDAO = new MemberBoardDAO();
        MemberBoardDTO memberBoardDTO = new MemberBoardDTO();
        
        // 폼에서 전달된 데이터 가져오기
        String writeTitle = request.getParameter("medicalInfoTitle");
        String writeText = request.getParameter("medicalInfoText");
        
        // DTO에 데이터 설정
        memberBoardDTO.setMedicalInfoTitle(writeTitle);
        memberBoardDTO.setMedicalInfoText(writeText);
        
        // DAO를 통해 데이터베이스에 저장
        memberBoardDAO.write(memberBoardDTO);

        // 결과 설정
        result.setRedirect(true);
        result.setPath("/index.jsp");
        
        return result;
    }
}
