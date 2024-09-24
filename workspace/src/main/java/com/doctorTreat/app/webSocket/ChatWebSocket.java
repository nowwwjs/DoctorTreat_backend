package com.doctorTreat.app.webSocket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/clinicChat/{sessionNumber}")
public class ChatWebSocket {

    // 채팅 세션별로 클라이언트 관리
    private static Map<String, Session> clients = new HashMap<>();

    @OnOpen
    public void onOpen(Session session, @PathParam("sessionNumber") String sessionNumber) {
        clients.put(sessionNumber, session);
        System.out.println("WebSocket 연결 성공-세션 번호: " + sessionNumber);
    }
    
    @OnMessage
    public void onMessage(String message, @PathParam("sessionNumber") String sessionNumber) throws IOException {
        System.out.println("비동기 메시지 수신: " + message + " from 세션 번호: " + sessionNumber);

        // 받은 메시지를 해당 채팅 세션 클라이언트에게 전송
        Session clientSession = clients.get(sessionNumber);
        if (clientSession != null && clientSession.isOpen()) {
            clientSession.getBasicRemote().sendText(message);
        }
    }

    @OnClose
    public void onClose(Session session, @PathParam("sessionNumber") String sessionNumber) {
        clients.remove(sessionNumber);
        System.out.println("WebSocket 세션 종료-세션 번호: " + sessionNumber);
    }

    @OnError
    public void onError(Session session, @PathParam("sessionNumber") String sessionNumber, Throwable throwable) {
        System.err.println("WebSocket 오류-세션 번호: " + sessionNumber + ", 에러: " + throwable.getMessage());
    }
}
