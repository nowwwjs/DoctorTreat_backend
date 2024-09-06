package com.doctorTreat.app.dto;

public class DoctorDetailDTO {
	private String hospitalName;
	private String doctorName;
	private String doctorMajor;
	private String hospitalWorkTime;
	private String hospitalLunchTime;
	private String hospitalRestTime;
	private String hospitalNightWork;
	private String hospitalCall;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorMajor() {
		return doctorMajor;
	}

	public void setDoctorMajor(String doctorMajor) {
		this.doctorMajor = doctorMajor;
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

	public String getHospitalCall() {
		return hospitalCall;
	}

	public void setHospitalCall(String hospitalCall) {
		this.hospitalCall = hospitalCall;
	}

	@Override
	public String toString() {
		return "DoctorDetailDTO [hospitalName=" + hospitalName + ", doctorName=" + doctorName + ", doctorMajor="
				+ doctorMajor + ", hospitalWorkTime=" + hospitalWorkTime + ", hospitalLunchTime=" + hospitalLunchTime
				+ ", hospitalRestTime=" + hospitalRestTime + ", hospitalNightWork=" + hospitalNightWork
				+ ", hospitalCall=" + hospitalCall + "]";
	}

}
