package com.doctorTreat.app.memberMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Result;

/**
 * Servlet implementation class MemberMypageFrontController
 */
public class MemberMypageFrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public MemberMypageFrontController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doProcess(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String target = request.getRequestURI().substring(request.getContextPath().length());
        System.out.println(target);
        Result result = new Result();

        switch (target) {
            case "/memberMypage/memberInfo.mm":
                String memberNumber = request.getParameter("memberNumber");
                request.getSession().setAttribute("memberNumber", memberNumber);
                result = new MemberInfoController().execute(request, response);
                request.getRequestDispatcher("/app/myPage/memberInfo.jsp").forward(request, response);
                break;

            case "/memberMypage/memberPw.mm":
                System.out.println("비밀번호 확인중");
                request.getRequestDispatcher("/app/myPage/memberPwOk.jsp").forward(request, response);
                break;

            case "/memberMypage/memberPwOk.mm":
                System.out.println("비밀번호 확인 완료");
                String memberPwNumber = request.getParameter("memberNumber");
                request.getSession().setAttribute("memberPwNumber", memberPwNumber);
                result = new MemberPwOkController().execute(request, response);
                break;

            case "/memberMypage/memberUpdateProcess.mm":
                result = new MemberUpdateProcessController().execute(request, response);
                break;

            case "/memberMypage/memberOut.mm":
                System.out.println("회원탈퇴중....");
                request.getRequestDispatcher("/app/myPage/memberOut.jsp").forward(request, response);
                break;

            case "/memberMypage/memberOutOk.mm":
                result = new MemberOutOkController().execute(request, response);
                break;
        }

        // 리다이렉트 또는 forward 처리
        if (result != null && result.getPath() != null) {
            if (!response.isCommitted()) { // 응답이 커밋되지 않았는지 확인
                if (result.isRedirect()) {
                    response.sendRedirect(result.getPath());
                } else {
                    request.getRequestDispatcher(result.getPath()).forward(request, response);
                }
            } else {
                System.out.println("응답이 이미 커밋되었습니다.");
            }
        }
    }
}
