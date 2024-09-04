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
                <div class="disease-detail-first"><a href="bookDetail.jsp?page=1">1도 동상</a></div>
                <div class="disease-detail-first"><a href="bookDetail.jsp?page=2">2도 동상</a></div>
                <div class="disease-detail-first"><a href="bookDetail.jsp?page=3">3도 동상</a></div>
                <div class="disease-detail-first"><a href="bookDetail.jsp?page=4">4도 동상</a></div>
                <div class="disease-detail-first"><a href="bookDetail.jsp?page=5">5도 동상</a></div>		
            </div>
        </div>

        <div id="disease-title-second">
            <span>이비인후과</span>
            <div class="disease-section-second">
                <div class="disease-detail-second"><a href="bookDetail.jsp?page=6">6도 동상</a></div>	
                <div class="disease-detail-second"><a href="bookDetail.jsp?page=7">7도 동상</a></div>	
                <div class="disease-detail-second"><a href="bookDetail.jsp?page=8">8도 동상</a></div>	
                <div class="disease-detail-second"><a href="bookDetail.jsp?page=9">9도 동상</a></div>	
                <div class="disease-detail-second"><a href="bookDetail.jsp?page=10">10도 동상</a></div>	
            </div>
        </div>
    </main>
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/main.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>
