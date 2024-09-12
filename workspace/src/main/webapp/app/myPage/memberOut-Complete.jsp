<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberout-complete.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />

<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>
<body>
	<main>
        <div class="memberOut-complete-title">회원 탈퇴 완료</div>
        <div class="memberOut-complete-wrap">
            <div class="memberOut-complete-image">
                <img src="${pageContext.request.contextPath}/static/image/circlecheck.png">
            </div>
            <div class="memberOut-complete-text">
                회원 탈퇴 완료
            </div>
            <div class="memberout-complete-text-bottom">
                닥터트리 사이트 회원 탈퇴 신청이 완료되었습니다.
            </div>
            <div class="memberOut-complete-btn">
                <a href="${pageContext.request.contextPath}/index.jsp"><button class="memberOut-complete-mainbtn">홈으로</button></a>
            </div>
        </div>
    </main>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>