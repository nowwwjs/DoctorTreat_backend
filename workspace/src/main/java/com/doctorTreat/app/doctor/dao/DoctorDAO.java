package com.doctorTreat.app.doctor.dao;

import java.sql.SQLException;
<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;
=======
>>>>>>> 1860fd72a39938e4ea4a037216dfefd0d7028d45

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.DoctorDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorDAO {

   private SqlSession sqlSession;

   public DoctorDAO() {
      // 자동 커밋 비활성화
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(false);
   }

   public void inputAddress(DoctorDTO doctorDTO) {
      try {
         sqlSession.insert("doctor.doctorJoinAddress", doctorDTO);
         System.out.println("주소 삽입 성공");
         sqlSession.commit();
      } catch (Exception e) {
         sqlSession.rollback(); // 실패 시 롤백
         e.printStackTrace();
      }
   }

   public void inputHospital(DoctorDTO doctorDTO) {
      try {
         Integer addressNumber = sqlSession.selectOne("doctor.getAddressNum");
         doctorDTO.setAddressNumber(addressNumber);
         System.out.println("생성된 주소번호: " + addressNumber);

         sqlSession.insert("doctor.doctorJoinHospital", doctorDTO);
         System.out.println("병원 삽입 성공");
         sqlSession.commit();
      } catch (Exception e) {
         sqlSession.rollback();
         e.printStackTrace();
      }
   }

   public void inputDoctor(DoctorDTO doctorDTO) {
      try {
         Integer hospitalNumber = sqlSession.selectOne("doctor.getHospitalNum");
         doctorDTO.setHospitalNumber(hospitalNumber);
         System.out.println("생성된 병원번호: " + hospitalNumber);

         sqlSession.insert("doctor.doctorJoin", doctorDTO);
         System.out.println("의사 삽입 성공");
         sqlSession.commit();
      } catch (Exception e) {
         sqlSession.rollback();
         e.printStackTrace();
      }
   }

   public void updateDoctorInfo(DoctorDTO doctorDTO) {
      try {
         // 현재 데이터베이스에 저장된 기존 의사 정보를 가져옴
         DoctorDTO doctorUpdate = showInfo(doctorDTO.getDoctorNumber());

         // 입력되지 않은 값은 기존 데이터를 유지
         if (doctorDTO.getDoctorName() == null || doctorDTO.getDoctorName().isEmpty()) {
            doctorDTO.setDoctorName(doctorUpdate.getDoctorName());
         }
         if (doctorDTO.getHospitalName() == null || doctorDTO.getHospitalName().isEmpty()) {
            doctorDTO.setHospitalName(doctorUpdate.getHospitalName());
         }
         if (doctorDTO.getHospitalCall() == null || doctorDTO.getHospitalCall().isEmpty()) {
            doctorDTO.setHospitalCall(doctorUpdate.getHospitalCall());
         }
         if (doctorDTO.getAddressPostal() == null || doctorDTO.getAddressPostal().isEmpty()) {
            doctorDTO.setAddressPostal(doctorUpdate.getAddressPostal());
         }
         if (doctorDTO.getAddressAddress() == null || doctorDTO.getAddressAddress().isEmpty()) {
            doctorDTO.setAddressAddress(doctorUpdate.getAddressAddress());
         }
         if (doctorDTO.getAddressDetail() == null || doctorDTO.getAddressDetail().isEmpty()) {
            doctorDTO.setAddressDetail(doctorUpdate.getAddressDetail());
         }

         // 데이터베이스 업데이트 실행
         sqlSession.update("doctorMypage.updateDoctor", doctorDTO); // 의사 정보 업데이트
         sqlSession.update("doctorMypage.updateHospital", doctorDTO); // 병원 정보 업데이트
         sqlSession.update("doctorMypage.updateAddress", doctorDTO); // 주소 정보 업데이트

         sqlSession.commit(); // 트랜잭션 커밋
         System.out.println("의사 정보 업데이트 완료: " + doctorDTO);
      } catch (Exception e) {
         sqlSession.rollback(); // 예외 발생 시 롤백
         e.printStackTrace();
         System.out.println("업데이트 실패: 롤백 처리");
      }
   }

   // 로그인
   public DoctorDTO doctorLogin(DoctorDTO doctorDTO) {
      return sqlSession.selectOne("doctor.doctorLogin", doctorDTO);
   }

   // 비밀번호 확인
   public boolean checkPassword(String doctorId, String doctorPw) {
      DoctorDTO doctorDTO = new DoctorDTO();
      doctorDTO.setDoctorId(doctorId);
      doctorDTO.setDoctorPw(doctorPw);
      Integer count = sqlSession.selectOne("doctorMypage.checkPassword", doctorDTO);
      return count != null && count > 0;
   }

   // 마이페이지 정보 조회
   public DoctorDTO showInfo(int doctorNumber) {
      return sqlSession.selectOne("doctorMypage.showInfo", doctorNumber);
   }
   
   
   
   

   // 회원 탈퇴
   public boolean quitDoctor(String doctorId, String doctorPw) {
       System.out.println("탈퇴 DAO 실행");
       DoctorDTO doctorDTO = new DoctorDTO();
       doctorDTO.setDoctorId(doctorId);
       doctorDTO.setDoctorPw(doctorPw);
       
       boolean success = false;

       try {
        
           sqlSession.getConnection().setAutoCommit(false);

           // 의사와 관련된 댓글 삭제
           int commentResult = sqlSession.delete("doctorMypage.deleteComments", doctorDTO);
           System.out.println(commentResult + "삭제되니?");
           // 의사 정보 삭제 쿼리 실행
           int result1 = sqlSession.delete("doctorMypage.doctorQuit1", doctorDTO);
           // 병원 삭제 쿼리 실행
           int result2 = sqlSession.delete("doctorMypage.doctorQuit2", doctorDTO);
           // 주소 삭제 쿼리 실행
           int result3 = sqlSession.delete("doctorMypage.doctorQuit3", doctorDTO);

           // 모든 삭제가 성공했는지 확인
           if (result1 == 1 && result2 >= 0 && result3 >= 0 && commentResult >= 0) {
               sqlSession.commit(); // 모든 작업이 성공하면 커밋
               success = true; // 탈퇴 성공
           } else {
               System.out.println("탈퇴 실패");
               sqlSession.rollback(); // 실패하면 롤백
           }
       } catch (Exception e) {
           System.out.println("예외 발생: " + e.getMessage());
           sqlSession.rollback(); // 예외 발생 시 롤백
       } finally {
           try {
               sqlSession.getConnection().setAutoCommit(true); // 자동 커밋으로 복원
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }

       return success; // 탈퇴 성공 여부 반환
   }

   
   // 아이디 중복확인
   public boolean checkId(String doctorId) {
      System.out.println("중복확인도착");
      // selectOne() 반환타입은 Object 타입이라 비교를 위해 Integer로 형 변환
      // DB에서 memberId가 존재하는지 확인하는 쿼리를 실행하고
      // 존재하면 true, 존재하지 않으면 false로 반환하도록 한다
      return (Integer) sqlSession.selectOne("doctor.checkId", doctorId) <= 0;
      // 값이 0 이하면 아이디가 존재하지 않음 => true 반환
      // 아이디가 존재하면 false 반환
   }
   
   // 닥터 아이디 찾기
   public DoctorDTO findId1(String phone) {
      System.out.println("닥터 findId 도착");
      return sqlSession.selectOne("doctor.findId1", phone);
   }
   
   
   //의사 비밀번호 찾기
   public DoctorDTO findPassword(String doctorName, String doctorId) {
	    System.out.println("의사 FindPw 도착했음");
	    
	    // Map을 사용하여 매개변수 전달
	    Map<String, Object> params = new HashMap<>();
	    params.put("doctorName", doctorName);
	    params.put("doctorId", doctorId);
	    
	    // selectOne으로 결과를 받아 처리
	  return  sqlSession.selectOne("doctor.findPassword", params);
	
<<<<<<< HEAD
	    
	   // 비밀번호가 존재하는 경우 true 반환
	}
   
   
   


   
   

// 비밀번호 변경
   public void updatePassword(DoctorDTO doctorDTO) {
	    try {
	        int rowsUpdated = sqlSession.update("doctorMypage.updatePassword", doctorDTO);
	        if (rowsUpdated > 0) {
	            sqlSession.commit();  // 커밋이 정상적으로 발생해야만
	            System.out.println("비밀번호 업데이트 성공");
	        } else {
	            System.out.println("업데이트된 행이 없습니다.");
	        }
	    } catch (Exception e) {
	        sqlSession.rollback();  // 예외가 발생하면 롤백
	        e.printStackTrace();
	    }
=======
	
	public boolean quitDoctor(String doctorId, String doctorPw) {
	    System.out.println("탈퇴 DAO 실행");
	    DoctorDTO doctorDTO = new DoctorDTO();
	    doctorDTO.setDoctorId(doctorId);
	    doctorDTO.setDoctorPw(doctorPw);
	    
	    boolean success = false;

	    try {
	     
	        sqlSession.getConnection().setAutoCommit(false);

	        // 의사와 관련된 댓글 삭제
	        int commentResult = sqlSession.delete("doctorMypage.deleteComments", doctorDTO);
	        System.out.println(commentResult + "삭제되니?");
	        // 의사 정보 삭제 쿼리 실행
	        int result1 = sqlSession.delete("doctorMypage.doctorQuit1", doctorDTO);
	        // 병원 삭제 쿼리 실행
	        int result2 = sqlSession.delete("doctorMypage.doctorQuit2", doctorDTO);
	        // 주소 삭제 쿼리 실행
	        int result3 = sqlSession.delete("doctorMypage.doctorQuit3", doctorDTO);

	        // 모든 삭제가 성공했는지 확인
	        if (result1 == 1 && result2 >= 0 && result3 >= 0 && commentResult >= 0) {
	            sqlSession.commit(); // 모든 작업이 성공하면 커밋
	            success = true; // 탈퇴 성공
	        } else {
	            System.out.println("탈퇴 실패");
	            sqlSession.rollback(); // 실패하면 롤백
	        }
	    } catch (Exception e) {
	        System.out.println("예외 발생: " + e.getMessage());
	        sqlSession.rollback(); // 예외 발생 시 롤백
	    } finally {
	        try {
	            sqlSession.getConnection().setAutoCommit(true); // 자동 커밋으로 복원
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return success; // 탈퇴 성공 여부 반환
	}
	
	// 아이디 중복확인
	public boolean checkId(String doctorId) {
		System.out.println("중복확인도착");
		// selectOne() 반환타입은 Object 타입이라 비교를 위해 Integer로 형 변환
		// DB에서 memberId가 존재하는지 확인하는 쿼리를 실행하고
		// 존재하면 true, 존재하지 않으면 false로 반환하도록 한다
		return (Integer) sqlSession.selectOne("doctor.checkId", doctorId) <= 0;
		// 값이 0 이하면 아이디가 존재하지 않음 => true 반환
		// 아이디가 존재하면 false 반환
>>>>>>> 1860fd72a39938e4ea4a037216dfefd0d7028d45
	}
   }






