package com.doctorTreat.app.dto;

public class HospitalDTO {
//    HOSPITAL_NUMBER NUMBER,
//    HOSPITAL_NUMBER NUMBER,
//    HOSPITAL_CALL VARCHAR2(200) NOT NULL,
//    HOSPITAL_NAME VARCHAR2(200) NOT NULL,
//    HOSPITAL_WORK_TIME DATE NOT NULL,
//    HOSPITAL_LUNCH_TIME DATE NOT NULL,
//    HOSPITAL_REST_TIME VARCHAR2(200) DEFAULT '주말,공휴일' NOT NULL,
//    HOSPITAL_NIGHT_WORK VARCHAR2(200) DEFAULT '없음' NOT NULL,
//    ADDRESS_NUMBER NUMBER,

	private int hospitalNumber;
	private String hospitalCall;
	private String hospitalName;
	private String hospitalWorkTime;
	private String hospitalLunchTime;
	private String hospitalRestTime;
	private String hospitalNightWork;
	private int addressNumber;

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

	@Override
	public String toString() {
		return "HospitalDTO [hospitalNumber=" + hospitalNumber + ", hospitalCall=" + hospitalCall + ", hospitalName="
				+ hospitalName + ", hospitalWorkTime=" + hospitalWorkTime + ", hospitalLunchTime=" + hospitalLunchTime
				+ ", hospitalRestTime=" + hospitalRestTime + ", hospitalNightWork=" + hospitalNightWork
				+ ", addressNumber=" + addressNumber + "]";
	}

}
