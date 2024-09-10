package com.doctorTreat.app.dto;

public class DoctorBoardDTO {

	private String medicalInfoTitle;
	private String medicalInfoText;
	private String memberName;
	private String medicalInfoDate;
	private String doctorMajor;
	private String doctorName;
	private String doctorCommentText;
	private int memberNumber;
	private int medicalInfoNumber;

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

	public String getMedicalInfoDate() {
		return medicalInfoDate;
	}

	public void setMedicalInfoDate(String medicalInfoDate) {
		this.medicalInfoDate = medicalInfoDate;
	}

	public String getDoctorMajor() {
		return doctorMajor;
	}

	public void setDoctorMajor(String doctorMajor) {
		this.doctorMajor = doctorMajor;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorCommentText() {
		return doctorCommentText;
	}

	public void setDoctorCommentText(String doctorCommentText) {
		this.doctorCommentText = doctorCommentText;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public int getMedicalInfoNumber() {
		return medicalInfoNumber;
	}

	public void setMedicalInfoNumber(int medicalInfoNumber) {
		this.medicalInfoNumber = medicalInfoNumber;
	}

	@Override
	public String toString() {
		return "DoctorBoardDTO [medicalInfoTitle=" + medicalInfoTitle + ", medicalInfoText=" + medicalInfoText
				+ ", memberName=" + memberName + ", medicalInfoDate=" + medicalInfoDate + ", doctorMajor=" + doctorMajor
				+ ", doctorName=" + doctorName + ", doctorCommentText=" + doctorCommentText + ", memberNumber="
				+ memberNumber + ", medicalInfoNumber=" + medicalInfoNumber + "]";
	}

}
