package com.doctorTreat.app.dto;

public class ChartDTO {

	private int chartNumber;
	private String chartName;
	private String medicine;
	private String day;
	private String time;
	private String period;
	private int memberNumber;
	private int doctorNumber;

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

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
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

	@Override
	public String toString() {
		return "ChartDTO [chartNumber=" + chartNumber + ", chartName=" + chartName + ", medicine=" + medicine + ", day="
				+ day + ", time=" + time + ", period=" + period + ", memberNumber=" + memberNumber + ", doctorNumber="
				+ doctorNumber + "]";
	}

}
