<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unp kg.com/swiper/swiper-bundle.min.css" />
</head>
   <!-- 로그인 상태에 따라 다른 헤더 표시 -->
   <c:if test="${sessionScope.memberNumber == null && sessionScope.doctorNumber == null}">
      <jsp:include page="${pageContext.request.contextPath}/header.jsp" />
   </c:if>
   <c:if test="${sessionScope.doctorNumber != null}">
      <jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
   </c:if>
   <c:if test="${sessionScope.memberNumber != null}">
      <jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
   </c:if>

<body>
   <main>
      <!-- 유튜브 영상 -->
      <iframe width="980" height="400"
         src="https://www.youtube.com/embed/XS4vUCROhuc?si=5_C5K5seA3MaC7q9"
         title="YouTube video player" frameborder="0"
         allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
         referrerpolicy="strict-origin-when-cross-origin" allowfullscreen>
      </iframe>

      <!-- 의료 지식인 -->
      <div id="main-medic">
         <h2>의료 지식인</h2>
         <br>
         <div id="main-medic-content">
            <div class="main-content-border">
               <%
               List<String> medicalInfoTitles = (List<String>) request.getAttribute("medicalInfoTitles");
               if (medicalInfoTitles == null) {
                  System.out.println("medicalInfoTitles가 null입니다.");
               } else if (medicalInfoTitles.isEmpty()) {
                  System.out.println("medicalInfoTitles가 비어 있습니다.");
               } else {
                  for (String title : medicalInfoTitles) {
                     System.out.println("제목: 왜안될까?" + title);
                  }
               }
               
               %>
            </div>
         </div>
      </div>

      <!-- 질병백과 -->
      <div id="main-dicease">
         <h2>질병백과</h2>
         <br>
         <div id="main-dicease-whole">
            <div class="main-dicease-section">
               <div class="main-dicease-mini">
                  <p>감기</p>
                  <br>
                  <br>
                  <p>감기는 걸리면 아픕니다 아주 !!</p>
               </div>
               <img src="${pageContext.request.contextPath}/static/image/cold.png">
            </div>
            <div class="main-dicease-section">
               <div class="main-dicease-mini">
                  <p>감기</p>
                  <br>
                  <br>
                  <p>감기는 걸리면 아픕니다 아주 !!</p>
               </div>
               <img
                  src="${pageContext.request.contextPath}/static/image/stomach.png">
            </div>
            <div class="main-dicease-section">
               <div class="main-dicease-mini">
                  <p>감기</p>
                  <br>
                  <br>
                  <p>감기는 걸리면 아픕니다 아주 !!</p>
               </div>
               <img
                  src="${pageContext.request.contextPath}/static/image/cold2.png">
            </div>
            <div class="main-dicease-section">
               <div class="main-dicease-mini">
                  <p>감기</p>
                  <br>
                  <br>
                  <p>감기는 걸리면 아픕니다 아주 !!</p>
               </div>
               <img
                  src="${pageContext.request.contextPath}/static/image/covid.png">
            </div>
         </div>
      </div>

      <!-- 광고 -->
      <div id="main-ad" class="swiper-container">
         <div class="swiper-wrapper">
            <div class="swiper-slide">
               <img
                  src="${pageContext.request.contextPath}/static/image/logo1.png" />
            </div>
            <div class="swiper-slide">
               <img
                  src="${pageContext.request.contextPath}/static/image/row2.jpeg" />
            </div>
            <div class="swiper-slide">
               <img
                  src="${pageContext.request.contextPath}/static/image/row3.jpeg" />
            </div>
         </div>
      </div>
   </main>

   <!-- 버튼들 -->
   <div id="main-scroll-book">
      <div id="main-book">
         <a href="./../../html/clinicMember/choice.html"><span>진료하러
               가기</span></a>
      </div>
      <div id="main-up">
         <span><img
            src="${pageContext.request.contextPath}/static/image/toTop.png"></span>
      </div>
   </div>

   <jsp:include page="/footer.jsp" />
</body>
</html>