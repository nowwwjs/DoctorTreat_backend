<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/user/doctorFindPw.css">
  <link rel="stylesheet" href="./../../../css/main/basic.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  <title>비밀번호찾기</title>
</head>
<body>
  <header>
    <div id="header-fixed">
        <div class="header-holder">
            <div class="header-container">
                <a href="./../../../html/main/main.html">
                    <div class="header-logo">
                        <img src="./../../../image/logo.png">
                        <div>DOCTOR TREAT</div>
                      </div>
                    </a>
            <div class="header-btnContainer">
                <a href="./../../../html/clinicMember/choice.html">
                    <div class="header-quickBtn">
                        <img src="./../../../image/chatBtn.png">
                        <div>닥터트리톡</div>
                    </div>
                </a>
                <a href="./../../../html/user/member/memberlogin.html">
                    <div class="header-quickBtn">
                        <img src="./../../../image/login.png">
                        <div>로그인</div>
                    </div>
                </a>
                <a href="./../../../html/user/member/memberjoin.html">
                    <div class="header-quickBtn">
                        <img src="./../../../image/memberJoin.png">
                        <div>회원가입</div>
                    </div>
                </a>
                <a href="./../../../html/myPage/member/memberInfo.html">
                    <div class="header-quickBtn">
                        <img src="./../../../image/myPage.png">
                        <div>마이페이지</div>
                    </div>
                </a>
            </div>
        </div>
    </div>
    <div class="header-hr"></div>

    <!-- 네비바 -->
    <div class="header-navContainer">
        <a href="./../../../html/clinicMember/choice.html">
            <div class="header-menu">
                비대면진료
                <img src="./../../../image/Clinic.png">
            </div>
        </a>

        <a href="./../../../html/book/disease.html">
            <div class="header-menu">
                질병백과
                <img src="./../../../image/encyclopedia.png">
            </div>
        </a>
        <a href="./../../../html/board/member/medicalKnowledgeList.html">
            <div class="header-menu">
                의료지식인
                <img src="./../../../image/Knowledge.png">
            </div>
        </a>
        <a href="./../../../html/hospital/hospitalInfo.html">
            <div class="header-menu">
                지역별 병원정보
                <img src="./../../../image/hospitalInfo.png">
            </div>
        </a>
    </div>
    </div>
</header>
  <main>
    <!-- <h2 class="findId-page-title">아이디 찾기</h2> -->
    <div class="Doctor-findPw-container">
      <h2 class="Doctor-findPw-page-title">비밀번호 찾기</h2>
      <br>
      <div class="Doctor-findPw-choicebox">
        <div class="Doctor-findPw-choice"><a href="./../../../html/user/doctor/DoctorfindId.html">아이디찾기</a></div>
        <div class="Doctor-findPw-choice"><a href="./../../../html/user/doctor/DoctorfindPw.html">비밀번호찾기</a></div>
      </div>
      <br><br>
      <section class="Doctor-findPw-form-one">
        <form>
          이름 &nbsp;&nbsp;  <input type="text" class="Doctor-findPw-input" placeholder="이름을 입력하세요">      
        </form>
      </section> 
        <br>
      <section class="Doctor-findPw-form-two">
        <form>
          아이디 <input type="text" class="Doctor-findPw-input" placeholder="아이디를 입력하세요">      
        </form>
      </section>
      <br><br><br>
      <a href="./../../../html/myPage/doctor/DoctorphoneOk.html"><button type="submit" class="Doctor-findPw-button">휴대폰 인증</button></a>
    </div>
  </main>
  <footer>
    <br>
    <div id="footer-footer">
      <p class="footer-bold-first">
        (주)닥터트리
      </p>
      <p class="footer-medium">
        대표 닥터트리 | 사업자 등록 번호 : 279-88-01452 | 통신판매업 신고번호 : 2024-서울강남-00439
      </p>
      <p class="footer-medium">
        강남지점 1관 : 서울특별시 강남구 테헤란로 146 현익빌딩 3,4층
        <span class="footer-bold-second">사업자 정보 확인</span>
      </p>
      <br>
      <p class="footer-medium">
        Copyright 2024. 닥터트리 Inc. All rights reserved.
      </p>
      <br>
      <div id="footer-icon">
        <i class="fab fa-instagram"></i>
        <i class="fa-regular fa-comment-dots"></i>
        <i class="fa-regular fa-hospital"></i>
        <i class="fa-brands fa-youtube"></i>
      </div>
      <br>
      <br>
    </div>
  </footer>
  <img src="./../../../html/user/member/findId.html">
  <script src="./../../../js/user/member/find.js"></script>
</body>
</html>