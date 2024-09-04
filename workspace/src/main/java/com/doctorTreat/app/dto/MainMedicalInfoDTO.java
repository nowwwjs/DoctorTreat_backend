package com.doctorTreat.app.dto;

public class MainMedicalInfoDTO {
	private int medicalInfoNumber;
	private String medicalInfoSubject;
	private String medicalInfoTitle;
	private String medicalInfoText;
	private String medicalInfoDate;
	private int memberNumber;

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

}
