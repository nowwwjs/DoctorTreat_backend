package com.doctorTreat.app.dto;

public class MainDTO {
	private int medicalInfoNumber;
	private String medicalInfoSubject;
	private String medicalInfoTitle;
	private String medicalInfoText;
	private String medicalInfoDate; // JSP에서 문자열로 처리
	private int memberNumber;

	// 기본 생성자
	public MainDTO() {
	}

	// Getter 및 Setter 메서드
	public int getMedicalInfoNumber() {
		return medicalInfoNumber;
	}

	public void setMedicalInfoNumber(int medicalInfoNumber) {
		this.medicalInfoNumber = medicalInfoNumber;
	}

	public String getMedicalInfoSubject() {
		return medicalInfoSubject;
	}

	public void setMedicalInfoSubject(String medicalInfoSubject) {
		this.medicalInfoSubject = medicalInfoSubject;
	}

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

	public String getMedicalInfoDate() {
		return medicalInfoDate;
	}

	public void setMedicalInfoDate(String medicalInfoDate) {
		this.medicalInfoDate = medicalInfoDate;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	@Override
	public String toString() {
		return "MainDTO [medicalInfoNumber=" + medicalInfoNumber + ", medicalInfoSubject=" + medicalInfoSubject
				+ ", medicalInfoTitle=" + medicalInfoTitle + ", medicalInfoText=" + medicalInfoText
				+ ", medicalInfoDate=" + medicalInfoDate + ", memberNumber=" + memberNumber + "]";
	}

}
