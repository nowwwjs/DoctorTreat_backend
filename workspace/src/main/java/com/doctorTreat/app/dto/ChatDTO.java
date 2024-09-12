package com.doctorTreat.app.dto;

public class ChatDTO {
	private int chatNumber;
	private String chatText;
	private String chatMsgDate;
	private int sessionNumber;
	private int memberNumber;
	private int doctorNumber;

	public int getChatNumber() {
		return chatNumber;
	}

	public void setChatNumber(int chatNumber) {
		this.chatNumber = chatNumber;
	}

	public String getChatText() {
		return chatText;
	}

	public void setChatText(String chatText) {
		this.chatText = chatText;
	}

	public String getChatMsgDate() {
		return chatMsgDate;
	}

	public void setChatMsgDate(String chatMsgDate) {
		this.chatMsgDate = chatMsgDate;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
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
		return "ChatDTO [chatNumber=" + chatNumber + ", chatText=" + chatText + ", chatMsgDate=" + chatMsgDate
				+ ", sessionNumber=" + sessionNumber + ", memberNumber=" + memberNumber + ", doctorNumber="
				+ doctorNumber + "]";
	}

}
