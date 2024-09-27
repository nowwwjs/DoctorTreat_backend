package com.doctorTreat.app.memberMypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.memberMypage.dao.MemberMypageDAO;

public class MemberUpdateController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
        
		
		request.setCharacterEncoding("UTF-8");
        Result result = new Result();
        
        MemberMypageDAO membermypageDAO = new MemberMypageDAO();
        String memberNumber = request.getParameter("memberNumber");
        System.out.println(memberNumber + "----------");
        
        if (memberNumber != null) {
        	int memNumber = Integer.parseInt(memberNumber);  
            MemberDTO memberInfo = membermypageDAO.showInfo(memNumber); 
            System.out.println(memberInfo + "----------");
            
            System.out.println("memberInfo: " + memberInfo);
            
            request.setAttribute("showInfo", memberInfo); 
            result.setPath("/app/myPage/memberUpdate.jsp");
            result.setRedirect(false);
        } else {
            result.setPath("/app/user/memberLogin.jsp");
            result.setRedirect(true);
        }

        return result;
		
	}

}
