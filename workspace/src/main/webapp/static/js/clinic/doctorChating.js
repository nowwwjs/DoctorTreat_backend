
$(document).ready(function() {
	const messageInput = document.getElementById('chatRoom-chatArea');
	const sendButton = document.getElementById('chatRoom-submit');
	const chatMessages = document.getElementById('chatMessages');
	const doctorId = document.getElementById('doctorNumber').value;
	const memberId = document.getElementById('memberNumber').value;
	const sessionNumber = document.getElementById('chatSessionNumber').value;

	console.log(messageInput);
	console.log(chatMessages);
	console.log(sendButton);
	console.log(doctorId);
	console.log(memberId);
	console.log(sessionNumber);

	let websocket;

	// WebSocket 연결 설정
	function initializeWebSocket() {
		websocket = new WebSocket(`ws://localhost:9000/clinicChat/${sessionNumber}`);
		console.log("WebSocket 연결 시도: userId =", doctorId);

		websocket.onopen = function() {
			console.log("WebSocket 연결 성공");
		};

		websocket.onmessage = function(event) {
			const data = JSON.parse(event.data);
			console.log("실시간 데이터 수신:", data);

			if (data.type === "newRequest") {
				updateNewRequests(data.students);
			} else if (data.type === "previousChats") {
				updatePreviousChats(data.previousChats);
			} else {
				// 채팅 메시지 화면에 추가
				const listItem = document.createElement('div');
				listItem.className = 'chat-message';
				listItem.textContent = `${data.sender}: ${data.message}`;
				chatMessages.appendChild(listItem);
				chatMessages.scrollTop = chatMessages.scrollHeight; // 스크롤을 맨 아래로
			}
		};

		websocket.onclose = function() {
			console.log("WebSocket 연결 종료");
		};

		websocket.onerror = function(error) {
			console.error("WebSocket 오류:", error);
		};
	}

	// 메시지 전송
	sendButton.addEventListener('click', function() {
		const message = messageInput.value;
		if (message.trim() !== "") {
			websocket.send(JSON.stringify({
				sender: doctorId,
				message: message
			}));
			messageInput.value = ''; // 입력창 초기화
		}
	});

	// 채팅 메시지 보내기 버튼 클릭 또는 엔터키 누를 때
	$('#chatRoom-submit').click(function() {
		sendMessage();
	});

	$('#chatRoom-chatArea').keypress(function(event) {
		if (event.which == 13) { // Enter key
			event.preventDefault();
			sendMessage();
		}
	});


	//비동기로 데이터 저장
	function sendMessage() {
		// 입력된 메시지 가져오기
		let message = $('#chatRoom-chatArea').val();
		if (message.trim() === '') {
			return; // 빈 메시지는 전송하지 않음
		}

		// 채팅방 정보 가져오기
		let sessionNumber = $('#chatRoom-info').text();

		// Ajax를 사용하여 서버로 데이터 전송
		$.ajax({
			url: '/sendOkController.doccl', // 전송할 서블릿의 URL
			type: 'POST',
			data: {
				message: message,
				sessionNumber: sessionNumber
			},
			success: function(response) {
				// 서버에서 응답받은 메시지를 화면에 추가
				addMessageToChat(response.message, response.doctorName, response.timestamp, true);
				// 입력 창 비우기
				$('#chatRoom-chatArea').val('');
			},
			error: function() {
				alert('메시지 전송에 실패했습니다.');
			}
		});
	}

	// 새 메시지를 화면에 추가하는 함수
	function addMessageToChat(message, senderName, timestamp, isSender) {
		let chatHtml;
		if (isSender) {
			// 본인 메시지 레이아웃
			chatHtml = `
                <div class="chatRoom-doctorChat">
                    <div class="chatRoom-doctorName">${senderName}</div>
                    <div class="chatRoom-doctorMsgContainer">
                        <div class="chatRoom-doctorMsg">${message}</div>
                        <div class="chatRoom-doctorMsgDate">${timestamp}</div>
                    </div>
                </div>
            `;
		} else {
			// 상대방 메시지 레이아웃
			chatHtml = `
                <div class="chatRoom-memberChat">
                    <div class="chatRoom-memberName">${senderName}</div>
                    <div class="chatRoom-memberMsgContainer">
                        <div class="chatRoom-memberMsgDate">${timestamp}</div>
                        <div class="chatRoom-memberMsg">${message}</div>
                    </div>
                </div>
            `;
		}

		// 채팅창에 새 메시지 추가
		$('.chatRoom-chatBox').append(chatHtml);

		// 스크롤을 가장 아래로
		$('.chatRoom-chatBox').scrollTop($('.chatRoom-chatBox')[0].scrollHeight);
	}

	/*
		let lastMessages = []; // 이미 불러온 메시지를 저장할 배열
	
		// 주기적으로 새로운 메시지 체크 (5초마다)
		setInterval(function() {
			checkForNewMessages();
		}, 5000);
	
		function checkForNewMessages() {
			let sessionNumber = $('#chatRoom-info').text();
	
			$.ajax({
				url: '/receiveController.doccl', // 새로운 메시지 가져오는 서블릿
				type: 'GET',
				data: {
					sessionNumber: sessionNumber
				},
				success: function(response) {
					for (let i = 0; i < response.length; i++) {
						let message = response[i].message;
						let sender = response[i].sender;
						let timestamp = response[i].timestamp;
	
						// 이미 불러온 메시지인지 확인
						if (!lastMessages.includes(message)) {
							addMessageToChat(message, sender, timestamp, false);
							lastMessages.push(message); // 새로운 메시지 추가
						}
					}
				},
				error: function() {
					console.log('새 메시지 로딩 실패');
				}
			});
		}*/

	initializeWebSocket();

});
