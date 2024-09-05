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
	
//	ADDRESS_POSTAL VARCHAR2(10) NOT NULL,
//    ADDRESS_ADDRESS VARCHAR2(200) NOT NULL,
//    ADDRESS_DETAIL VARCHAR2(200) NOT NULL,
	
	
	
	
//	HOSPITAL_NUMBER NUMBER,
//    HOSPITAL_CALL VARCHAR2(200) NOT NULL,
//    HOSPITAL_NAME VARCHAR2(200) NOT NULL,
//    HOSPITAL_WORK_TIME DATE NOT NULL,
//    HOSPITAL_LUNCH_TIME DATE NOT NULL,
//    HOSPITAL_REST_TIME VARCHAR2(200) DEFAULT '주말,공휴일' NOT NULL,
//    HOSPITAL_NIGHT_WORK VARCHAR2(200) DEFAULT '없음' NOT NULL,
//    ADDRESS_NUMBER NUMBER,
//    CONSTRAINT PK_HOSPITAL PRIMARY KEY (HOSPITAL_NUMBER),
//    CONSTRAINT FK_HOSPITAL_ADDRESS FOREIGN KEY (ADDRESS_NUMBER) REFERENCES DT_ADDRESS(ADDRESS_NUMBER)
	
	
//	CREATE TABLE DT_ADDRESS (
//		    ADDRESS_NUMBER NUMBER ,
//		    ADDRESS_POSTAL VARCHAR2(10) NOT NULL,
//		    ADDRESS_ADDRESS VARCHAR2(200) NOT NULL,
//		    ADDRESS_DETAIL VARCHAR2(200) NOT NULL,
//		    CONSTRAINT PK_ADDRESS PRIMARY KEY (ADDRESS_NUMBER)
//		);
	
	
	
	
	private int doctorNumber;
	private String doctorId;
	private String doctorPw;
	private String doctorName;
	private String doctorPhone;
	private String doctorLicense;
	private String doctorMajor;
	private int hospitalNumber; //병원 번호
	private String hospitalCall;
	private String hospitalName;
	private String hospitalWorkTime;
	private String hospitalLunchTime;
	private String hospitalRestTime;
	private String hospitalNightWork;
	private int addressNumber; // 주소 번호
	private String addressPostal;
	private String addressAddress;
	private String addressDetail;
	
	
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
	public int getHospitalNumber() {
		return hospitalNumber;
	}
	public void setHospitalNumber(int hospitalNumber) {
		this.hospitalNumber = hospitalNumber;
	}
	public String getHospitalCall() {
		return hospitalCall;
	}
	public void setHospitalCall(String hospitalCall) {
		this.hospitalCall = hospitalCall;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalWorkTime() {
		return hospitalWorkTime;
	}
	public void setHospitalWorkTime(String hospitalWorkTime) {
		this.hospitalWorkTime = hospitalWorkTime;
	}
	public String getHospitalLunchTime() {
		return hospitalLunchTime;
	}
	public void setHospitalLunchTime(String hospitalLunchTime) {
		this.hospitalLunchTime = hospitalLunchTime;
	}
	public String getHospitalRestTime() {
		return hospitalRestTime;
	}
	public void setHospitalRestTime(String hospitalRestTime) {
		this.hospitalRestTime = hospitalRestTime;
	}
	public String getHospitalNightWork() {
		return hospitalNightWork;
	}
	public void setHospitalNightWork(String hospitalNightWork) {
		this.hospitalNightWork = hospitalNightWork;
	}
	public int getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getAddressPostal() {
		return addressPostal;
	}
	public void setAddressPostal(String addressPostal) {
		this.addressPostal = addressPostal;
	}
	public String getAddressAddress() {
		return addressAddress;
	}
	public void setAddressAddress(String addressAddress) {
		this.addressAddress = addressAddress;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "DoctorDTO [doctorNumber=" + doctorNumber + ", doctorId=" + doctorId + ", doctorPw=" + doctorPw
				+ ", doctorName=" + doctorName + ", doctorPhone=" + doctorPhone + ", doctorLicense=" + doctorLicense
				+ ", doctorMajor=" + doctorMajor + ", hospitalNumber=" + hospitalNumber + ", hospitalCall="
				+ hospitalCall + ", hospitalName=" + hospitalName + ", hospitalWorkTime=" + hospitalWorkTime
				+ ", hospitalLunchTime=" + hospitalLunchTime + ", hospitalRestTime=" + hospitalRestTime
				+ ", hospitalNightWork=" + hospitalNightWork + ", addressNumber=" + addressNumber + ", addressPostal="
				+ addressPostal + ", addressAddress=" + addressAddress + ", addressDetail=" + addressDetail + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
