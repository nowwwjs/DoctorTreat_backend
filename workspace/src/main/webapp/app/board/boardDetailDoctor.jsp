<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>의료지식인 게시글 상세페이지</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/board/boardDetail.css?v=1.0" />
    <jsp:include page="/headerDoctor.jsp" />
    <style>
        .comment-edit-form {
            display: none;
        }
    </style>
</head>
<body>
    <main>
        <!-- 의료지식인 게시글 상세페이지 -->
        <div class="boardDetail-title">의료지식인</div>

        <!-- 게시글 정보 출력 -->
        <div class="boardDetail-boardTextContainer">
            <div class="boardDetail-boardTitle">
                ${doctorBoardshowDetail.medicalInfoTitle}
            </div>
            <div class="boardDetail-writer">
                <div class="boardDetail-name">
                    ${doctorBoardshowDetail.memberName}
                </div>
                <div class="boardDetail-date">
                    ${doctorBoardshowDetail.medicalInfoDate}
                </div>
            </div>
            <div class="boardDetail-boardText">
                ${doctorBoardshowDetail.medicalInfoText}
            </div>
        </div>

        <!-- 댓글 폼 -->
        <c:choose>
            <c:when test="${not empty comments}">
                <div class="boardDetail-comentBox">
                    <div class="boardDetail-name">${doctorBoardshowDetail.doctorMajor}</div>
                    <c:forEach var="comment" items="${comments}">
                        <div class="boardDetail-doctorName">전문의 : ${comment.doctorName}</div>
                        <div class="boardDetail-doctorComment">
                            ${comment.doctorCommentText}
                        </div>

                        <c:if test="${sessionScope.doctorNumber == comment.doctorNumber}">
                            <button onclick="showEditForm(${comment.doctorCommentNumber})" class="boardDetail-comentModify">수정</button>
                            <form action="${pageContext.request.contextPath}/BoardCommentDelete.docbo" method="post" style="display:inline;">
                                <input type="hidden" name="doctorCommentNumber" value="${comment.doctorCommentNumber}" />
                                <input type="hidden" name="infoNumber" value="${doctorBoardshowDetail.medicalInfoNumber}" />
                                <button type="submit" class="boardDetail-comentDelete">삭제</button>
                            </form>

                            <!-- 댓글 수정 폼 -->
                            <div id="editForm${comment.doctorCommentNumber}" class="comment-edit-form">
                                <form action="${pageContext.request.contextPath}/BoardCommentUpdate.docbo?infoNumber=${infoNumber}" method="post">
                                    <input type="hidden" name="doctorCommentNumber" value="${comment.doctorCommentNumber}" />
                                    <input type="hidden" name="medicalInfoNumber" value="${doctorBoardshowDetail.medicalInfoNumber}" />
                                    <input type="hidden" name="infoNumber" value="${infoNumber}" />
                                    <textarea name="doctorCommentText" placeholder="댓글을 수정하세요" class="boardDetail-comment-modify">${comment.doctorCommentText}</textarea>
                                    <button type="submit" class="doctorModify-complete">수정 완료</button>
                                </form>
                            </div>
                        </c:if>
                    </c:forEach>
                </div>
            </c:when>
            <c:when test="${empty comments}">
                <form class="boardDetail-commentContainer" action="${pageContext.request.contextPath}/BoardComment.docbo?infoNumber=${infoNumber}" method="post">
                    <input type="hidden" name="medicalInfoNumber" value="${doctorBoardshowDetail.medicalInfoNumber}" />
                    <input type="hidden" name="doctorNumber" value="${doctorNumber}" />
                    <textarea name="doctorCommentText" placeholder="댓글을 달아주세요" class="boardDetail-comment"></textarea>
                    <button type="submit" class="doctorModify">등록</button>
                </form>
            </c:when>
        </c:choose>
    </main>
    <jsp:include page="/footer.jsp" />

    <script>
        function showEditForm(commentNumber) {
            var form = document.getElementById('editForm' + commentNumber);
            form.style.display = 'block';
        }
    </script>
</body>
</html>