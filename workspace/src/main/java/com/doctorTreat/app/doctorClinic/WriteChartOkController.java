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
   public Result execute(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
      // 인코딩 설정
      request.setCharacterEncoding("UTF-8");

      // 결과 처리 객체
      Result result = new Result();

      try {
         // 세션 가져오기
         HttpSession session = request.getSession(false);
         if (session == null || session.getAttribute("doctorNumber") == null) {
            throw new IllegalStateException();
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

         if (chartName == null || chartName.trim().isEmpty() || chartMedicine == null
               || chartMedicine.trim().isEmpty() || chartPeriod == null || chartPeriod.trim().isEmpty()
               || chartDay == null || chartDay.trim().isEmpty() || chartTime == null
               || chartTime.trim().isEmpty()) {
            throw new IllegalArgumentException();
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
         result.setRedirect(false);
         result.setPath("/writeChart.doccl"); // 예외가 발생해도 페이지에 남아있기
      } catch (IllegalStateException e) {
         // 세션 만료
         e.printStackTrace();
         result.setRedirect(false);
         result.setPath("/index.jsp"); // 홈으로
      }

      return result;
   }
}
