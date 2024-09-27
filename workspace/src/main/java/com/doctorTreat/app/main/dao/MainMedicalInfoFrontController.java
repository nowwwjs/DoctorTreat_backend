package com.doctorTreat.app.main.dao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorTreat.app.dto.MainDTO;

//@WebServlet("/MainMedicalInfoFrontController")
public class MainMedicalInfoFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MainMedicalInfoFrontController() {
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

		MainMedicalInfoDAO mainDAO = new MainMedicalInfoDAO();

		List<MainDTO> medicalInfoList = mainDAO.mainShowList();
			
		request.setAttribute("medicalInfoList", medicalInfoList);

		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}