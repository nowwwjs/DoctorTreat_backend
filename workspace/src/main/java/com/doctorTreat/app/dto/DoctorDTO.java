package com.doctorTreat.app.dto;

public class DoctorDTO {
//	 DOCTOR_NUMBER NUMBER,
//	    DOCTOR_ID VARCHAR2(200) UNIQUE NOT NULL,
//	    DOCTOR_PW VARCHAR2(200) NOT NULL,
//	    DOCTOR_NAME VARCHAR2(200) NOT NULL,
//	    DOCTOR_PHONE VARCHAR2(200) UNIQUE NOT NULL,
//	    DOCTOR_LICENSE VARCHAR2(200) UNIQUE NOT NULL,
//	    DOCTOR_MAJOR VARCHAR2(200) NOT NULL,
//	    HOSPITAL_NUMBER NUMBER,
//	    CONSTRAINT PK_DOCTOR PRIMARY KEY (DOCTOR_NUMBER),
//	    CONSTRAINT FK_DOCTOR_HOSPITAL FOREIGN KEY (HOSPITAL_NUMBER) REFERENCES DT_HOSPITAL(HOSPITAL_NUMBER)
	private int doctorNumber;
	private String doctorId;
	private String doctorPw;
	private String doctorName;
	private String doctorPhone;
	private String doctorLicense;
	private String doctorMajor;
	
	
	//getter/setter 
	public int getDoctorNumber() {
		return doctorNumber;
	}
	public void setDoctorNumber(int doctorNumber) {
		this.doctorNumber = doctorNumber;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorPw() {
		return doctorPw;
	}
	public void setDoctorPw(String doctorPw) {
		this.doctorPw = doctorPw;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorPhone() {
		return doctorPhone;
	}
	public void setDoctorPhone(String doctorPhone) {
		this.doctorPhone = doctorPhone;
	}
	public String getDoctorLicense() {
		return doctorLicense;
	}
	public void setDoctorLicense(String doctorLicense) {
		this.doctorLicense = doctorLicense;
	}
	public String getDoctorMajor() {
		return doctorMajor;
	}
	public void setDoctorMajor(String doctorMajor) {
		this.doctorMajor = doctorMajor;
	}
	
	
	@Override
	public String toString() {
		return "DoctorDTO [doctorNumber=" + doctorNumber + ", doctorId=" + doctorId + ", doctorPw=" + doctorPw
				+ ", doctorName=" + doctorName + ", doctorPhone=" + doctorPhone + ", doctorLicense=" + doctorLicense
				+ ", doctorMajor=" + doctorMajor + "]";
	}
	
	
	
	
	
	
	
}
