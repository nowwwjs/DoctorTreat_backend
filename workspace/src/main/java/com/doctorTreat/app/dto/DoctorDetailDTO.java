package com.doctorTreat.app.dto;

public class DoctorDetailDTO {
	private String hospitalName;
	private String doctorName;
	private String doctorMajor;
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
				+ doctorMajor + ", hospitalNightWork=" + hospitalNightWork + ", hospitalCall=" + hospitalCall + "]";
	}

}
