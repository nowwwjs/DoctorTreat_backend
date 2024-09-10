<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>키워드로 장소검색하고 목록으로 표출하기</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/hospital/hospitalInfo.css">
</head>
<c:choose>
	<c:when test="${sessionScope.doctorNumber != null}">
		<jsp:include
			page="${pageContext.request.contextPath}/headerDoctor.jsp" />
	</c:when>
	<c:when test="${sessionScope.memberNumber != null}">
		<jsp:include
			page="${pageContext.request.contextPath}/headerMember.jsp" />
	</c:when>
	<c:otherwise>
		<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
	</c:otherwise>
</c:choose>


<body>
	<div class="map_wrap">
		<div id="map"
			style="width: 100%; height: 100%; position: relative; overflow: hidden;"></div>
		<div id="menu_wrap" class="bg_white">
			<div class="option">
				<div>
					<form onsubmit="searchPlaces(); return false;">
						키워드 : <input type="text" value="이태원 맛집" id="keyword" size="15">
						<button type="submit">검색하기</button>
					</form>
				</div>
			</div>
			<hr>
			<ul id="placesList"></ul>
			<div id="pagination"></div>
		</div>
	</div>

	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=c5d67dedd71ed926dfe24f7aaa51526d&libraries=services"></script>
	<script
		src="${pageContext.request.contextPath}/static/js/hospital/hospitalInfo.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>