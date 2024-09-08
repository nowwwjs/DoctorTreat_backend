//package com.doctorTreat.app.doctorBoard;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.doctorTreat.app.Execute;
//import com.doctorTreat.app.Result;
//import com.doctorTreat.app.doctorBoard.dao.DoctorBoardDAO;
//import com.doctorTreat.app.dto.DoctorBoardDTO;
//
//public class DoctorBoardDetailListController implements Execute {
//
//    @Override
//    public Result execute(HttpServletRequest request, HttpServletResponse response)
//            throws IOException, ServletException {
//
//        request.setCharacterEncoding("UTF-8");
//        Result result = new Result();
//
//        // 클라이언트로부터 memberNumber 파라미터를 가져옵니다.
//        String memberNumberParam = request.getParameter("memberNumber");
//        int memberNumber = Integer.parseInt(memberNumberParam);
//
//        // DoctorBoardDAO를 통해 게시글 세부 정보를 가져옵니다.
//        DoctorBoardDAO doctorBoardDAO = new DoctorBoardDAO();
//        List<DoctorBoardDTO> boardDetailList = doctorBoardDAO.showDetail(memberNumber);
//
//        // 게시글 상세 정보를 request에 설정합니다.
//        if (boardDetailList != null && !boardDetailList.isEmpty()) {
//            // 게시글이 존재하면 첫 번째 항목을 사용합니다.
//            DoctorBoardDTO boardDetail = boardDetailList.get(0);
//            request.setAttribute("boardDetail", boardDetail);
//        } else {
//            // 게시글이 없는 경우 적절한 처리를 합니다.
//            request.setAttribute("error", "해당 게시글을 찾을 수 없습니다.");
//        }
//
//        // JSP 페이지로 포워드합니다.
//        result.setRedirect(false);
//        result.setPath(request.getContextPath() + "/app/board/boardDetail.jsp");
//        
//        return result;
//    }
//}