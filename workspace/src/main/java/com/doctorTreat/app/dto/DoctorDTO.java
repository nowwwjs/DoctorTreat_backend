package com.doctorTreat.app.dto;

public class DoctorDTO {

   private int doctorNumber;
   private String doctorId;
   private String doctorPw;
   private String doctorName;
   private String doctorPhone;
   private String doctorLicense;
   private String doctorMajor;
   private int hospitalNumber; // 병원 번호
   private String hospitalCall;
   private String hospitalName;
   private int addressNumber; // 주소 번호
   private String addressPostal;
   private String addressAddress;
   private String addressDetail;

   // getter/setter
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
            + ", doctorName=" + doctorName + ", doctorPhone=" + doctorPhone +  ", doctorMajor=" + doctorMajor 
            + ", hospitalNumber=" + hospitalNumber + ", hospitalCall="
            + hospitalCall + ", hospitalName=" + hospitalName + ", addressNumber=" + addressNumber
            + ", addressPostal=" + addressPostal + ", addressAddress=" + addressAddress + ", addressDetail="
            + addressDetail + "]";
   }

}
