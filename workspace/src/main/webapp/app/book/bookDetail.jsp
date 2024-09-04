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
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick1.jpeg">
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
				<h2>공황 발작</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick2.jpeg">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">'공황'은 짧은 시간에 공포감, 불안감이 급격히 증가하는 경우를
					말한다. 갑작스러운 반응은 다양한 신체증상을 유발하고, 우리의 이성적인 판단을 멈추게 하며, 이러한 느낌과 신체증상
					속에서 이러다가 내가 죽을 수도 있구나, 또는 이러다가 내가 미쳐버리는 것이 아닌가 하는 생각이 들 만큼 불안감을 느끼는
					경우이다. 이와 같은 증상이 갑작스럽게 최고조에 달했다가 점차 줄어들게 되므로 ‘발작’이라고 표현하며 ‘공황발작’이라고
					말하기도 한다.</div>
			</c:when>
			<c:when test="${param.page == '3'}">
				<h2>결장암</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick3.jpeg">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">결장은 음식물의 분해는 하지 않으며, 수분을 흡수하고 음식물 찌꺼기로
					분변을 형성해 저장했다가 내보내는 기능을 합니다. 결장에는 700종 이상의 세균이 서식하면서 여러 물질을 만들어 내는데,
					이에는 소량의 비타민이 포함됩니다(비타민 B군, 비타민 K 등). 또한 소장에서 소화되지 않은 다당류가 박테리아에 의해
					지방산으로 바뀌어 대장에 흡수됩니다. 결장에서 나오는 가스는 소화되지 않은 다당류를 박테리아가 발효할 때 만들어집니다.</div>
			</c:when>
			<c:when test="${param.page == '4'}">
				<h2>기흉</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick4.jpeg">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">기흉이란 공기주머니에 해당하는 폐에 구멍이 생겨 공기가 새고 이로 인해
					흉막강 내에 공기나 가스가 고이게 되는 질환이다. 흉막강은 흉벽, 횡격막, 종격동을 덮고 있는 벽측 흉막과, 폐엽 간
					틈새를 포함한 폐를 덮고 있는 장측 흉막으로 둘러싸인 공간을 뜻한다. 여기에는 정상적으로 소량의 흉수만이 존재하나, 이
					공간에 공기나 가스가 있는 경우를 기흉이라고 한다. 흉막강 내로 공기가 유입만 되고 배출이 되지 않을 경우 종격동(양쪽
					폐와 심장 사이의 공간)과 심장이 한쪽으로 쏠려서 발생하는 응급상황인 긴장성 기흉이 발생하기도 한다.</div>
			</c:when>
			<c:when test="${param.page == '5'}">
				<h2>난독증</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick5.jpeg">
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
				<h2>외이도염</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick6.jpeg">
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
				<h2>당뇨병</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick7.jpeg">
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
				<h2>3도 동상</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick8.jpeg">
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
				<h2>패혈증</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick9.jpeg">
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
				<h2>골다골증</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick10.jpeg">
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
