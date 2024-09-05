package com.doctorTreat.app.dto;

public class MemberBoardDTO {

	private String medicalInfoTitle; // 의료 정보 제목
	private String medicalInfoText; // 의료 정보 내용
	private String memberName; // 회원 이름

	// Getters and Setters
	public String getMedicalInfoTitle() {
		return medicalInfoTitle;
	}

	public void setMedicalInfoTitle(String medicalInfoTitle) {
		this.medicalInfoTitle = medicalInfoTitle;
	}

	public String getMedicalInfoText() {
		return medicalInfoText;
	}

	public void setMedicalInfoText(String medicalInfoText) {
		this.medicalInfoText = medicalInfoText;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "memberboard";
	}
	
}
