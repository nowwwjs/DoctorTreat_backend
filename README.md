JSP DOCTOR TREAT
=

> 작업기간: 2024.08.16 ~ 2024.09.13 <br>
> 참여 인원 : 5명 <br> <br>
> 비대면 진료 서비스 <br>

![image](https://github.com/user-attachments/assets/a9e72512-9148-4612-9e9d-57cdace6967f)
![image](https://github.com/user-attachments/assets/38e0d8c1-c210-405f-b981-fdfbfe4e6b0b)
![image](https://github.com/user-attachments/assets/ee598256-9897-45b4-a08e-5888362c25c8)

## 📚목차
- [들어가며](#-들어가며)
  - [프로젝트 소개](#1️⃣-프로젝트-소개)    
  - [프로젝트 기능](#2️⃣-프로젝트-기능)    
  - [사용 기술](#3️⃣-사용-기술)   
     - [백엔드](#3-1-백엔드)
     - [프론트엔드](#3-2-프론트엔드)
  - [실행 화면](#4️⃣-실행-화면)   

- [구조 및 설계](#구조-및-설계)
  - [패키지 구조](#5️⃣-패키지-구조)
  - [DB 설계](#6️⃣-db-설계)
  - [API 설계](#7️⃣-api-설계)

- [개발 내용](#개발-내용)

- [마치며](#마치며)
  - [프로젝트 보완사항](#8️⃣-프로젝트-보완사항)
  - [후기](#9️⃣-후기)

## 💬들어가며
### 1️⃣ 프로젝트 소개

국비지원 수업의 중간 과정으로 팀 프로젝트를 진행하게 되었습니다. <br>
직접 가지 않아도 되는 비대면 진료 서비스를 이용하여 사용자의 편의성을 높였습니다. <br>
코로나 재유행도 대비하고 , 바쁜 현대인의 삶을 적극 반영한 서비스 입니다. 

### 2️⃣ 프로젝트 기능

제가 구현한 프로젝트의 주요 기능은 다음과 같습니다.

- **질병백과 -** 상세페이지 연결
- **지역별 병원 정보 -** 카카오맵 API 활용
- **의료지식인(일반회원) -** summerNote api 이용 , DB CRUD 활용


### 3️⃣ 사용 기술

#### 3-1 백엔드

##### 주요 프레임워크 / 라이브러리
- Java 17
- jsp
- MyBatis
- OAuth 2.0

##### DataBase
- Oracle 11.2.0.2.0

#### 3-2 프론트엔드
- Html/Css
- JavaScript
- Jquery
- jstl

### 4️⃣ 실행 화면
 <details>
    <summary>질병백과</summary>
     
  **1. 질병목록**<br>
 ![image](https://github.com/user-attachments/assets/6686ef0c-3f9e-4bd9-87ff-3c37c0bb699b)<br>
   이비인후과 , 내과로 나누어져 있고 각각 5개씩 질병목록이 나열되어 있다.
  <br><br>
       
  **2. 질병 상세 페이지**<br>
  ![image](https://github.com/user-attachments/assets/a9332172-704b-49b6-80e6-2f54d11ff8d9)<br>
  질병에 대한 사진과 기본적인 설명이 나와 있다.
  <br><br>

  </details>

 <details>
    <summary>지역별 병원 정보</summary>
     
  **1. 병원 목록**<br>
  ![image](https://github.com/user-attachments/assets/c1714f15-d8fc-4bfb-b359-5be2398da330)<br>
 키워드로 검색한 병원들이 쭉 나열된다.
  <br><br>
       
  **2. 병원 지도 정보**<br>
  ![image](https://github.com/user-attachments/assets/2315c37a-2bb1-4fba-a4e5-badc931b94f1)<br>
  키워드로 검색한 병원이 숫자형식으로 쭉 보여진다.
  <br><br>

  </details>

   <details>
    <summary>의료지식인 (일반회원)</summary>
     
  **1. 게시글 목록**<br>
 
 ![image](https://github.com/user-attachments/assets/e4a364dc-180a-47ee-a5fa-7b9184531965)<br>
 ![image](https://github.com/user-attachments/assets/2453b841-d974-4c78-80be-306076f4aff6)<br>
 작성된 게시글들이 5개씩 보여진다. 아래에는 페이지네이션도 존재한다. 
  <br><br>
       
  **2. 게시글 상세페이지**<br>
  ![image](https://github.com/user-attachments/assets/7750b589-fad3-4e0a-9479-f4fa84a9da50)<br>
  게시글에 대한 정보와 댓글이 보여진다.
  <br><br>

   **3. 게시글 작성**<br>
  ![image](https://github.com/user-attachments/assets/c29ab29d-46b6-4560-a13a-0db0262e258d)<br>
  썸머노트 api가 적용된 글작성 페이지이다.
  <br><br>

   **4. 게시글 수정**<br>
  ![image](https://github.com/user-attachments/assets/30daaf16-3046-4f55-a679-71f3150cc7a1)<br>
  기존에 작성한 게시글 내용이 남아있고 수정 페이지가 열린다.
  <br><br>

   **5. 게시글 삭제**<br>
  ![image](https://github.com/user-attachments/assets/0173763c-fcab-4152-a654-c3d1f51ccf9e)<br>
  삭제를 누르게 되면 목록에서 없어진다.
  <br><br>

  </details>

  
  <br>
  
## 구조 및 설계   
   
### 5️⃣ 패키지 구조
   
<details>
  
<summary>패키지 구조 보기 (Click)</summary>   
 

```
📦build
 ┗ 📂classes
 ┃ ┗ 📂com
 ┃ ┃ ┣ 📂doctorTreat
 ┃ ┃ ┃ ┗ 📂app
 ┃ ┃ ┃ ┃ ┣ 📂doctor
 ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DoctorDAO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorCheckIdOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorFindIdOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorFindPwOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorFrontController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorJoinOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorJoinSMSController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorLoginOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorLogoutOkController.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SMS_Service.class
 ┃ ┃ ┃ ┃ ┣ 📂doctorBoard
 ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DoctorBoardDAO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardCommentController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardCommentDeleteController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardCommentUpdateController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardDetailController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardFrontController.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜DoctorBoardListController.class
 ┃ ┃ ┃ ┃ ┣ 📂doctorClinic
 ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DoctorClinicDAO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatListDoctorController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomDoctorController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorClinicFrontController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorSendOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜WriteChartController.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜WriteChartOkController.class
 ┃ ┃ ┃ ┃ ┣ 📂doctorMypage
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorInfoOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorMypageFrontController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorOutOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorPhoneChangeOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorPwChangeOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorPwOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorUpdateOkController.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜DoctorUpdateProcessController.class
 ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardDetailDoctorDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChartDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatSessionDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ClinicDoctorListDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorCommentDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorDetailDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜HospitalDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MainDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MainMedicalInfoDTO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardDTO.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberDTO.class
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┗ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainMedicalInfoDAO.class
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MainMedicalInfoFrontController.class
 ┃ ┃ ┃ ┃ ┣ 📂member
 ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberDAO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberCheckIdOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberFindIdController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberFindPwController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberFrontController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberJoinOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberJoinSMSController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberLoginOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberLogoutOkController.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SMS_Service.class
 ┃ ┃ ┃ ┃ ┣ 📂memberBoard
 ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberBoardDAO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardDeleteController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardDetailController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardFrontController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardListController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardShowController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardUpdateController.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberBoardWriteController.class
 ┃ ┃ ┃ ┃ ┣ 📂memberClinic
 ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberClinicDAO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChartController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatListMemberController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomMemberController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ClinicApplicationOk.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorDetailController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜EarDoctorListController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InnerDoctorListController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberClinicFrontController.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberSendOkController.class
 ┃ ┃ ┃ ┃ ┣ 📂memberMypage
 ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberMypageDAO.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberInfoController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberMypageFrontController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberOutOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberPhoneChangeController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberPwChangeController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberPwOkController.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberUpdateController.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberUpdateProcessController.class
 ┃ ┃ ┃ ┃ ┣ 📂webSocket
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ChatWebSocket.class
 ┃ ┃ ┃ ┃ ┣ 📜Execute.class
 ┃ ┃ ┃ ┃ ┗ 📜Result.class
 ┃ ┃ ┗ 📂mybatis
 ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┣ 📜config.xml
 ┃ ┃ ┃ ┃ ┗ 📜MyBatisConfig.class
 ┃ ┃ ┃ ┗ 📂mapper
 ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜DoctorClinicMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜DoctorCommentMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜DoctorMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜DoctorMypageMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜Main.xml
 ┃ ┃ ┃ ┃ ┣ 📜MemberBoardMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜MemberClinicMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜MemberMapper.xml
 ┃ ┃ ┃ ┃ ┗ 📜MemberMypageMapper.xml
 ```
 ```
📦src
 ┗ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┣ 📂doctorTreat
 ┃ ┃ ┃ ┃ ┗ 📂app
 ┃ ┃ ┃ ┃ ┃ ┣ 📂doctor
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DoctorDAO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorCheckIdOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorFindIdOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorFindPwOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorFrontController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorJoinOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorJoinSMSController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorLoginOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorLogoutOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SMS_Service.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂doctorBoard
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DoctorBoardDAO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardCommentController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardCommentDeleteController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardCommentUpdateController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardDetailController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardFrontController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DoctorBoardListController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂doctorClinic
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DoctorClinicDAO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatListDoctorController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomDoctorController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorClinicFrontController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorSendOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜WriteChartController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WriteChartOkController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂doctorMypage
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorInfoOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorMypageFrontController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorOutOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorPhoneChangeOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorPwChangeOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorPwOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorUpdateOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DoctorUpdateProcessController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardDetailDoctorDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChartDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatSessionDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ClinicDoctorListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜HospitalDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainMedicalInfoDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainMedicalInfoDAO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MainMedicalInfoFrontController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂member
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberDAO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberCheckIdOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberFindIdController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberFindPwController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberFrontController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberJoinOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberJoinSMSController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberLoginOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberLogoutOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SMS_Service.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂memberBoard
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberBoardDAO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardDeleteController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardDetailController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardFrontController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardListController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardShowController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardUpdateController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberBoardWriteController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂memberClinic
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberClinicDAO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChartController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatListMemberController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomMemberController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ClinicApplicationOk.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorDetailController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜EarDoctorListController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜InnerDoctorListController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberClinicFrontController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberSendOkController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂memberMypage
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberMypageDAO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberInfoController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberMypageFrontController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberOutOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberPhoneChangeController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberPwChangeController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberPwOkController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberUpdateController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberUpdateProcessController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂webSocket
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ChatWebSocket.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜Execute.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜Result.java
 ┃ ┃ ┃ ┗ 📂mybatis
 ┃ ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┃ ┣ 📜config.xml
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MyBatisConfig.java
 ┃ ┃ ┃ ┃ ┗ 📂mapper
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorBoardMapper.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorClinicMapper.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorCommentMapper.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorMapper.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DoctorMypageMapper.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜Main.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberBoardMapper.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberClinicMapper.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberMapper.xml
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberMypageMapper.xml
 ┃ ┗ 📂webapp
 ┃ ┃ ┣ 📂app
 ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┣ 📜boardDetail.jsp
 ┃ ┃ ┃ ┃ ┣ 📜boardDetailAuth.jsp
 ┃ ┃ ┃ ┃ ┣ 📜boardDetailDoctor.jsp
 ┃ ┃ ┃ ┃ ┣ 📜boardDetailDoctorAuth.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorMedicalKnowledgeList.jsp
 ┃ ┃ ┃ ┃ ┣ 📜medicalKnowledgeList.jsp
 ┃ ┃ ┃ ┃ ┣ 📜updateBoard.jsp
 ┃ ┃ ┃ ┃ ┗ 📜write.jsp
 ┃ ┃ ┃ ┣ 📂book
 ┃ ┃ ┃ ┃ ┣ 📜bookDetail.jsp
 ┃ ┃ ┃ ┃ ┗ 📜disease.jsp
 ┃ ┃ ┃ ┣ 📂clinic
 ┃ ┃ ┃ ┃ ┣ 📜chart.jsp
 ┃ ┃ ┃ ┃ ┣ 📜chatListDoctor.jsp
 ┃ ┃ ┃ ┃ ┣ 📜chatListMember.jsp
 ┃ ┃ ┃ ┃ ┣ 📜chatRoomDoctor.jsp
 ┃ ┃ ┃ ┃ ┣ 📜chatRoomMember.jsp
 ┃ ┃ ┃ ┃ ┣ 📜clinicStartDoctor.jsp
 ┃ ┃ ┃ ┃ ┣ 📜clinicStartMember.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorDetail.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorListEar.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorListInner.jsp
 ┃ ┃ ┃ ┃ ┣ 📜test
 ┃ ┃ ┃ ┃ ┗ 📜writeChart.jsp
 ┃ ┃ ┃ ┣ 📂hospital
 ┃ ┃ ┃ ┃ ┗ 📜hospitalInfo.jsp
 ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┣ 📜doctorInfo.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorOut-Caution.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorOut-Complete.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorOut.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorPhoneChange.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorPhoneOk.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorPwChange.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorPwOk.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorUpdateMember.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberInfo.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberOut-Caution.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberOut-Complete.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberOut.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberPhoneChange.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberPhoneOk.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberPwChange.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberPwOk.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberUpdate.jsp
 ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┗ 📂user
 ┃ ┃ ┃ ┃ ┣ 📜doctorFindId.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorFindIdFinish.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorFindPw.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorFindPwFinish.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorJoin.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorJoinFinish.jsp
 ┃ ┃ ┃ ┃ ┣ 📜doctorLogin.jsp
 ┃ ┃ ┃ ┃ ┣ 📜joinType.jsp
 ┃ ┃ ┃ ┃ ┣ 📜loginType.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberFindId.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberFindIdFinish.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberFindPw.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberFindPwFinish.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberJoin.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberJoinFinish.jsp
 ┃ ┃ ┃ ┃ ┣ 📜memberLogin.jsp
 ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┣ 📂META-INF
 ┃ ┃ ┃ ┗ 📜MANIFEST.MF
 ┃ ┃ ┣ 📂static
 ┃ ┃ ┃ ┣ 📂css
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣ 📜boardDetail.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜medicalKnowledgeList.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜test
 ┃ ┃ ┃ ┃ ┃ ┣ 📜updateBoard.css
 ┃ ┃ ┃ ┃ ┃ ┗ 📜write.css
 ┃ ┃ ┃ ┃ ┣ 📂book
 ┃ ┃ ┃ ┃ ┃ ┣ 📜bookDetail.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜disease.css
 ┃ ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┃ ┣ 📂clinic
 ┃ ┃ ┃ ┃ ┃ ┣ 📜chart.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜chatListMember.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜chatRoom.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜choice.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorDetail.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorList.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜patientList.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜startClinic.css
 ┃ ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┃ ┣ 📂hospital
 ┃ ┃ ┃ ┃ ┃ ┣ 📜hospitalInfo.css
 ┃ ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorInfo.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorOut-Caution.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorOut-Complete.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorOut.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorPhoneChange.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorPhoneOk.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorPwChange.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorPwOk.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorUpdateMember.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberinfo.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberout-caution.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberout-complete.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberout.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberphonechange.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberphoneok.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberpwchange.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberpwok.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberupdate.css
 ┃ ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorFindId.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorFindIdFinish.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorFindPw.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorFindPwFinish.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorJoin.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorJoinFinish.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorLogin.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜joinType.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberFindId.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberFindIdFinish.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberFindPw.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberFindPwFinish.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberJoin.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberJoinFinish.css
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberLogin.css
 ┃ ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┃ ┣ 📜footer.css
 ┃ ┃ ┃ ┃ ┣ 📜footer2.css
 ┃ ┃ ┃ ┃ ┣ 📜header.css
 ┃ ┃ ┃ ┃ ┣ 📜headerDoctor.css
 ┃ ┃ ┃ ┃ ┣ 📜headerMember.css
 ┃ ┃ ┃ ┃ ┗ 📜main.css
 ┃ ┃ ┃ ┣ 📂image
 ┃ ┃ ┃ ┃ ┣ 📜chatBtn.png
 ┃ ┃ ┃ ┃ ┣ 📜circlecheck.png
 ┃ ┃ ┃ ┃ ┣ 📜Clinic.png
 ┃ ┃ ┃ ┃ ┣ 📜cold.png
 ┃ ┃ ┃ ┃ ┣ 📜cold2.png
 ┃ ┃ ┃ ┃ ┣ 📜covid.png
 ┃ ┃ ┃ ┃ ┣ 📜encyclopedia.png
 ┃ ┃ ┃ ┃ ┣ 📜hospital.png
 ┃ ┃ ┃ ┃ ┣ 📜hospitalInfo.png
 ┃ ┃ ┃ ┃ ┣ 📜hospitalMap.png
 ┃ ┃ ┃ ┃ ┣ 📜Knowledge.png
 ┃ ┃ ┃ ┃ ┣ 📜login.png
 ┃ ┃ ┃ ┃ ┣ 📜logo.png
 ┃ ┃ ┃ ┃ ┣ 📜logo1.png
 ┃ ┃ ┃ ┃ ┣ 📜memberJoin.png
 ┃ ┃ ┃ ┃ ┣ 📜myPage.png
 ┃ ┃ ┃ ┃ ┣ 📜noview.png
 ┃ ┃ ┃ ┃ ┣ 📜prescription.png
 ┃ ┃ ┃ ┃ ┣ 📜prescription2.png
 ┃ ┃ ┃ ┃ ┣ 📜prescription3.png
 ┃ ┃ ┃ ┃ ┣ 📜prescription4.png
 ┃ ┃ ┃ ┃ ┣ 📜QnA.png
 ┃ ┃ ┃ ┃ ┣ 📜row1.jpeg
 ┃ ┃ ┃ ┃ ┣ 📜row2.jpeg
 ┃ ┃ ┃ ┃ ┣ 📜row3.jpeg
 ┃ ┃ ┃ ┃ ┣ 📜sick1.jpeg
 ┃ ┃ ┃ ┃ ┣ 📜sick10.jpg
 ┃ ┃ ┃ ┃ ┣ 📜sick2.jpg
 ┃ ┃ ┃ ┃ ┣ 📜sick3.jpg
 ┃ ┃ ┃ ┃ ┣ 📜sick4.jpg
 ┃ ┃ ┃ ┃ ┣ 📜sick5.jpg
 ┃ ┃ ┃ ┃ ┣ 📜sick6.jpg
 ┃ ┃ ┃ ┃ ┣ 📜sick7.jpg
 ┃ ┃ ┃ ┃ ┣ 📜sick8.jpg
 ┃ ┃ ┃ ┃ ┣ 📜sick9.jpg
 ┃ ┃ ┃ ┃ ┣ 📜stomach.png
 ┃ ┃ ┃ ┃ ┣ 📜toTop.png
 ┃ ┃ ┃ ┃ ┗ 📜view.png
 ┃ ┃ ┃ ┣ 📂js
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣ 📜boardModify.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜delete.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜updateBoard.js
 ┃ ┃ ┃ ┃ ┃ ┗ 📜write.js
 ┃ ┃ ┃ ┃ ┣ 📂book
 ┃ ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┃ ┣ 📂clinic
 ┃ ┃ ┃ ┃ ┃ ┣ 📜chart.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorChating.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorDetail.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorList.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberChating.js
 ┃ ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┃ ┣ 📂hospital
 ┃ ┃ ┃ ┃ ┃ ┣ 📜hospitalInfo.js
 ┃ ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorOut.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorPhoneChange.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorPhoneOk.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorPwChange.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorPwOk.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorUpdateMember.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberInfo.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberout.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberphoneok.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberpwchange.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberpwok.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberUpdate.js
 ┃ ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorJoin.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜doctorLogin.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberJoin.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜memberLogin.js
 ┃ ┃ ┃ ┃ ┃ ┗ 📜test
 ┃ ┃ ┃ ┃ ┗ 📜main.js
 ┃ ┃ ┃ ┗ 📂summernote
 ┃ ┃ ┃ ┃ ┣ 📂font
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote.eot
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote.ttf
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote.woff
 ┃ ┃ ┃ ┃ ┃ ┗ 📜summernote.woff2
 ┃ ┃ ┃ ┃ ┣ 📂lang
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ar-AR.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ar-AR.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ar-AR.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-az-AZ.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-az-AZ.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-az-AZ.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-bg-BG.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-bg-BG.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-bg-BG.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ca-ES.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ca-ES.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ca-ES.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-cs-CZ.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-cs-CZ.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-cs-CZ.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-da-DK.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-da-DK.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-da-DK.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-de-DE.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-de-DE.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-de-DE.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-el-GR.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-el-GR.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-el-GR.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-es-ES.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-es-ES.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-es-ES.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-es-EU.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-es-EU.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-es-EU.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-fa-IR.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-fa-IR.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-fa-IR.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-fi-FI.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-fi-FI.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-fi-FI.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-fr-FR.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-fr-FR.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-fr-FR.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-gl-ES.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-gl-ES.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-gl-ES.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-he-IL.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-he-IL.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-he-IL.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-hr-HR.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-hr-HR.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-hr-HR.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-hu-HU.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-hu-HU.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-hu-HU.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-id-ID.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-id-ID.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-id-ID.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-it-IT.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-it-IT.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-it-IT.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ja-JP.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ja-JP.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ja-JP.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ko-KR.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ko-KR.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ko-KR.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-lt-LT.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-lt-LT.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-lt-LT.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-lt-LV.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-lt-LV.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-lt-LV.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-mn-MN.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-mn-MN.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-mn-MN.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-nb-NO.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-nb-NO.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-nb-NO.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-nl-NL.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-nl-NL.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-nl-NL.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-pl-PL.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-pl-PL.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-pl-PL.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-pt-BR.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-pt-BR.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-pt-BR.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-pt-PT.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-pt-PT.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-pt-PT.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ro-RO.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ro-RO.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ro-RO.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ru-RU.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ru-RU.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ru-RU.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sk-SK.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sk-SK.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sk-SK.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sl-SI.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sl-SI.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sl-SI.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sr-RS-Latin.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sr-RS-Latin.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sr-RS-Latin.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sr-RS.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sr-RS.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sr-RS.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sv-SE.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sv-SE.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-sv-SE.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ta-IN.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ta-IN.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ta-IN.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-th-TH.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-th-TH.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-th-TH.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-tr-TR.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-tr-TR.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-tr-TR.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-uk-UA.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-uk-UA.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-uk-UA.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-uz-UZ.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-uz-UZ.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-uz-UZ.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-vi-VN.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-vi-VN.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-vi-VN.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-zh-CN.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-zh-CN.min.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-zh-CN.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-zh-TW.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-zh-TW.min.js
 ┃ ┃ ┃ ┃ ┃ ┗ 📜summernote-zh-TW.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┣ 📂plugin
 ┃ ┃ ┃ ┃ ┃ ┣ 📂databasic
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜summernote-ext-databasic.css
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜summernote-ext-databasic.js
 ┃ ┃ ┃ ┃ ┃ ┣ 📂hello
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜summernote-ext-hello.js
 ┃ ┃ ┃ ┃ ┃ ┗ 📂specialchars
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜summernote-ext-specialchars.js
 ┃ ┃ ┃ ┃ ┣ 📜summernote-bs4.css
 ┃ ┃ ┃ ┃ ┣ 📜summernote-bs4.js
 ┃ ┃ ┃ ┃ ┣ 📜summernote-bs4.js.map
 ┃ ┃ ┃ ┃ ┣ 📜summernote-bs4.min.css
 ┃ ┃ ┃ ┃ ┣ 📜summernote-bs4.min.js
 ┃ ┃ ┃ ┃ ┣ 📜summernote-bs4.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┣ 📜summernote-bs4.min.js.map
 ┃ ┃ ┃ ┃ ┣ 📜summernote-lite.css
 ┃ ┃ ┃ ┃ ┣ 📜summernote-lite.js
 ┃ ┃ ┃ ┃ ┣ 📜summernote-lite.js.map
 ┃ ┃ ┃ ┃ ┣ 📜summernote-lite.min.css
 ┃ ┃ ┃ ┃ ┣ 📜summernote-lite.min.js
 ┃ ┃ ┃ ┃ ┣ 📜summernote-lite.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┣ 📜summernote-lite.min.js.map
 ┃ ┃ ┃ ┃ ┣ 📜summernote.css
 ┃ ┃ ┃ ┃ ┣ 📜summernote.js
 ┃ ┃ ┃ ┃ ┣ 📜summernote.js.map
 ┃ ┃ ┃ ┃ ┣ 📜summernote.min.css
 ┃ ┃ ┃ ┃ ┣ 📜summernote.min.js
 ┃ ┃ ┃ ┃ ┣ 📜summernote.min.js.LICENSE.txt
 ┃ ┃ ┃ ┃ ┗ 📜summernote.min.js.map
 ┃ ┃ ┣ 📂WEB-INF
 ┃ ┃ ┃ ┣ 📂lib
 ┃ ┃ ┃ ┃ ┣ 📜javaSDK-2.2.jar
 ┃ ┃ ┃ ┃ ┣ 📜json-simple-1.1.1.jar
 ┃ ┃ ┃ ┃ ┣ 📜jstl.jar
 ┃ ┃ ┃ ┃ ┣ 📜mybatis-3.5.11.jar
 ┃ ┃ ┃ ┃ ┣ 📜ojdbc6.jar
 ┃ ┃ ┃ ┃ ┣ 📜standard.jar
 ┃ ┃ ┃ ┃ ┗ 📜tomcat-dbcp.jar
 ┃ ┃ ┃ ┗ 📜web.xml
 ┃ ┃ ┣ 📜footer.jsp
 ┃ ┃ ┣ 📜footer2.jsp
 ┃ ┃ ┣ 📜header.jsp
 ┃ ┃ ┣ 📜headerDoctor.jsp
 ┃ ┃ ┣ 📜headerMember.jsp
 ┃ ┃ ┣ 📜index.jsp
 ┃ ┃ ┗ 📜test.jsp
 ```
 </details>   
 <br/>    
   
     
 ### 6️⃣ DB 설계
 
![image](https://github.com/user-attachments/assets/68a95369-990d-4a78-8480-1b1343763ab3)<br>


![image](https://github.com/user-attachments/assets/6ac0295d-3632-4d0b-85e0-d50124c1a591)
![image](https://github.com/user-attachments/assets/0b7c5f8d-82db-4560-a33d-21a6f9d7a68d)
![image](https://github.com/user-attachments/assets/82726fb7-c2ce-4b98-a942-de64a990de50)
![image](https://github.com/user-attachments/assets/77c5c42e-0d00-4580-8e1f-d13ba46da591)
![image](https://github.com/user-attachments/assets/ac2fe633-05ee-4f2b-be33-59b9bb40edc9)
![image](https://github.com/user-attachments/assets/32633068-c58a-452b-a5de-576122334830)
![image](https://github.com/user-attachments/assets/5066ea53-d31f-4f5e-b67c-201a841384b6)
![image](https://github.com/user-attachments/assets/2f5aa702-5941-4a8e-abe2-9a025ed02504)
![image](https://github.com/user-attachments/assets/7aa1652d-9de7-46ba-9016-e70dcec16310)

<br/>

### 7️⃣ API 설계 & 화면 구상

![image](https://github.com/user-attachments/assets/76c33a70-8f8d-49f1-8301-d54d04821efa)<br><br>
![서비스 흐름도](https://github.com/user-attachments/assets/5a470e0c-9364-4a2b-8453-04e67907a3c5)<br>

## 개발 내용

- <a href="https://blog.naver.com/starve1304/223677221923" target="_blank">doctorTreat 기술 블로그</a>
<br>

## 마치며   
### 8️⃣ 프로젝트 보완사항   

첫째 , 의료지식인 페이지에서 수정 , 삭제 , 작성을 했을 때 event 가 없습니다. <br>
CRUD를 구현하는데 급급하다 보니 디테일한 부분을 신경을 못썼습니다 . <br>
따라서 alert 창을 띄우는 방식으로 해결하겠습니다. <br>

둘째 , 질병백과의 페이지 다양화 입니다. <br>
지금은 정적인 페이지로 이루어져 있지만 테이블도 만들고 더 다양하게 질병을 추가해서 <br>
사람들이 많이 사용할 수 있는 서비스로 만들겠습니다. <br>

<br>   
   <details>
  <summary>추가할 기능 (Click)</summary>
     
- 모든 event에 대한 alert 구현
- 질병백과 다양화
  
</details>  
<br>

### 9️⃣ 후기   

처음으로 웹 개발 프로젝트를 진행하면서 MVC 패턴을 접했는데, 처음이라 그런지 데이터 흐름을 이해하고 화면에 출력하기까지 꽤 어려웠습니다. <br>
JSP로 데이터를 주고받는 과정에서 로직 분리가 중요하다는 걸 많이 느꼈습니다. <br>
처음이라 힘들었지만, 점점 익숙해지면 훨씬 수월해질 것 같아 더 연습해야겠다고 다짐했습니다. <br>

1) 협업
이번 4주간의 프로젝트를 진행하면서 제 파트에 집중한 나머지 다른 팀원들의 성취도와 진척 상황을 꼼꼼하게 살피지 못한 부분이 아쉬웠습니다. <br>
앞으로는 프로젝트 전체 흐름을 더 잘 조율하며, 팀원들과 보조를 맞춰 진행할 수 있도록 더욱 신경 쓰겠습니다. <br>

2) 기술 및 개선사항
기술적인 면에서는 첫번째로 세션 값을 이용하는 것이 처음엔 다소 어려웠지만, 쿼리 스트링을 통해 데이터를 전달하고 전체 흐름을 하나씩 이해하며 문제를 해결했습니다. <br>
두번째로 삭제를 하는 과정에서 여러 테이블이 연결되어 있어 어려움이 있었는데 , 참조값을 확인하며 여러 개의 delete를 순서대로 진행하며 해결했습니다.<br>
의료 지식인 페이지에서 수정/삭제를 했을 때 js 처리를 제대로 안한 것과 지도 api를 그대로 가져와서 사용한 부분이 아쉬웠습니다.<br>
앞으로는 모든 event처리에 대해서 꼼꼼히 처리를 하고 , api에 대해서 응용력을 높이는 방향으로 나아가겠습니다. <br>
