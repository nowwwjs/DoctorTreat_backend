<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>doctorTreat_질병상세</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/book/bookDetail.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>
<body>
	<main>
		<c:choose>
			<c:when test="${param.page == '1'}">
				<h2>위염</h2>
				<img class="detail-sick" src="<%=request.getContextPath()%>/static/image/sick1.jpeg">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">위 내부를 감싸고 있는 점막에 염증이 생기는 질환입니다. 약물 복용,
					음주 또는 헬리코박터 파일로리 감염을 가장 흔한 원인으로 꼽을 수 있습니다. 일반적으로는 증상이 나타나지 않지만 증상이
					나타나는 경우에는 복통, 식욕부진, 오심 및 구토를 유발할 수 있습니다. 다만, 흉통은 않지만 위장관출혈이 이 과정의 첫
					징후일 수 있습니다. 진단은 임상 문진과 신체 검진을 통해 이루어집니다. 혈액 검사와 헬리코박터 파일로리 감염 여부를
					파악하여 의심 진단을 확인할 수 있습니다. 원을 치료하고 위산 분비를 저하시킬 수 있는 약물을 투여해야 합니다.</div>
			</c:when>
			<c:when test="${param.page == '2'}">
				<h2>위염</h2>
				<img src="<%=request.getContextPath()%>/static/image/cold.png">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">위 내부를 감싸고 있는 점막에 염증이 생기는 질환입니다. 약물 복용,
					음주 또는 헬리코박터 파일로리 감염을 가장 흔한 원인으로 꼽을 수 있습니다. 일반적으로는 증상이 나타나지 않지만 증상이
					나타나는 경우에는 복통, 식욕부진, 오심 및 구토를 유발할 수 있습니다. 다만, 흉통은 않지만 위장관출혈이 이 과정의 첫
					징후일 수 있습니다. 진단은 임상 문진과 신체 검진을 통해 이루어집니다. 혈액 검사와 헬리코박터 파일로리 감염 여부를
					파악하여 의심 진단을 확인할 수 있습니다. 원을 치료하고 위산 분비를 저하시킬 수 있는 약물을 투여해야 합니다.</div>
			</c:when>
			<c:when test="${param.page == '3'}">
				<h2>위염</h2>
				<img src="<%=request.getContextPath()%>/static/image/cold.png">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">위 내부를 감싸고 있는 점막에 염증이 생기는 질환입니다. 약물 복용,
					음주 또는 헬리코박터 파일로리 감염을 가장 흔한 원인으로 꼽을 수 있습니다. 일반적으로는 증상이 나타나지 않지만 증상이
					나타나는 경우에는 복통, 식욕부진, 오심 및 구토를 유발할 수 있습니다. 다만, 흉통은 않지만 위장관출혈이 이 과정의 첫
					징후일 수 있습니다. 진단은 임상 문진과 신체 검진을 통해 이루어집니다. 혈액 검사와 헬리코박터 파일로리 감염 여부를
					파악하여 의심 진단을 확인할 수 있습니다. 원을 치료하고 위산 분비를 저하시킬 수 있는 약물을 투여해야 합니다.</div>
			</c:when>
			<c:when test="${param.page == '4'}">
				<h2>위염</h2>
				<img src="<%=request.getContextPath()%>/static/image/cold.png">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">위 내부를 감싸고 있는 점막에 염증이 생기는 질환입니다. 약물 복용,
					음주 또는 헬리코박터 파일로리 감염을 가장 흔한 원인으로 꼽을 수 있습니다. 일반적으로는 증상이 나타나지 않지만 증상이
					나타나는 경우에는 복통, 식욕부진, 오심 및 구토를 유발할 수 있습니다. 다만, 흉통은 않지만 위장관출혈이 이 과정의 첫
					징후일 수 있습니다. 진단은 임상 문진과 신체 검진을 통해 이루어집니다. 혈액 검사와 헬리코박터 파일로리 감염 여부를
					파악하여 의심 진단을 확인할 수 있습니다. 원을 치료하고 위산 분비를 저하시킬 수 있는 약물을 투여해야 합니다.</div>
			</c:when>
			<c:when test="${param.page == '5'}">
				<h2>위염</h2>
				<img src="<%=request.getContextPath()%>/static/image/cold.png">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">위 내부를 감싸고 있는 점막에 염증이 생기는 질환입니다. 약물 복용,
					음주 또는 헬리코박터 파일로리 감염을 가장 흔한 원인으로 꼽을 수 있습니다. 일반적으로는 증상이 나타나지 않지만 증상이
					나타나는 경우에는 복통, 식욕부진, 오심 및 구토를 유발할 수 있습니다. 다만, 흉통은 않지만 위장관출혈이 이 과정의 첫
					징후일 수 있습니다. 진단은 임상 문진과 신체 검진을 통해 이루어집니다. 혈액 검사와 헬리코박터 파일로리 감염 여부를
					파악하여 의심 진단을 확인할 수 있습니다. 원을 치료하고 위산 분비를 저하시킬 수 있는 약물을 투여해야 합니다.</div>
			</c:when>
			<c:when test="${param.page == '6'}">
			<h2>위염</h2>
				<img src="<%=request.getContextPath()%>/static/image/cold.png">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">위 내부를 감싸고 있는 점막에 염증이 생기는 질환입니다. 약물 복용,
					음주 또는 헬리코박터 파일로리 감염을 가장 흔한 원인으로 꼽을 수 있습니다. 일반적으로는 증상이 나타나지 않지만 증상이
					나타나는 경우에는 복통, 식욕부진, 오심 및 구토를 유발할 수 있습니다. 다만, 흉통은 않지만 위장관출혈이 이 과정의 첫
					징후일 수 있습니다. 진단은 임상 문진과 신체 검진을 통해 이루어집니다. 혈액 검사와 헬리코박터 파일로리 감염 여부를
					파악하여 의심 진단을 확인할 수 있습니다. 원을 치료하고 위산 분비를 저하시킬 수 있는 약물을 투여해야 합니다.</div>
			</c:when>
			<c:when test="${param.page == '7'}">
				<h2>위염</h2>
				<img src="<%=request.getContextPath()%>/static/image/cold.png">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">위 내부를 감싸고 있는 점막에 염증이 생기는 질환입니다. 약물 복용,
					음주 또는 헬리코박터 파일로리 감염을 가장 흔한 원인으로 꼽을 수 있습니다. 일반적으로는 증상이 나타나지 않지만 증상이
					나타나는 경우에는 복통, 식욕부진, 오심 및 구토를 유발할 수 있습니다. 다만, 흉통은 않지만 위장관출혈이 이 과정의 첫
					징후일 수 있습니다. 진단은 임상 문진과 신체 검진을 통해 이루어집니다. 혈액 검사와 헬리코박터 파일로리 감염 여부를
					파악하여 의심 진단을 확인할 수 있습니다. 원을 치료하고 위산 분비를 저하시킬 수 있는 약물을 투여해야 합니다.</div>
			</c:when>
			<c:when test="${param.page == '8'}">
				<h2>위염</h2>
				<img src="<%=request.getContextPath()%>/static/image/cold.png">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">위 내부를 감싸고 있는 점막에 염증이 생기는 질환입니다. 약물 복용,
					음주 또는 헬리코박터 파일로리 감염을 가장 흔한 원인으로 꼽을 수 있습니다. 일반적으로는 증상이 나타나지 않지만 증상이
					나타나는 경우에는 복통, 식욕부진, 오심 및 구토를 유발할 수 있습니다. 다만, 흉통은 않지만 위장관출혈이 이 과정의 첫
					징후일 수 있습니다. 진단은 임상 문진과 신체 검진을 통해 이루어집니다. 혈액 검사와 헬리코박터 파일로리 감염 여부를
					파악하여 의심 진단을 확인할 수 있습니다. 원을 치료하고 위산 분비를 저하시킬 수 있는 약물을 투여해야 합니다.</div>
			</c:when>
			<c:when test="${param.page == '9'}">
				<h2>위염</h2>
				<img src="<%=request.getContextPath()%>/static/image/cold.png">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">위 내부를 감싸고 있는 점막에 염증이 생기는 질환입니다. 약물 복용,
					음주 또는 헬리코박터 파일로리 감염을 가장 흔한 원인으로 꼽을 수 있습니다. 일반적으로는 증상이 나타나지 않지만 증상이
					나타나는 경우에는 복통, 식욕부진, 오심 및 구토를 유발할 수 있습니다. 다만, 흉통은 않지만 위장관출혈이 이 과정의 첫
					징후일 수 있습니다. 진단은 임상 문진과 신체 검진을 통해 이루어집니다. 혈액 검사와 헬리코박터 파일로리 감염 여부를
					파악하여 의심 진단을 확인할 수 있습니다. 원을 치료하고 위산 분비를 저하시킬 수 있는 약물을 투여해야 합니다.</div>
			</c:when>
			<c:when test="${param.page == '10'}">
				<h2>위염</h2>
				<img src="<%=request.getContextPath()%>/static/image/cold.png">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">위 내부를 감싸고 있는 점막에 염증이 생기는 질환입니다. 약물 복용,
					음주 또는 헬리코박터 파일로리 감염을 가장 흔한 원인으로 꼽을 수 있습니다. 일반적으로는 증상이 나타나지 않지만 증상이
					나타나는 경우에는 복통, 식욕부진, 오심 및 구토를 유발할 수 있습니다. 다만, 흉통은 않지만 위장관출혈이 이 과정의 첫
					징후일 수 있습니다. 진단은 임상 문진과 신체 검진을 통해 이루어집니다. 혈액 검사와 헬리코박터 파일로리 감염 여부를
					파악하여 의심 진단을 확인할 수 있습니다. 원을 치료하고 위산 분비를 저하시킬 수 있는 약물을 투여해야 합니다.</div>
			</c:when>
		</c:choose>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>
