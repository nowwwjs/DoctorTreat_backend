package com.doctorTreat.app.dto;

public class DoctorCommentDTO {
	private String medicalInfoTitle;
	private String memberName;
	private String medicalInfoDate;
	private String medicalInfoText;
	private String doctorMajor;
	private String doctorName;
	private String doctorCommentText;
	private int medicalInfoNumber;
	private int doctorNumber;
	private int doctorCommentNumber;

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

	public int getMedicalInfoNumber() {
		return medicalInfoNumber;
	}

	public void setMedicalInfoNumber(int medicalInfoNumber) {
		this.medicalInfoNumber = medicalInfoNumber;
	}

	public int getDoctorNumber() {
		return doctorNumber;
	}

	public void setDoctorNumber(int doctorNumber) {
		this.doctorNumber = doctorNumber;
	}

	public int getDoctorCommentNumber() {
		return doctorCommentNumber;
	}

	public void setDoctorCommentNumber(int doctorCommentNumber) {
		this.doctorCommentNumber = doctorCommentNumber;
	}

	@Override
	public String toString() {
		return "DoctorCommentDTO [medicalInfoTitle=" + medicalInfoTitle + ", memberName=" + memberName
				+ ", medicalInfoDate=" + medicalInfoDate + ", medicalInfoText=" + medicalInfoText + ", doctorMajor="
				+ doctorMajor + ", doctorName=" + doctorName + ", doctorCommentText=" + doctorCommentText
				+ ", medicalInfoNumber=" + medicalInfoNumber + ", doctorNumber=" + doctorNumber
				+ ", doctorCommentNumber=" + doctorCommentNumber + "]";
	}

}