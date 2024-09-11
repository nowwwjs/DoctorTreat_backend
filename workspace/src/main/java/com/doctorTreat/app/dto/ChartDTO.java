package com.doctorTreat.app.dto;

public class ChartDTO {

	private int chartNumber;
	private String chartName;
	private String chartMedicine;
	private String chartDay;
	private String chartTime;
	private String chartPeriod;
	private int memberNumber;
	private int doctorNumber;
	private String chartWriteDate;
	private String memberName;
	private String memberBirth;
	private String hospitalName;
	private String doctorName;

	public int getChartNumber() {
		return chartNumber;
	}

	public void setChartNumber(int chartNumber) {
		this.chartNumber = chartNumber;
	}

	public String getChartName() {
		return chartName;
	}

	public void setChartName(String chartName) {
		this.chartName = chartName;
	}

	public String getChartMedicine() {
		return chartMedicine;
	}

	public void setChartMedicine(String chartMedicine) {
		this.chartMedicine = chartMedicine;
	}

	public String getChartDay() {
		return chartDay;
	}

	public void setChartDay(String chartDay) {
		this.chartDay = chartDay;
	}

	public String getChartTime() {
		return chartTime;
	}

	public void setChartTime(String chartTime) {
		this.chartTime = chartTime;
	}

	public String getChartPeriod() {
		return chartPeriod;
	}

	public void setChartPeriod(String chartPeriod) {
		this.chartPeriod = chartPeriod;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public int getDoctorNumber() {
		return doctorNumber;
	}

	public void setDoctorNumber(int doctorNumber) {
		this.doctorNumber = doctorNumber;
	}

	public String getChartWriteDate() {
		return chartWriteDate;
	}

	public void setChartWriteDate(String chartWriteDate) {
		this.chartWriteDate = chartWriteDate;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

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

	@Override
	public String toString() {
		return "ChartDTO [chartNumber=" + chartNumber + ", chartName=" + chartName + ", chartMedicine=" + chartMedicine
				+ ", chartDay=" + chartDay + ", chartTime=" + chartTime + ", chartPeriod=" + chartPeriod
				+ ", memberNumber=" + memberNumber + ", doctorNumber=" + doctorNumber + ", chartWriteDate="
				+ chartWriteDate + ", memberName=" + memberName + ", memberBirth=" + memberBirth + ", hospitalName="
				+ hospitalName + ", doctorName=" + doctorName + "]";
	}

}