$(document).ready(function() {
	const messageInput = document.getElementById('chatRoom-chatArea');
	const sendButton = document.getElementById('chatRoom-submit');
	const chatMessages = document.getElementById('chatMessages');
	const doctorId = document.getElementById('doctorNumber').value;
	const memberId = document.getElementById('memberNumber').value;
	const memberName = document.getElementById('memberName').value;
	const sessionNumber = document.getElementById('chatSessionNumber').value;

	console.log(messageInput);
	console.log(chatMessages);
	console.log(sendButton);
	console.log(doctorId);
	console.log(memberId);
	console.log(memberName);
	console.log(sessionNumber);

	// 현재 시간
	function getCurrentTimestamp() {
		const now = new Date();
		return formatTimestamp(now);
	}

	// 날짜와 시간을 포맷팅하는 함수
	function formatTimestamp(date) {
		let year = date.getFullYear();
		let month = String(date.getMonth() + 1).padStart(2, '0');
		let day = String(date.getDate()).padStart(2, '0');
		let hours = String(date.getHours()).padStart(2, '0');
		let minutes = String(date.getMinutes()).padStart(2, '0');

		return `${year}.${month}.${day} ${hours}:${minutes}`;
	}

	let websocket;

	// WebSocket 연결 설정
	function initializeWebSocket() {
		websocket = new WebSocket(`ws://localhost:9000/clinicChat/${sessionNumber}`);
		console.log("WebSocket 연결 시도: sessionNumber =", sessionNumber);

		websocket.onopen = function() {
			console.log("WebSocket 연결 성공");
		};

		websocket.onmessage = function(event) {
			const data = JSON.parse(event.data);
			console.log("받은 메시지:", data);

			// 현재 시간 갱신
			let timestamp = getCurrentTimestamp();
			const senderName = data.sender; // 데이터에서 보낸 사람 이름 가져오기
			const message = data.message; // 데이터에서 메시지 가져오기
			const isSender = (senderName === memberName); // 본인인지 확인

			// 채팅 메시지 HTML 생성
			let chatHtml;
			if (isSender) {
				// 환자 메세지 레이아웃
				chatHtml = `
                <div class="chatRoom-memberChat">
                    <div class="chatRoom-memberName">${senderName}</div>
                    <div class="chatRoom-memberMsgContainer">
                        <div class="chatRoom-memberMsgDate">${timestamp}</div>
                        <div class="chatRoom-memberMsg">${message}</div>
                    </div>
                </div>
            `;
			} else {
				// 의사 메세지 레이아웃
				chatHtml = `
                <div class="chatRoom-doctorChat">
                    <div class="chatRoom-doctorName">전문의 ${senderName}</div>
                    <div class="chatRoom-doctorMsgContainer">
                        <div class="chatRoom-doctorMsg">${message}</div>
                        <div class="chatRoom-doctorMsgDate">${timestamp}</div>
                    </div>
                </div>
            `;
			}

			// 채팅 메시지 화면에 추가
			chatMessages.insertAdjacentHTML('beforeend', chatHtml);
			chatMessages.scrollTop = chatMessages.scrollHeight; // 스크롤을 맨 아래로-
		};

		websocket.onclose = function() {
			console.log("WebSocket 연결 종료");
		};

		websocket.onerror = function(error) {
			console.error("WebSocket 오류:", error);
		};
	}

	// 채팅 메시지 보내기 버튼 클릭 또는 엔터키 누를 때
	$('#chatRoom-submit').click(function() {
		sendSocket();
	});

	$('#chatRoom-chatArea').keypress(function(event) {
		if (event.which == 13) { // Enter key
			event.preventDefault();
			sendSocket();
		}
	});

	// 메시지를 전송하는 함수
	function sendSocket() {
		sendDB();

		const message = messageInput.value; // 입력된 메시지 가져오기
		if (message.trim() !== "") {
			websocket.send(JSON.stringify({
				sender: memberName,
				message: message
			}));
			messageInput.value = ''; // 입력창 초기화
		}
	}

	// 비동기로 데이터 저장
	function sendDB() {
		// 입력된 메시지 가져오기
		let message = $('#chatRoom-chatArea').val();
		if (message.trim() === '') {
			return; // 빈 메시지는 전송하지 않음
		}

		// 채팅방 정보 가져오기
		let sessionNumber = $('#chatRoom-info').text();


		// Ajax를 사용하여 서버로 데이터 전송
		$.ajax({
			url: '/sendOkController.memcl', // 전송할 서블릿의 URL
			type: 'POST',
			data: {
				message: message,
				sessionNumber: sessionNumber
			},
			success: function() {
				// 입력 창 비우기
				$('#chatRoom-chatArea').val('');
			},
			error: function() {
				alert('메시지 전송에 실패했습니다.');
			}
		});
	}

	initializeWebSocket();
});
