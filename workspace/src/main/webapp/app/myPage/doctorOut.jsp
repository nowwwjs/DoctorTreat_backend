<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./../../../css/main/basic.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/doctorOut.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <title>DoctorTreat - 회원탈퇴</title>
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


    <div class="DoctorOut-main-container">
        <div class="DoctorOut-titlebox">
            <p class="DoctorOut-title">회원탈퇴</p>
            <hr class="DoctorOut-hr">
        </div>


        <div class="DoctorOut-inputbox">
            <form action="">
                <p class="DoctorOut-idtext">아이디</p>
                <input type="text" class="DoctorOut-input-field">

                <p class="DoctorOut-pwtext">비밀번호 입력</p>
                <input type="password" class="DoctorOut-input-field">
            </form>
        </div>

        <button class="DoctorOut-btn">
            <a href="./../../../html/myPage/member/memberOut-caution.html">
          <p>회원탈퇴</p>
        </a>
        </button>
    </div>

    <!-- 회원탈퇴 모달창 -->
    <div id="DoctorOut-modal" class="DoctorOut-modal">
        <div class="DoctorOut-modal-content">
            <h2>회원탈퇴 완료</h2>
            <p>회원탈퇴가 완료되었습니다.</p>
            <button onclick="closeModal()">닫기</button>
        </div>
    </div>

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

    <script src="${pageContext.request.contextPath}/static/js/myPage/doctorOut.js"></script>
</body>

</html>