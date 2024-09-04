<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>질병 백과</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/book/disease.css">
    <jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>
<body>
    <main>
        <h2>질병 백과</h2>
        <br><br><br>
        <div id="disease-title-first">
            <span>내과</span>
            <div class="disease-section-first">
                <div class="disease-detail-first"><a href="bookDetail.jsp?page=1">위염</a></div>
                <div class="disease-detail-first"><a href="bookDetail.jsp?page=2">공황 발작</a></div>
                <div class="disease-detail-first"><a href="bookDetail.jsp?page=3">결장암</a></div>
                <div class="disease-detail-first"><a href="bookDetail.jsp?page=4">기흉</a></div>
                <div class="disease-detail-first"><a href="bookDetail.jsp?page=5">난독증</a></div>		
            </div>
        </div>

        <div id="disease-title-second">
            <span>이비인후과</span>
            <div class="disease-section-second">
                <div class="disease-detail-second"><a href="bookDetail.jsp?page=6">외이도염</a></div>	
                <div class="disease-detail-second"><a href="bookDetail.jsp?page=7">당뇨병</a></div>	
                <div class="disease-detail-second"><a href="bookDetail.jsp?page=8">3도 동상</a></div>	
                <div class="disease-detail-second"><a href="bookDetail.jsp?page=9">패혈증</a></div>	
                <div class="disease-detail-second"><a href="bookDetail.jsp?page=10">골다 골증</a></div>	
            </div>
        </div>
    </main>
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/main.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>
