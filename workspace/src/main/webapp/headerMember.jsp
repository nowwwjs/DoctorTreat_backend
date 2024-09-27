<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/headerMember.css?v=1.0" />
</head>
<body>
	<header>
        <div id="header-fixed">
            <div class="header-holder">
                <div class="header-container">
                    <div class="header-logo">
                        <a href="${pageContext.request.contextPath}/index.main">
                            <img src="${pageContext.request.contextPath}/static/image/logo.png">
                            <div>DOCTOR TREAT</div>
                        </a>
                    </div>
                    <div class="header-btnContainer">
                        <a href="${request.contextPath}/chatListMember.memcl">
                            <div class="header-quickBtn">
                                <img src="${pageContext.request.contextPath}/static/image/chatBtn.png">
                                <div>닥터트리톡</div>
                            </div>
                        </a>
                        <a href="${request.contextPath}/member/memberLogout.me">
                            <div class="header-quickBtn">
                                <c:if test="${sessionScope.memberNumber != null}">
                                <img src="${pageContext.request.contextPath}/static/image/login.png">
                                <div>로그아웃</div>
                                </c:if>
                            </div>
                        </a>
                        <a href="${request.contextPath}/memberMypage/memberInfo.mm?memberNumber=${sessionScope.memberNumber}">
                            <div class="header-quickBtn">
                                <img src="${pageContext.request.contextPath}/static/image/myPage.png">
                                <div>마이페이지</div>
                            </div>
                        </a>
                         <a href="${request.contextPath}/chart.memcl">
                            <div class="header-quickBtn">
                                <img class="prescription-img" src="${pageContext.request.contextPath}/static/image/prescription4.png">
                                <div>처방전</div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
            <div class="header-hr"></div>

            <!-- 네비바 -->
            <div class="header-navContainer">
                <a href="${pageContext.request.contextPath}/app/clinic/clinicStartMember.memcl">
                    <div class="header-menu">
                        비대면진료
                        <img src="${pageContext.request.contextPath}/static/image/Clinic.png">
                    </div>
                </a>

                <a href="${pageContext.request.contextPath}/app/book/disease.jsp">
                    <div class="header-menu">
                        질병백과
                        <img src="${pageContext.request.contextPath}/static/image/encyclopedia.png">
                    </div>
                </a>
                <a href="${pageContext.request.contextPath}/BoardList.membo">
                    <div class="header-menu">
                        의료지식인
                        <img src="${pageContext.request.contextPath}/static/image/Knowledge.png">
                    </div>
                </a>
                <a href="${pageContext.request.contextPath}/app/hospital/hospitalInfo.jsp">
                    <div class="header-menu">
                        지역별 병원정보
                        <img src="${pageContext.request.contextPath}/static/image/hospitalInfo.png">
                    </div>
                </a>
            </div>
        </div>
    </header>
</body>
</html>
