package com.doctorTreat.app.main.dao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;

public class MainMedical_InfoController implements Execute {

    private MainMedicalInfoDAO mainMedicalInfoDAO;

    public MainMedical_InfoController() {
        // SqlSessionFactory 초기화 후 DAO 생성
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            this.mainMedicalInfoDAO = new MainMedicalInfoDAO(sqlSessionFactory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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