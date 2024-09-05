package com.doctorTreat.app.member;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.MemberDTO;
import com.doctorTreat.app.member.dao.MemberDAO;

public class MemberJoinOkController implements Execute {
    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        
        request.setCharacterEncoding("UTF-8");
        
        // MyBatis 설정 파일 로드 및 SqlSessionFactory 생성
        String resource = "mybatis-config.xml";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
        // MemberDAO 생성 시 SqlSessionFactory 전달
        MemberDAO memberDAO = new MemberDAO(sqlSessionFactory);
        
        // DTO 객체 생성 및 폼 데이터 받아오기
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberId(request.getParameter("memberId"));
        memberDTO.setMemberPw(request.getParameter("memberPw"));
        memberDTO.setMemberName(request.getParameter("memberName"));
        memberDTO.setMemberBirth(request.getParameter("memberBirth"));
        memberDTO.setMemberPhone(request.getParameter("memberPhone"));
        memberDTO.setAddressPostal(request.getParameter("addressPostal"));
        memberDTO.setAddressAddress(request.getParameter("addressAddress"));
        memberDTO.setAddressDetail(request.getParameter("addressDetail"));
        
        // 데이터베이스에 회원 정보 및 주소 정보 저장
        try {
			memberDAO.join(memberDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // 결과 처리
        Result result = new Result();
        result.setRedirect(true);
        result.setPath(request.getContextPath() + "/user/memberJoinFinish.jsp");
        return result;
    }
}