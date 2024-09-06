package com.doctorTreat.app.main.dao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;

public class MainMedical_InfoController implements Execute {

    private MainMedicalInfoDAO mainMedicalInfoDAO;

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Result result = new Result();

        // DAO를 사용하여 의료 정보 제목 목록 가져오기
        List<String> titles = mainMedicalInfoDAO.getMedicalInfoTitles();
        System.out.println("DB에서 가져온 제목 리스트: " + titles);
        
        // 요청 속성에 제목 목록 설정
        request.setAttribute("medicalInfoTitles", titles);

        
        // 결과 페이지 설정
        result.setPath("/index.jsp");

        return result;
    }
}