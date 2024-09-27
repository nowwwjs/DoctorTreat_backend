$(document).ready(function() {
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
            url: '/sendOkController.memcl', // 전송할 서블릿의 URL
            type: 'POST',
            data: {
                message: message,
                sessionNumber: sessionNumber
            },
            success: function(response) {
                // 입력 창 비우기
                $('#chatRoom-chatArea').val('');

                // 응답으로 받은 메시지를 화면에 표시
                addMessageToChat(response.message, response.memberName, response.timestamp);
            },
            error: function() {
                alert('메시지 전송에 실패했습니다.');
            }
        });
    }

    // 새 메시지를 화면에 추가하는 함수
    function addMessageToChat(message, memberName, timestamp) {
        let chatHtml = `
            <div class="chatRoom-memberChat">
                <div class="chatRoom-memberName">${memberName}</div>
                <div class="chatRoom-memberMsgContainer">
                    <div class="chatRoom-memberMsgDate">${timestamp}</div>
                    <div class="chatRoom-memberMsg">${message}</div>
                </div>
            </div>
        `;
        // 채팅창에 새 메시지 추가
        $('.chatRoom-chatBox').append(chatHtml);

        // 스크롤을 가장 아래로
        $('.chatRoom-chatBox').scrollTop($('.chatRoom-chatBox')[0].scrollHeight);
    }
});
