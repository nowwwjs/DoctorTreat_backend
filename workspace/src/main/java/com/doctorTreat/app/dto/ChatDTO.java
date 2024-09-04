package com.doctorTreat.app.dto;

public class ChatDTO {
	private int chatNumber;
	private int chatRoomNumber;
	private String chatText;
	private String chatMsgDate;
	private int sessionNumber;

	public int getChatNumber() {
		return chatNumber;
	}
	public void setChatNumber(int chatNumber) {
		this.chatNumber = chatNumber;
	}
	public int getChatRoomNumber() {
		return chatRoomNumber;
	}
	public void setChatRoomNumber(int chatRoomNumber) {
		this.chatRoomNumber = chatRoomNumber;
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

	@Override
	public String toString() {
		return "ChatDTO [chatNumber=" + chatNumber + ", chatRoomNumber=" + chatRoomNumber + ", chatText=" + chatText
				+ ", chatMsgDate=" + chatMsgDate + ", sessionNumber=" + sessionNumber + "]";
	}
	
}
