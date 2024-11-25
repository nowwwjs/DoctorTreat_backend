Spring Boot 프로젝트 맛있는재활용
=

> 작업기간: 2024.09.27 ~ 2023.11.15 <br>
> 참여 인원 : 5명 <br> <br>
> 음식물 쓰레기 감소를 위한 챗봇 레시피 추천 웹서비스 입니다 <br>

![메인 페이지](https://github.com/user-attachments/assets/d48cbb34-572c-4d88-856d-2941d4dbb4c7)

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

국비지원 수업의 마지막 과정으로 팀 프로젝트를 진행하게 되었습니다. <br>
서비스 이용을 진행 할수록 누적되는 적절한 보상과 출석체크 시스템 및 공공데이터를 활용하여 <br>
유저들의 환경보호 참여의지를 고취시키는 챗봇 서비스 입니다

### 2️⃣ 프로젝트 기능

제가 구현한 프로젝트의 주요 기능은 다음과 같습니다.

- **관리자 -** 삭제 기능 , 검색 기능 , 파일 등록 , 파일 삭제 , 상세페이지 연결
- **레시피 -** 찜 기능 , 추천 기능 , 신고 기능
- **게시판 -** toast api 이용한 글등록


### 3️⃣ 사용 기술

#### 3-1 백엔드

##### 주요 프레임워크 / 라이브러리
- Java 17
- SpringBoot 3.2.10
- MyBatis
- Spring Security
- OAuth 2.0

##### Build Tool
- Gradle 7.2

##### DataBase
- Oracle 11.2.0.2.0

#### 3-2 프론트엔드
- Html/Css
- JavaScript
- Jquery
- ThymeLeaf

### 4️⃣ 실행 화면
 <details>
    <summary>관리자 관련</summary>
     
  **1. 관리자 대시보드**<br>
  ![대시보드](https://github.com/user-attachments/assets/5c5f987d-1bca-4a49-85f0-1fce051ad778)<br>
  로그인한 관리자의 이름이 왼쪽 상단에 뜨고 , 회원 수 , 신고 수 , 오늘 날짜 , 권리자 신원정보를 제공한다.
  
  <br><br><br>
       
  **2. 회원 관리**<br>
  ![회원관리-1](https://github.com/user-attachments/assets/9cd79e20-15f9-4651-b7cd-0aa352ee7bf3)<br>
  회원의 기본 정보와 현재 상태를 보여준다.<br><br>

  ![회원관리-3](https://github.com/user-attachments/assets/c7834b8e-98bf-4fe1-8df8-1b781de204b5)<br>
 닉네임 4번 회원이 7일 정지된 모습<br><br>

 ![회원관리-4](https://github.com/user-attachments/assets/8f87fafb-9190-4636-8091-9e3ef5bcc317)<br>
 닉네임 2번 회원이 탈퇴된 모습<br><br> 

![회원관리-2](https://github.com/user-attachments/assets/64484cea-16d6-432f-b383-af32845a5a59)<br>
 닉네임 12번 회원을 검색한 모습
 
<br><br><br>

  **3. 게시글 관리** <br>
  ![게시글 관리-1](https://github.com/user-attachments/assets/d1e5e9b2-7a5d-4244-b5f1-80fe8ff8e389)<br>
  제목 , 작성자 , 추천수 , 작성일 , 게시글 종류를 보여준다.<br><br>

  ![게시글 관리-2](https://github.com/user-attachments/assets/d475df98-f18d-4cb4-b2b4-183e5171af0e)<br>
  30번 게시글의 모습<br><br>

 ![게시글 관리-3](https://github.com/user-attachments/assets/a5381bd8-0bc2-4922-a860-ede5701b964f)<br>
  10번 게시글 삭제된 모습

  <br><br><br>

  **4.레시피 관리** <br> 
  ![레시피 관리-1](https://github.com/user-attachments/assets/73938b57-00f6-40ce-b43d-605397bcfae9)<br>
  제목 , 작성자 , 추천수 , 작성일 , 레시피 종류를 보여준다.<br><br>

 ![레시피 관리-2](https://github.com/user-attachments/assets/40fff5d6-47bb-4bf7-a23a-238f68ff0f7e)<br>
  190번 게시글의 모습<br><br>

 ![레시피 관리-3](https://github.com/user-attachments/assets/8f2a2c6e-f67c-4e06-b9e6-9aceb2db63b7)<br>
  103번 게시글 삭제된 모습

  <br><br><br>

  **5.댓글 관리** <br>
 ![댓글 관리-1](https://github.com/user-attachments/assets/a300f3ef-a05a-436e-a63e-cc765f6fef12)<br>
  댓글내 , 작성자 ,전화번호 , 작성일을 보여준다.<br><br>

 ![댓글 관리-2](https://github.com/user-attachments/assets/87239637-efc0-4cd5-acdb-714d2bdb8663)<br>
  540번 글의 모습<br><br>

![댓글 관리-3](https://github.com/user-attachments/assets/76bdf724-70a9-4f3a-8f51-af924c5f66fc)<br>
  546번 댓글 삭제된 모습

  <br><br><br>

   **6.포인트 관리** <br>
 ![포인트 관리-1](https://github.com/user-attachments/assets/edfad7f8-68e1-42ea-bf80-e19ede9ab886)<br>
 닉네임 , 이메일 , 포인트 내용 , 포인트 , 일시 , 포인트 합을 보여준다.<br><br>
 
![포인트 관리-2](https://github.com/user-attachments/assets/55e47c05-a8e7-4e8c-894b-7201d6fbb876)<br>
11월에 해당하는 포인트만 보여진다.<br><br>

![포인트 관리-3](https://github.com/user-attachments/assets/869eea5e-b592-4ebb-a5c1-bdf46a8c6aa6)<br>
닉네임 10을 검색한 모습  , 포인트내역을 쭉 부여준다.<br><br>

![포인트 관리-4](https://github.com/user-attachments/assets/0e7aea38-8419-431a-a733-d118b7c8a37e)<br>
50포인트를 회수 했을때의 모습 , 총 포인트 감소<br><br>

![포인트 관리05](https://github.com/user-attachments/assets/00dbf392-a028-4fc1-aae3-325d104f004d)<br>
3번 닉네임의 포인트가 사라진 모습

<br><br><br>

 **7.신고 관리** <br>
 ![신고관리-1](https://github.com/user-attachments/assets/e31bfa34-afd6-4d3f-ab0e-aa9969277d83)<br>
 게시글 , 댓글 포함한 신고내역이 보여진다. (신고 내역의 번호를 보고 게시글과 , 댓글 관리로 가서 삭제하는 원리)<br><br>

 ![신고관리-2](https://github.com/user-attachments/assets/da1bca4b-dde3-45c4-a88c-ae8baeb7569b)<br>
  49번 번호 삭제

  <br><br><br>

   **8.상품 관리** <br>
   
![상품관리-3](https://github.com/user-attachments/assets/cd4feb1d-b394-4a20-884c-c1b66ca4c5b1)<br>
 상품이름 , 사진 , 가격 , 코드를 입력하고 등록하는 모습<br><br>
 
![상품관리-1](https://github.com/user-attachments/assets/2dadfc4f-fc59-4046-a7aa-ba811a38d1c8)<br>
  현재 등록된 상품을 보여준다.<br><br> 

   ![상품관리-2](https://github.com/user-attachments/assets/e6ab9b98-d660-4946-a28d-a14282acfe22)<br>
  팬케이크가 삭제된 모습<br><br> 

   ![상품관리-4](https://github.com/user-attachments/assets/04d9920e-3d2f-44dd-a0c7-edfedf257693)<br>
   상품 추가를 위해 코드를 더 입력하는 모습<br><br>

   ![상품관리-5](https://github.com/user-attachments/assets/ddac0c86-6bfc-4a69-9c1d-151ffb4adc7b)<br>
 추가된 상품의 개수를 보여준다.

  
  <br><br><br>
    
  </details>

  <br>
  
## 구조 및 설계   
   
### 5️⃣ 패키지 구조
   
<details>
  
<summary>패키지 구조 보기 (Click)</summary>   
 

```
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com.dr
 ┃ ┃ ┃ ┗ 📂api
 ┃ ┃ ┃ ┃ ┗ 📜MyPageApi.java
 ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┗ 📜SecurityConfig.java
 ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┗ 📜BoardController.java
 ┃ ┃ ┃ ┃ ┣ 📂chatBot.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜NangjangbotController.java
 ┃ ┃ ┃ ┃ ┣ 📂error
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ErrorContorller.java(아직미구현)
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MainController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜PublicDataApiController.java
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ManagerController.java
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MyPageController.java
 ┃ ┃ ┃ ┃ ┣ 📂rnak
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RankController.java
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FileApiController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RecipeController.java
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗ 📜PointShopController.java
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣ 📜SmsController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserController.java
 ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┣ 📜CustomOAuth2User.java
 ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardReportDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardScoreDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FreeBoardCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FreeBoardDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FreeBoardListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FreeBoardWriteDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FreeGoodDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜HoneyBoardCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜HoneyBoardDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜HoneyBoardListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜HoneyGoodDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRequest.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatResponse.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜NangjangbotDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ItemDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DashBoardDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerBoardDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerLoginDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerPhotoDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerPointDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerProductDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerRecipeDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerRegisterDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerReportDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerSessionDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ManagerUserDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CheckDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PointCheckDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PointDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PointRecordDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜SirenListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserCheckDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserInfoDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserPosttDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserRecipeDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserSteamDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RankDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeGoodDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeWriteCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeWriteDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MyRecipeCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerProductDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MyRecipeDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MyRecipeGoodDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MyRecipeListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MyRecipeWriteDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜RecipePhotoDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜RecipeReportDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RecipeSteamDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗ 📜PointShopDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣ 📜EmailFindDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜KakaoUsersDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PwFindDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PwResetDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserSessionDTO.java
 ┃ ┃ ┃ ┣ 📂mapper
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┗ 📜BoardMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┃ ┗ 📜NangjangbotMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ManagerMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MyPageMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RecipeMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗ 📜PointShopMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣ 📜KakaoUsers.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserMapper.java
 ┃ ┃ ┃ ┣ 📂mybatis
 ┃ ┃ ┃ ┃ ┗ 📜MyBatisConfig.java
 ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┗ 📜BoardService.java
 ┃ ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotService.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜NangjangbotService.java
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PublicDataService.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchService.java
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ManagerService.java
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MyPageService.java
 ┃ ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RankService.java
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RecipeService.java
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗ 📜PointShopService.java
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CoolSmsService.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomOAuth2UserService.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜RandomStringGeneratorService.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.java
 ┃ ┃ ┃ ┗ 📜DrApplication.java
 ┃ ┣ 📂resources
 ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┗ 📜config.xml
 ┃ ┃ ┣ 📂mapper
 ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┗📜BoardMapper.xml
 ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┗📜NangjangbotMapper.xml
 ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┗📜SearchMapper.xml
 ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┗📜ManagerMapper.xml
 ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┗📜MyPageMapper.xml
 ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┗📜RankMapper.xml
 ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┗📜RecipeMapper.xml
 ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┗📜PointShopMapper.xml
 ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┣📜KakaoUsersMapper.xml
 ┃ ┃ ┃ ┃ ┗📜UserMapper.xml
 ┃ ┃ ┣ 📂static
 ┃ ┃ ┃ ┣ 📂css
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣📜boardReport.css
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardDetail.css
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardList.css
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardModify.css
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardWirte.css
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardDetail.css
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardList.css
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardModify.css
 ┃ ┃ ┃ ┃ ┃ ┗📜honeyBoardWirte.css
 ┃ ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┃ ┗📜nangjangbot.css
 ┃ ┃ ┃ ┃ ┣ 📂fragment
 ┃ ┃ ┃ ┃ ┃ ┣📜header.css
 ┃ ┃ ┃ ┃ ┃ ┗📜footer.css
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┣📜boardSearchList.css
 ┃ ┃ ┃ ┃ ┃ ┣📜main.css
 ┃ ┃ ┃ ┃ ┃ ┣📜privacyPoilcy.css
 ┃ ┃ ┃ ┃ ┃ ┣📜recipeSearchList.css
 ┃ ┃ ┃ ┃ ┃ ┗📜terms.css
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┣📜dashBoard.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageBoard.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageComment.css
 ┃ ┃ ┃ ┃ ┃ ┣📜managePoint.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageProduct.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageRecipe.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageReport.css
 ┃ ┃ ┃ ┃ ┃ ┣📜managerLogin.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageUpdate.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageUser.css
 ┃ ┃ ┃ ┃ ┃ ┗📜RegisterProduct.css
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageCaution.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageCheck.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageDelete.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageInformation.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyComplaint.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyPoint.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyPost.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyRecipe.css
 ┃ ┃ ┃ ┃ ┃ ┗📜myPageSteamedList.css
 ┃ ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┃ ┗📜userRank.css
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotDetailPage.css
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotDetailPageNone.css
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeList.css
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeModify.css
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeWriter.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myDetailPage.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myDetailPageNone.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeList.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeModify.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeWriter.css
 ┃ ┃ ┃ ┃ ┃ ┗📜report.css
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗📜pointShop.css
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣📜apiJoin.css
 ┃ ┃ ┃ ┃ ┃ ┣📜drJoin.css
 ┃ ┃ ┃ ┃ ┃ ┣📜emailFind.css
 ┃ ┃ ┃ ┃ ┃ ┣📜emailFindFinish.css
 ┃ ┃ ┃ ┃ ┃ ┣📜join.css
 ┃ ┃ ┃ ┃ ┃ ┣📜login.css
 ┃ ┃ ┃ ┃ ┃ ┣📜PwFind.css
 ┃ ┃ ┃ ┃ ┃ ┗📜PwReset.css
 ┃ ┃ ┃ ┣ 📂image
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ 📂nangjangbot
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ 📂photo
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ 📂product
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ ```이미지들
 ┃ ┃ ┃ ┣ 📂js
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣📜boardReport.js
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardDetail.js
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardList.js
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardModify.js
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardWirte.js
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardDetail.js
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardList.js
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardModify.js
 ┃ ┃ ┃ ┃ ┃ ┗📜honeyBoardWirte.js
 ┃ ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┃ ┗📜nangjangbot.js
 ┃ ┃ ┃ ┃ ┣ 📂fragment
 ┃ ┃ ┃ ┃ ┃ ┗📜header.js
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┗📜main.js
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┣📜dashBoard.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageBoard.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageComment.js
 ┃ ┃ ┃ ┃ ┃ ┣📜managePoint.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageProduct.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageRecipe.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageReport.js
 ┃ ┃ ┃ ┃ ┃ ┣📜managerLogin.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageUpdate.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageUser.js
 ┃ ┃ ┃ ┃ ┃ ┗📜RegisterProduct.js
 ┃ ┃ ┃ ┃ ┣ 📂module
 ┃ ┃ ┃ ┃ ┃ ┗📜module.js
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageCaution.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageCheck.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageDelete.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageInformation.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyComplaint.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyPoint.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyPost.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyRecipe.js
 ┃ ┃ ┃ ┃ ┃ ┗📜myPageSteamedList.js
 ┃ ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┃ ┗📜userRank.js
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotDetailPage.js
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotDetailPageNone.js
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeList.js
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeModify.js
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeWriter.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myDetailPage.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myDetailPageNone.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeList.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeModify.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeWriter.js
 ┃ ┃ ┃ ┃ ┃ ┗📜report.js
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗📜pointShop.js
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣📜apiJoin.js
 ┃ ┃ ┃ ┃ ┃ ┣📜drJoin.js
 ┃ ┃ ┃ ┃ ┃ ┣📜emailFind.js
 ┃ ┃ ┃ ┃ ┃ ┣📜emailFindFinish.js
 ┃ ┃ ┃ ┃ ┃ ┣📜join.js
 ┃ ┃ ┃ ┃ ┃ ┣📜login.js
 ┃ ┃ ┃ ┃ ┃ ┣📜PwFind.js
 ┃ ┃ ┃ ┃ ┃ ┗📜PwReset.js
 ┃ ┃ ┣ 📂templates
 ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┣📜boardReport.html
 ┃ ┃ ┃ ┃ ┣📜freeBoardDetail.html
 ┃ ┃ ┃ ┃ ┣📜freeBoardList.html
 ┃ ┃ ┃ ┃ ┣📜freeBoardModify.html
 ┃ ┃ ┃ ┃ ┣📜freeBoardWirte.html
 ┃ ┃ ┃ ┃ ┣📜honeyBoardDetail.html
 ┃ ┃ ┃ ┃ ┣📜honeyBoardList.html
 ┃ ┃ ┃ ┃ ┣📜honeyBoardModify.html
 ┃ ┃ ┃ ┃ ┗📜honeyBoardWirte.html
 ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┗📜nangjangbot.html
 ┃ ┃ ┃ ┣ 📂error
 ┃ ┃ ┃ ┃ ┗📜미구현
 ┃ ┃ ┃ ┣ 📂fragment
 ┃ ┃ ┃ ┃ ┣📜footer.html
 ┃ ┃ ┃ ┃ ┗📜header.html
 ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┣📜boardSearchList.html
 ┃ ┃ ┃ ┃ ┣📜privacyPolicy.html
 ┃ ┃ ┃ ┃ ┣📜recipeSearchList.html
 ┃ ┃ ┃ ┃ ┗📜terms.html
 ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┣📜dashBoard.html
 ┃ ┃ ┃ ┃ ┣📜manageBoard.html
 ┃ ┃ ┃ ┃ ┣📜manageComment.html
 ┃ ┃ ┃ ┃ ┣📜managePoint.html
 ┃ ┃ ┃ ┃ ┣📜manageProduct.html
 ┃ ┃ ┃ ┃ ┣📜manageRecipe.html
 ┃ ┃ ┃ ┃ ┣📜manageReport.html
 ┃ ┃ ┃ ┃ ┣📜managerLogin.html
 ┃ ┃ ┃ ┃ ┣📜manageUpdate.html
 ┃ ┃ ┃ ┃ ┣📜manageUser.html
 ┃ ┃ ┃ ┃ ┗📜registerProduct.html
 ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┗📜userRank.html
 ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┣📜chatBotDetailPage.html
 ┃ ┃ ┃ ┃ ┣📜chatBotDetailPageNone.html
 ┃ ┃ ┃ ┃ ┣📜chatBotRecipeList.html
 ┃ ┃ ┃ ┃ ┣📜chatBotRecipeModify.html
 ┃ ┃ ┃ ┃ ┣📜chatBotRecipeWirte.html
 ┃ ┃ ┃ ┃ ┣📜myDetailPage.html
 ┃ ┃ ┃ ┃ ┣📜myDetailPageNone.html
 ┃ ┃ ┃ ┃ ┣📜myRecipeList.html
 ┃ ┃ ┃ ┃ ┣📜myRecipeModify.html
 ┃ ┃ ┃ ┃ ┣📜myRecipeWirter.html
 ┃ ┃ ┃ ┃ ┗📜report.html
 ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┗📜pointShop.html
 ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┣📜apiJoin.html
 ┃ ┃ ┃ ┃ ┣📜drJoin.html
 ┃ ┃ ┃ ┃ ┣📜emailFind.html
 ┃ ┃ ┃ ┃ ┣📜emailFindFinish.html
 ┃ ┃ ┃ ┃ ┣📜join.html
 ┃ ┃ ┃ ┃ ┣📜login.html
 ┃ ┃ ┃ ┃ ┣📜PwFind.html
 ┃ ┃ ┃ ┃ ┗📜PwReset.html
 ┃ ┃ ┗ 📜application.properties
 ```
  
 </details>   
 <br/>    
   
     
 ### 6️⃣ DB 설계
 
![ERD](https://github.com/user-attachments/assets/3f72fc6e-dcac-4a73-83cb-4cb9baa6a438)
※엔티티 관계도 이미지 클릭후 확대 가능합니다

![ERD_USER](https://github.com/user-attachments/assets/aeb7fd4b-5c23-49fe-ad2c-feb8958e95bd)
![ERD_MANAGER](https://github.com/user-attachments/assets/f5056cf2-90a0-46a1-9403-0676ceacc6f6)
![ERD_BOARD](https://github.com/user-attachments/assets/3164ca6d-c73e-4425-baa9-d3b5381eb5a2)
![ERD_RECIPE](https://github.com/user-attachments/assets/39fe62cc-e2fe-467f-8976-7d79509495cd)
![ERD_PRODUCT](https://github.com/user-attachments/assets/73bf54c8-f5f9-41e9-8381-0431c3a1e594)
![ERD_PHOTO](https://github.com/user-attachments/assets/5d7022fb-7f6b-4bf9-80dc-eddc92c03e94)
![ERD_SCORE](https://github.com/user-attachments/assets/c7702d30-61f7-4260-97d1-fcadf9f7277f)
![ERD_POINT](https://github.com/user-attachments/assets/a6c8b216-8d20-45e4-838c-08a7e5c567ec)
![ERD_STEAM](https://github.com/user-attachments/assets/b0bb863a-4627-4b66-a095-e6f6763141b8)
![ERD_GOOD](https://github.com/user-attachments/assets/ef3ebdd8-3d41-4d75-9cee-41758eb67caa)
![ERD_REPLY](https://github.com/user-attachments/assets/245d0748-0d98-4358-bf26-6cee077ba998)
![ERD_SIREN](https://github.com/user-attachments/assets/f30dd0eb-c5c9-47f9-b801-7db8854a91ad)
![ERD_DAILY](https://github.com/user-attachments/assets/03143311-5563-4842-92eb-cc79e245fad9)
![ERD_CHATSESSION](https://github.com/user-attachments/assets/d3648641-3890-4ba3-9ace-c93befcc083c)
![ERD_CHAT](https://github.com/user-attachments/assets/715f2092-95dc-44fa-8881-4715add9245b)

<br/>

### 7️⃣ API 설계

![apiImage](https://github.com/user-attachments/assets/746233b8-ccf0-4b9d-832d-b21b0ea88e05)<br><br>

## 개발 내용

- <a href="https://blog.naver.com/starve1304" target="_blank">맛있는 재활용 기술 블로그</a>
<br>

## 마치며   
### 8️⃣ 프로젝트 보완사항   

처음 기획한 데로 구현을 하다보니 기능적으로 빠진 부분이 많습니다. <br>
관리자 쪽을 처음으로 구상하다 보니 멀리서 바라 봤을 때 관리자 로써의 역할을 다 하지 못하는 것 같습니다.<br>
현재 구현한 관리자 페이지는 부족한 점은 3가지로 볼 수 있습니다. <br> <br>

첫째 , 관리자 수가 많아졌을 때 페이지 레이아웃에 어려움이 있습니다. <br>
팀원을 기준으로 레이아웃을 짜다보니 관리자가 늘어났을 때의 대처가 부족합니다. <br>
따라서 슬라이드 api를 넣어 관리자가 많아지더라도 편하게 넘길수 있도록 구현하겠습니다.<br>

둘째 , 관리자와 유저간의 소통 공간이 부족합니다. <br>
따라서 소통공간인 쪽찌 보내기 기능을 만들어 웹 페이지를 사용하면서 불편한 점이 있다면 관리자에게 문의 할 수 있도록 구현하겠습니다. <br>

셋째 , 홈페이지의 업데이트를 알리는 공지사항이 없습니다. <br>
따라서 공지사항을 추가로 만들어 공식적인 이벤트나 웹 페이지의 기능 업데이트가 있을 때 유용하도록 구현하겠습니다. <br>

<br>   
   <details>
  <summary>추가할 기능 (Click)</summary>
     
- 슬라이드 api 이용한 대시보드 화면 업데이트
- 쪽찌 보내기 기능
- 공지사항 기능
  
</details>  
<br>

### 9️⃣ 후기   
이번 프로젝트는 단순히 결과물을 만들어내는 데에 그치지 않고, 기획부터 설계, 구현, 개선까지 모든 과정을 스스로 처음부터 끝까지 주도적으로 경험해본 뜻깊은 도전이었습니다.<br>  
처음에는 방대한 작업의 범위와 미숙함에 대한 두려움도 있었지만, 이를 하나씩 해결해 나가며 개발자로서의 자신감과 역량을 키울 수 있었습니다.<br>  
또한 문제를 발견하고 개선해 나가는 과정에서 나만의 개발 철학과 방향성을 찾을 수 있었습니다.<br>  
이번 프로젝트는 단순히 기술적인 경험만이 아니라, 협업의 가치와 개발자로서의 책임감을 느낄 수 있었던 귀중한 여정이었습니다.<br><br>  

1) **협업의 중요성**<br>  
개발은 혼자 하는 작업이라는 인식이 있었지만, 실제로는 기획, 설계, 구현, 테스트까지 전 과정에서 협업이 핵심이라는 것을 깨달았습니다.<br>  
각자 맡은 역할에 책임을 다하면서도, 팀원들과 아이디어를 나누고 문제를 해결하는 과정이 프로젝트 성공의 열쇠임을 실감했습니다.<br>  
특히 다양한 의견을 조율하고, 각자의 장점을 살리는 과정에서 팀워크의 중요성을 다시금 느꼈습니다.<br>  
앞으로는 단순히 개인적인 역량뿐만 아니라, 팀 내에서 효과적으로 소통하고 협력하는 능력을 더욱 발전시켜야겠다는 다짐을 하게 되었습니다.<br><br> 

2) **기술적 학습과 개선사항**<br>  
이번 프로젝트를 통해 여러 기술적 측면에서도 큰 발전이 있었습니다.<br>  
**파일 구조와 관리**: 프로젝트를 체계적으로 관리하기 위해 파일과 디렉터리 구조를 설계하는 방법을 익혔습니다.<br>  
이로 인해 협업 시 코드의 가독성과 유지보수가 크게 향상되었습니다.<br>  
**MVC 패턴**: MVC(Model-View-Controller) 아키텍처를 적용하며, 코드의 역할 분리를 통해 보다 효율적인 코딩과 유지보수를 실현할 수 있었습니다.<br>  
MVC 패턴을 실제 프로젝트에 적용해보니, 사용자 인터페이스와 데이터 처리 사이의 의존성을 줄일 수 있어 확장성과 안정성을 확보할 수 있었습니다.<br>  
