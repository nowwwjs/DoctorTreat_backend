package com.doctorTreat.app.dto;

public class BoardDetailDoctorDTO {
	private String medicalInfoTitle;
	private String memberName;
	private String medicalInfoDate;
	private String medicalInfoText;
	private int memberNumber;

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

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public BoardDetailDoctorDTO(String medicalInfoTitle, String memberName, String medicalInfoDate,
			String medicalInfoText, int memberNumber) {
		super();
		this.medicalInfoTitle = medicalInfoTitle;
		this.memberName = memberName;
		this.medicalInfoDate = medicalInfoDate;
		this.medicalInfoText = medicalInfoText;
		this.memberNumber = memberNumber;
	}

}
