//package com.doctorTreat.app.doctorClinic;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import com.doctorTreat.app.Execute;
//import com.doctorTreat.app.Result;
//import com.doctorTreat.app.doctorClinic.dao.DoctorClinicDAO;
//import com.doctorTreat.app.dto.ChartDTO;
//
//public class WriteChartOkController implements Execute {
//	@Override
//	public Result execute(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {
//
//		request.setCharacterEncoding("UTF-8");
//
//		System.out.println("세션 가져오는중");
//		// false를 넣으면 값을 세션이 없을때 null을 반환
//		// 매개변수를 넣지 않으면 세션이 없을때 세션을 만들어서 반환
//		HttpSession session = request.getSession(false);
//		System.out.println("세션 : " + session);
//
//		System.out.println("현재의사 의사번호 : " + session.getAttribute("doctorNumber"));
//		// 세션에 있는 회원번호 형변환 하여 저장.
//		Integer doctorNumber = (Integer) session.getAttribute("doctorNumber");
//		System.out.println("형변환 의사번호 : " + doctorNumber);
//
//		// 선택한 환자정보
//		int memberNumber = Integer.valueOf(request.getParameter("memberNumber"));
//		System.out.println("환자 번호 : " + memberNumber);
//
//		// 쿼리에 전달할 값 DTO에 저장
//		ChartDTO chartDTO = new ChartDTO();
//		chartDTO.setChartName(request.getParameter("chartName"));
//		chartDTO.setChartMedicine(request.getParameter("chartMedicine"));
//		chartDTO.setChartPeriod(request.getParameter("chartPeriod"));
//		chartDTO.setChartDay(request.getParameter("chartDay"));
//		chartDTO.setChartTime(request.getParameter("chartTime"));
//		chartDTO.setMemberNumber(Integer.valueOf(memberNumber));
//		chartDTO.setDoctorNumber(doctorNumber);
//		
//		System.out.println(chartDTO);
//
//		// 쿼리 실행
//		DoctorClinicDAO doctorClinicDAO = new DoctorClinicDAO();
//		doctorClinicDAO.inputChart(chartDTO);
//
//		// 결과처리
//		Result result = new Result();
//		result.setRedirect(false);
//		result.setPath("/chatListDoctor.doccl");
//		return result;
//	}
//}

package com.doctorTreat.app.doctorClinic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctorTreat.app.Execute;
import com.doctorTreat.app.Result;
import com.doctorTreat.app.doctorClinic.dao.DoctorClinicDAO;
import com.doctorTreat.app.dto.ChartDTO;

public class WriteChartOkController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 인코딩 설정
        request.setCharacterEncoding("UTF-8");
        
        // 결과 처리 객체
        Result result = new Result();

        try {
            // 세션 가져오기
            HttpSession session = request.getSession(false);
            if (session == null || session.getAttribute("doctorNumber") == null) {
                throw new IllegalStateException("세션이 만료되었거나 의사 정보가 없습니다. 다시 로그인하세요.");
            }

            // 의사번호 세션에서 가져오기
            Integer doctorNumber = (Integer) session.getAttribute("doctorNumber");

            // 환자 정보 가져오기
            int memberNumber = Integer.parseInt(request.getParameter("memberNumber"));

            // 입력값 검증 (필수 항목 체크)
            String chartName = request.getParameter("chartName");
            String chartMedicine = request.getParameter("chartMedicine");
            String chartPeriod = request.getParameter("chartPeriod");
            String chartDay = request.getParameter("chartDay");
            String chartTime = request.getParameter("chartTime");

            if (chartName == null || chartName.trim().isEmpty() ||
                chartMedicine == null || chartMedicine.trim().isEmpty() ||
                chartPeriod == null || chartPeriod.trim().isEmpty() ||
                chartDay == null || chartDay.trim().isEmpty() ||
                chartTime == null || chartTime.trim().isEmpty()) {
                throw new IllegalArgumentException("모든 필수 입력값을 입력해야 합니다.");
            }

            // DTO에 값 저장
            ChartDTO chartDTO = new ChartDTO();
            chartDTO.setChartName(chartName);
            chartDTO.setChartMedicine(chartMedicine);
            chartDTO.setChartPeriod(chartPeriod);
            chartDTO.setChartDay(chartDay);
            chartDTO.setChartTime(chartTime);
            chartDTO.setMemberNumber(memberNumber);
            chartDTO.setDoctorNumber(doctorNumber);

            // DB에 처방전 저장
            DoctorClinicDAO doctorClinicDAO = new DoctorClinicDAO();
            doctorClinicDAO.inputChart(chartDTO);

            // 성공적으로 처리가 되면 결과 설정
            result.setRedirect(false);
            result.setPath("/chatListDoctor.doccl");

        } catch (IllegalArgumentException e) {
            // 입력값이 잘못되었을 경우
            e.printStackTrace();
            request.setAttribute("errorMessage", e.getMessage());
            result.setRedirect(false);
            result.setPath("/writeChart.doccl"); //페이지에 남아있기
        }

        return result;
    }
}
