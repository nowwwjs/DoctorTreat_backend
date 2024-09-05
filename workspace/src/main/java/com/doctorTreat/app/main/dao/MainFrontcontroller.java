package com.doctorTreat.app.main.dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.main.dao.MainMedical_InfoController;

//@WebServlet("*.main")
public class MainFrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String command = requestURI.substring(contextPath.length());

        Execute commandExecutor = null;
        
        if (command.equals("/medicalInfo.main")) {
            commandExecutor = new MainMedical_InfoController();
        }

        if (commandExecutor != null) {
            Result result = commandExecutor.execute(request, response);
            String path = result.getPath();

            if (path != null) {
                request.getRequestDispatcher(path).forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }
}