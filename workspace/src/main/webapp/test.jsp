<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>WebSocket 테스트</title>
</head>
<body>
    <h1>WebSocket 연결 테스트</h1>
    <button id="connect">Connect</button>
    <p id="status"></p>
    <script>
        document.getElementById('connect').addEventListener('click', function() {
            const socket = new WebSocket('ws://localhost:9000/clinicChat'); //너 포트번호로 변경
            socket.onopen = function() {
                document.getElementById('status').textContent = 'WebSocket 연결 성공!';
            };
            socket.onclose = function() {
                document.getElementById('status').textContent = 'WebSocket 연결 종료';
            };
            socket.onerror = function() {
                document.getElementById('status').textContent = 'WebSocket 연결 오류';
            };
        });
    </script>
</body>
</html>