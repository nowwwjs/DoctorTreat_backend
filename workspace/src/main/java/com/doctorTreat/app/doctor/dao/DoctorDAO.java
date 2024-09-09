package com.doctorTreat.app.doctor.dao;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.Result;
import com.doctorTreat.app.dto.DoctorDTO;
import com.mybatis.config.MyBatisConfig;

public class DoctorDAO {

   private SqlSession sqlSession;

   public DoctorDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }

   public void inputAddress(DoctorDTO doctorDTO) {
      sqlSession.insert("doctor.doctorJoinAddress", doctorDTO);
      System.out.println("주소 삽입 성공");
   }

   public void inputHospital(DoctorDTO doctorDTO) {
      // 주소 삽입시 생성된 주소번호PK 시퀀스를 조회하여 AddressNumber의 값으로 담기
      Integer addressNumber = sqlSession.selectOne("doctor.getAddressNum"); // 시퀀스 조회
      doctorDTO.setAddressNumber(addressNumber); // DTO에 시퀀스 값 설정
      System.out.println("생성된 주소번호: " + addressNumber);

      // 주소 삽입 후 ADDRESS_NUMBER가 doctorDTO에 설정되어 있어야 함
      // 병원 삽입
      sqlSession.insert("doctor.doctorJoinHospital", doctorDTO);
      System.out.println("병원 삽입 성공");
   }

   public void inputDoctor(DoctorDTO doctorDTO) {
      // 주소 삽입시 생성된 주소번호PK 시퀀스를 조회하여 AddressNumber의 값으로 담기
      Integer hospitalNumber = sqlSession.selectOne("doctor.getHospitalNum"); // 시퀀스 조회
      doctorDTO.setHospitalNumber(hospitalNumber); // DTO에 시퀀스 값 설정
      System.out.println("생성된 병원번호: " + hospitalNumber);

      // 주소 삽입 후 ADDRESS_NUMBER가 doctorDTO에 설정되어 있어야 함
      // 병원 삽입
      sqlSession.insert("doctor.doctorJoin", doctorDTO);
      System.out.println("의사 삽입 성공");
   }

   //로그인
   public DoctorDTO doctorLogin(DoctorDTO doctorDTO) {
      System.out.println("닥터");
       System.out.println("로그인 시도 - 입력된 아이디: " + doctorDTO.getDoctorId() + ", 입력된 비밀번호: " + doctorDTO.getDoctorPw());
       
       DoctorDTO doctor = sqlSession.selectOne("doctor.doctorLogin", doctorDTO);
       
       if (doctor == null) {
           System.out.println("로그인 실패 - 일치하는 의사 정보 없음");
       } else {
           System.out.println("로그인 성공 - 조회된 의사 정보: " + doctor.toString());
       }
       
       return doctor;
   }
   
   //회원탈퇴
   public void quit(int doctorNumber) {
      sqlSession.delete("doctor.quit", doctorNumber);
   }
   
   
   
   
   
   
}

