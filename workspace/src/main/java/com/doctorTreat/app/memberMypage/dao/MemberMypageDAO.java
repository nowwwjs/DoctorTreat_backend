package com.doctorTreat.app.memberMypage.dao;

import org.apache.ibatis.session.SqlSession;

import com.doctorTreat.app.dto.DoctorDTO;
import com.doctorTreat.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberMypageDAO {
	private SqlSession sqlSession;

	public MemberMypageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public MemberDTO showInfo(int memberNumber) {
		return sqlSession.selectOne("memberMypage.memberInfo", memberNumber);
	}

	public boolean checkPw(String memberId, String memberPw) {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setMemberId(memberId);
		memberDTO.setMemberPw(memberPw);

		// MyBatis로 비밀번호 확인 (카운트가 1 이상이면 인증 성공)
		Integer count = sqlSession.selectOne("memberMypage.memberPwOk", memberDTO);
		return count != null && count > 0; // 비밀번호가 일치하면 true 반환
	}

	public MemberDTO showMember(String memberId) {
		return sqlSession.selectOne("memberMypage.showUpdateInfo", memberId);
	}

	public void updateMemberInfo(MemberDTO memberDTO) {
		try {
			// 현재 데이터베이스에 저장된 기존정보를 가져옴
			MemberDTO memberUpdate = showInfo(memberDTO.getMemberNumber());

			// 입력되지 않은 값은 기존 데이터를 유지
			if (memberDTO.getMemberName() == null || memberDTO.getMemberName().isEmpty()) {
				memberDTO.setMemberName(memberUpdate.getMemberName());
			}
			if (memberDTO.getMemberBirth() == null || memberDTO.getMemberBirth().isEmpty()) {
				memberDTO.setMemberBirth(memberUpdate.getMemberBirth());
			}
			if (memberDTO.getMemberPhone() == null || memberDTO.getMemberPhone().isEmpty()) {
				memberDTO.setMemberPhone(memberUpdate.getMemberPhone());
			}
			if (memberDTO.getAddressPostal() == null || memberDTO.getAddressPostal().isEmpty()) {
				memberDTO.setAddressPostal(memberUpdate.getAddressPostal());
	         }
	         if (memberDTO.getAddressAddress() == null || memberDTO.getAddressAddress().isEmpty()) {
	        	 memberDTO.setAddressAddress(memberUpdate.getAddressAddress());
	         }
	         if (memberDTO.getAddressDetail() == null || memberDTO.getAddressDetail().isEmpty()) {
	        	 memberDTO.setAddressDetail(memberUpdate.getAddressDetail());
	         }

			// 데이터베이스 업데이트 실행
			sqlSession.update("memberMypage.updateMember", memberDTO); // 일반 정보 업데이트
			sqlSession.update("memberMypage.updateAddress", memberDTO); // 주소 정보 업데이트

			sqlSession.commit(); // 트랜잭션 커밋
			System.out.println("일반 정보 업데이트 완료: " + memberDTO);
		} catch (Exception e) {
			sqlSession.rollback(); // 예외 발생 시 롤백
			e.printStackTrace();
			System.out.println("업데이트 실패: 롤백 처리");
		}
	}

		
	// 회원삭제
	public int quitMember1(MemberDTO memberDTO) {
		System.out.println("회원정보주소정보조회");
		return sqlSession.selectOne("memberMypage.memberAddCheck", memberDTO);
	}

	public void quitMember2(MemberDTO memberDTO) {
		sqlSession.delete("memberMypage.memberQuit1", memberDTO);
		System.out.println("회원 삭제 완료");
	}

	public void quitMember3(MemberDTO memberDTO) {
		sqlSession.delete("memberMypage.memberQuit2", memberDTO);
		System.out.println("주소 삭제 완료");
	}

}
