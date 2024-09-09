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
</head>
<c:choose>
    <c:when test="${sessionScope.memberNumber == null && sessionScope.doctorNumber == null}">
        <jsp:include page="${pageContext.request.contextPath}/header.jsp" />
    </c:when>
    <c:when test="${sessionScope.doctorNumber != null}">
        <jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
    </c:when>
    <c:when test="${sessionScope.memberNumber != null}">
        <jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
    </c:when>
    <c:otherwise>
        <!-- 기본적으로 포함할 내용이 필요하다면 여기에 추가 -->
        <jsp:include page="${pageContext.request.contextPath}/defaultHeader.jsp" />
    </c:otherwise>
</c:choose>



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
					src="<%=request.getContextPath()%>/static/image/sick2.jpg">
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
					src="<%=request.getContextPath()%>/static/image/sick3.jpg">
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
					src="<%=request.getContextPath()%>/static/image/sick4.jpg">
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
					src="<%=request.getContextPath()%>/static/image/sick5.jpg">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">지능은 정상이지만 글자를 읽거나 쓰는데 어려움이 있는 증세를 말한다.
					이 증세를 가진 대다수 환자들은 낱말에서 말의 최소 단위인 음소를 구분하지 못한다. 어느 언어권에서나 난독증 환자가 생길
					수 있지만, 비교적 발음체계가 복잡한 영어권에서 많이 발생하는 경향이 있다. 또한 비슷한 단어가 적은 언어권 나라일수록
					그 발병률이 낮다. 유명한 과학자인 아인슈타인도 난독증이 있었던 것으로 알려져 있다.</div>
			</c:when>
			<c:when test="${param.page == '6'}">
				<h2>외이도염</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick6.jpg">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">급성 외이도염은 외이도의 전반적인 세균성 감염으로서, 잦은 수영,
					아열대성 습한 기후, 좁고 털이 많은 외이도, 외골종증(exostosis, 냉수자극에 대해 외이도가 반응하는 것,
					외이도에 들어간 물이 배출되지 않음)을 가진 외이도, 외이도 외상 또는 이물, 귀지의 과다 또는 결핍(impacted
					or absent cerumen), 보청기 또는 이어폰 사용, 습진, 지루성피부염, 건선 등의 피부 질환, 당뇨병,
					면역저하 상태 또는 땀이 많은 체질 등이 원인이 되어 발생한다.</div>
			</c:when>
			<c:when test="${param.page == '7'}">
				<h2>당뇨병</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick7.jpg">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">당뇨병은 인슐린의 분비량이 부족하거나 정상적인 기능이 이루어지지 않는
					등의 대사질환의 일종으로, 혈중 포도당의 농도가 높아지는 고혈당을 특징으로 하며, 고혈당으로 인하여 여러 증상 및 징후를
					일으키고 소변에서 포도당을 배출하게 된다.</div>
			</c:when>
			<c:when test="${param.page == '8'}">
				<h2>3도 동상</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick8.jpg">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">괴사성동상(壞死性凍傷)이라고 한다. 국소의 혈류가 정지되고 피부는
					밀랍처럼 희게 되며 만져보면 차갑다. 감각은 전혀 없고 건강한 부위와의 사이에 통증을 일으킨다. 시간이 경과됨에 따라
					괴사부는 담회백색(淡灰白色) → 회백색 → 갈색 → 흑색이 되고 건강한 피부와의 경계선이 생긴다. 괴사부가 떨어져 나가면
					궤상(潰傷)이 남게 되어 수개월에서 1년 정도 지나야 치유된다. 가벼운 것은 피부괴사에 그치지만 심할 때는 근육·뼈까지도
					파괴된다.</div>
			</c:when>
			<c:when test="${param.page == '9'}">
				<h2>패혈증</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick9.jpg">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">초기 증상으로는 호흡수가 빨라지고, 지남력(시간, 장소, 사람에 대한
					인지력)의 상실이나 정신 착란 등의 신경학적 장애가 나타날 수 있다. 혈압의 저하 및 신체 말단에 공급되는 혈액량의
					저하로 인하여 피부가 시퍼렇게 보이기도 한다. 균혈증(세균이 혈액 내에 돌아다니는 증상)이 있으면 세균이 혈류를 따라
					돌아다니다가 신체의 특정 부위에 자리를 잡아 그 부위에 병적인 변화를 일으킬 수 있다.</div>
			</c:when>
			<c:when test="${param.page == '10'}">
				<h2>골다골증</h2>
				<img class="detail-sick"
					src="<%=request.getContextPath()%>/static/image/sick10.jpg">
				<br>
				<br>
				<div id="book-info">
					<h3>질병정보</h3>
				</div>
				<div id="book-content">초음파의 경우 기계의 이동이 쉽기 때문에 보통 선별검사에 많이
					쓰이지만, 종종 DXA법에 의한 결과와 상이하게 나타날 수 있다. 정량 전산화단층촬영술의 경우 요추(lumbar
					spine), 팔뚝(forearm)이나 정강이뼈(tibia)를 측정하는데, 3차원적으로 재구성하여 실제 밀도를 알 수
					있다는 장점이 있지만 방사선 노출량이 많다.</div>
			</c:when>
		</c:choose>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>
