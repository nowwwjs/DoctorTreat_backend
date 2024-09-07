package com.doctorTreat.app.dto;

public class BoardDetailDoctorDTO {
	private String medicalInfoTitle;
	private String memberName;
	private String medicalInfoDate;
	private String medicalInfoText;

	public String getMedicalInfoTitle() {
		return medicalInfoTitle;
	}

	public void setMedicalInfoTitle(String medicalInfoTitle) {
		this.medicalInfoTitle = medicalInfoTitle;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMedicalInfoDate() {
		return medicalInfoDate;
	}

	public void setMedicalInfoDate(String medicalInfoDate) {
		this.medicalInfoDate = medicalInfoDate;
	}

	public String getMedicalInfoText() {
		return medicalInfoText;
	}

	public void setMedicalInfoText(String medicalInfoText) {
		this.medicalInfoText = medicalInfoText;
	}

	@Override
	public String toString() {
		return "BoardDetailDoctorDTO [medicalInfoTitle=" + medicalInfoTitle + ", memberName=" + memberName
				+ ", medicalInfoDate=" + medicalInfoDate + ", medicalInfoText=" + medicalInfoText + "]";
	}

}
