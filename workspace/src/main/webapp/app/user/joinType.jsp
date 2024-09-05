<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/user/joinType.css" />
<link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>
<body>
    <main>
        <!-- 회원 유형 선택 -->
        <div class="jointype-choice">회원 유형</div>
        <div class="jointype-sort">
            <div class="jointype-member"><a href="${request.contextPath}/memberjoin.me">일반 회원</a></div>
            <div class="jointype-doctor"><a href="${request.contextPath}/doctorjoin.do">의료 회원</a></div>
        </div>
    </main>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>