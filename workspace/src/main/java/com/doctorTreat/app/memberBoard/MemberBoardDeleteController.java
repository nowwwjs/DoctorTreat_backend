package com.doctorTreat.app.memberBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.memberBoard.dao.MemberBoardDAO;

public class MemberBoardDeleteController implements Execute {

    private MemberBoardDAO memberBoardDAO = new MemberBoardDAO(); // DAO 객체 생성

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        Result result = new Result();
         
        // 게시글 번호 가져오기
        int medicalInfoNumber = Integer.valueOf(request.getParameter("infoNumber2")); 
        
        System.out.println("울랄라 " + medicalInfoNumber);
        
        // 게시글 삭제 수행
        memberBoardDAO.delete1(medicalInfoNumber);
        memberBoardDAO.delete2(medicalInfoNumber);
        memberBoardDAO.delete3(medicalInfoNumber);
        memberBoardDAO.delete4(medicalInfoNumber);
        
        request.setAttribute("alertMessage", "게시글이 성공적으로 삭제되었습니다.");
        
        // 삭제 후 리다이렉트 설정
        result.setRedirect(true);
        
        return result; // Result 반환
    }
}
