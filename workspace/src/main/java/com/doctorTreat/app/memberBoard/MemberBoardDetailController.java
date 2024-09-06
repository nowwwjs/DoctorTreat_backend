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

        String medicalInfoNumberParam = request.getParameter("medicalInfoNumber");
        Integer medicalInfoNumber = Integer.valueOf(medicalInfoNumberParam);

        MemberBoardDTO memberBoardDetail = memberBoardDAO.showDetail(medicalInfoNumber);

        request.setAttribute("memberBoardshowDetail", memberBoardDetail);

        result.setRedirect(false);
        result.setPath("/app/board/boardDetailAuth.jsp");

        return result;
    }
}
