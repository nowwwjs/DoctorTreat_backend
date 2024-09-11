<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/static/css/clinic/chatListMember.css?v=1.0">
</head>
<body>
    <jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
    <main>
        <!-- 채팅목록 타이틀-->
        <div class="chatList-choice">채팅목록</div>
        <!-- 채팅목록 과별 -->
        <div class="chatList-department">
            <div class="chatList-otolaryngology">이비인후과</div>
            <div class="chatList-medicine">내과</div>
        </div>
        <!-- 채팅목록 의사 상세-->
        <div class="chatList-container">
            <!-- 이비인후과 의사 목록 -->
            <div class="chatList-container-ear">
                <c:forEach var="doctor" items="${doctorOfEar}">
                    <div class="chatList-wrap-ear">
                        <div class="chatList-ear">
                            <a href="${pageContext.request.contextPath}/app/clinic/chatRoomMember.memcl">
                                <div class="chatList-name">전문의 : ${doctor.doctorName}</div>
                                <div class="chatList-hospitalName">${doctor.hospitalName}</div>
                            </a>
                        </div>
                        <div class="chatList-img">
                            <img src="${pageContext.request.contextPath}/static/image/hospital.png">
                        </div>
                    </div>
                </c:forEach>
            </div>
            <!-- 내과 의사 목록 -->
            <div class="chatList-container-medicine">
                <c:forEach var="doctor" items="${doctorOfInner}">
                    <div class="chatList-wrap-medicine">
                        <div class="chatList-ear">
                            <a href="${pageContext.request.contextPath}/app/clinic/chatRoomMember.memcl">
                                <div class="chatList-name">전문의 : ${doctor.doctorName}</div>
                                <div class="chatList-hospitalName">${doctor.hospitalName}</div>
                            </a>
                        </div>
                        <div class="chatList-img">
                            <img src="${pageContext.request.contextPath}/static/image/hospital.png">
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <!-- 알림메세지 -->
        <div class="chatListMember-notice">
            <span>※ 채팅목록은 진료과별 <span class="chatListMember-important">최근
                    2건만</span> 노출됩니다 ※
            </span>
        </div>
    </main>
    <jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>
