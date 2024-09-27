<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/doctorUpdateMember.css">
    <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    <jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
    <title>DoctorTreat - 내 병원 정보 수정</title>
</head>
<body>

    <div class="DoctorupdateMember-main-container">
        <div class="DoctorupdateMember-titlebox">
            <p class="DoctorupdateMember-title">내 병원 수정</p>
            <hr class="DoctorupdateMember-hr">
        </div>
        <div class="DoctorupdateMember-inputbox">
            <form action="${pageContext.request.contextPath}/doctor/doctorUpdateProcess.dm" method="post">
            <input type="hidden" name="doctorNumber" value="${doctorShowInfo.doctorNumber}">

                <label class="DoctorupdateMember-input" for=""> 
                    <span>아이디</span>
                    <input type="text" name="doctorId" value="${doctorShowInfo.doctorId}" readonly>
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for=""> 
                    <span>이름</span>
                    <input type="text" name="doctorName" value="${doctorShowInfo.doctorName}">
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for=""> 
                    <span>비밀번호</span>
                    <button type="button" class="DoctorupdateMember-btn">
                        <a href="${pageContext.request.contextPath}/doctor/doctorPwChangeGo.dm">비밀번호 변경</a>
                    </button>
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for=""> 
                    <span>병원 이름</span> 
                    <input type="text" name="hospitalName" value="${doctorShowInfo.hospitalName}">
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for=""> 
                    <span>병원 번호</span> 
                    <input type="text" name="hospitalCall" value="${doctorShowInfo.hospitalCall}">
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for=""> 
                    <span>병원 주소</span> 
                    <input type="text" id="postcode" name="postalCode" placeholder="우편번호" value="${doctorShowInfo.addressPostal}" readonly>
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for="">
                    <button type="button" class="postcode-search" onclick="execDaumPostcode()">주소 찾기</button>
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for="">
                    <span></span> 
                    <input type="text" id="address" name="address" placeholder="주소" value="${doctorShowInfo.addressAddress}" readonly>
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for="">
                    <span></span> 
                    <input type="text" id="detailAddress" name="detailAddress" placeholder="상세 주소" value="${doctorShowInfo.addressDetail}">
                </label>
        </div>
        <div class="DoctorupdateMember-botton">
            <button class="DoctorupdateMember-btn" type=submit style="color: white;">수정완료</button>
            <a href="${pageContext.request.contextPath}/app/myPage/doctorOut.jsp"><button class="DoctorupdateMember-btn" type="button" style="color: white;">
               회원탈퇴
            </button></a>
            </form>
        </div>
    </div>

    <script src="${pageContext.request.contextPath}/static/js/myPage/doctorUpdateMember.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/doctorUpdateMember.css">
    <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    <jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
    <title>DoctorTreat - 내 병원 정보 수정</title>
</head>
<body>

    <div class="DoctorupdateMember-main-container">
        <div class="DoctorupdateMember-titlebox">
            <p class="DoctorupdateMember-title">내 병원 수정</p>
            <hr class="DoctorupdateMember-hr">
        </div>
        <div class="DoctorupdateMember-inputbox">
            <form action="${pageContext.request.contextPath}/doctor/doctorUpdateProcess.dm" method="post">
            <input type="hidden" name="doctorNumber" value="${doctorShowInfo.doctorNumber}">

                <label class="DoctorupdateMember-input" for=""> 
                    <span>아이디</span>
                    <input type="text" name="doctorId" value="${doctorShowInfo.doctorId}" readonly>
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for=""> 
                    <span>이름</span>
                    <input type="text" name="doctorName" value="${doctorShowInfo.doctorName}">
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for=""> 
                    <span>비밀번호</span>
                    <button type="button" class="DoctorupdateMember-btn">
                        <a href="${pageContext.request.contextPath}/doctor/DoctorphoneOk.jsp">비밀번호 변경</a>
                    </button>
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for=""> 
                    <span>병원 이름</span> 
                    <input type="text" name="hospitalName" value="${doctorShowInfo.hospitalName}">
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for=""> 
                    <span>병원 번호</span> 
                    <input type="text" name="hospitalCall" value="${doctorShowInfo.hospitalCall}">
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for=""> 
                    <span>병원 주소</span> 
                    <input type="text" id="postcode" name="postalCode" placeholder="우편번호" value="${doctorShowInfo.addressPostal}" readonly>
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for="">
                    <button type="button" class="postcode-search" onclick="execDaumPostcode()">주소 찾기</button>
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for="">
                    <span></span> 
                    <input type="text" id="address" name="address" placeholder="주소" value="${doctorShowInfo.addressAddress}" readonly>
                </label> 
                <br> 
                <label class="DoctorupdateMember-input" for="">
                    <span></span> 
                    <input type="text" id="detailAddress" name="detailAddress" placeholder="상세 주소" value="${doctorShowInfo.addressDetail}">
                </label>
        </div>
        <div class="DoctorupdateMember-botton">
            <button class="DoctorupdateMember-btn" type=submit>수정완료</button>
            <a href="${pageContext.request.contextPath}/app/myPage/doctorOut.jsp"><button class="DoctorupdateMember-btn" type="button">
               회원탈퇴
            </button></a>
            </form>
        </div>
    </div>

    <script src="${pageContext.request.contextPath}/static/js/myPage/doctorUpdateMember.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>
>>>>>>> 1860fd72a39938e4ea4a037216dfefd0d7028d45
