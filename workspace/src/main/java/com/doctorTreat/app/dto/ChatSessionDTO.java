package com.doctorTreat.app.dto;

public class ChatSessionDTO {
//    SESSION_NUMBER NUMBER,
//    SESSION_STATUS VARCHAR2(200) NOT NULL CHECK (SESSION_STATUS IN ('진료중', '진료대기', '진료종료')),
//    MEMBER_NUMBER NUMBER NOT NULL,
//    DOCTOR_NUMBER NUMBER NOT NULL,
	
	private int sessionNumber;
	private String sessionStatus;
	private int memberNumber;
	private int doctorNumber;
	
	public int getSessionNumber() {
		return sessionNumber;
	}
	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	public String getSessionStatus() {
		return sessionStatus;
	}
	public void setSessionStatus(String sessionStatus) {
		this.sessionStatus = sessionStatus;
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
		return "ChatSessionDTO [sessionNumber=" + sessionNumber + ", sessionStatus=" + sessionStatus + ", memberNumber="
				+ memberNumber + ", doctorNumber=" + doctorNumber + "]";
	}
	    
}
