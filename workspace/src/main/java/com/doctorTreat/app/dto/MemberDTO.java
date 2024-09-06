package com.doctorTreat.app.dto;

public class MemberDTO {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String addressPostal;
	private String addressAddress;
	private String addressDetail;
	private String memberBirth;
	private String memberPhone;



	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
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

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
				+ ", addressPostal=" + addressPostal + ", addressAddress=" + addressAddress + ", addressDetail="
				+ addressDetail + ", memberBirth=" + memberBirth + ", memberPhone=" + memberPhone + "]";
	}



	

	
}