//package com.doctorTreat.app.webSocket;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//import javax.websocket.OnClose;
//import javax.websocket.OnError;
//import javax.websocket.OnMessage;
//import javax.websocket.OnOpen;
//import javax.websocket.Session;
//import javax.websocket.server.PathParam;
//import javax.websocket.server.ServerEndpoint;
//
//@ServerEndpoint("/clinicChat/{sessionNumber}")
//public class ChatWebSocket {
//
//	// 채팅 세션별로 클라이언트 관리
//	private static Map<String, Session> clients = new HashMap<>();
//
//    @OnOpen
//    public void onOpen(Session session, @PathParam("sessionNumber") String sessionNumber) {
//        clients.put(sessionNumber, session);
//        System.out.println("WebSocket 연결 성공-세션 번호: " + sessionNumber);
//    }
//
//    @OnMessage
//    public void onMessage(String message, @PathParam("sessionNumber") String sessionNumber) throws IOException {
//        System.out.println("비동기 메시지 수신: " + message + " from 세션 번호: " + sessionNumber);
//
//        // 받은 메시지를 해당 채팅 세션 클라이언트에게 전송
//        Session clientSession = clients.get(sessionNumber);
//        if (clientSession != null && clientSession.isOpen()) {
//            clientSession.getBasicRemote().sendText(message);
//        }
//    }
//
//	@OnClose
//	public void onClose(Session session, @PathParam("sessionNumber") String sessionNumber) {
//		clients.remove(sessionNumber);
//		System.out.println("WebSocket 세션 종료-세션 번호: " + sessionNumber);
//	}
//
//	@OnError
//	public void onError(Session session, @PathParam("sessionNumber") String sessionNumber, Throwable throwable) {
//		System.err.println("WebSocket 오류-세션 번호: " + sessionNumber + ", 에러: " + throwable.getMessage());
//	}
//}

package com.doctorTreat.app.webSocket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/clinicChat/{sessionNumber}")
public class ChatWebSocket {

    // 채팅 세션별로 여러 클라이언트를 관리하기 위해 Map<String, List<Session>> 사용
    private static Map<String, List<Session>> clients = new ConcurrentHashMap<>();

    @OnOpen
    public void onOpen(Session session, @PathParam("sessionNumber") String sessionNumber) {
        List<Session> clientSessions = clients.get(sessionNumber);
        
        // 해당 세션 번호에 대한 클라이언트 목록이 없으면 새로 생성
        if (clientSessions == null) {
            clientSessions = new ArrayList<>();
            clients.put(sessionNumber, clientSessions);
        }

        // 해당 세션 번호에 새로운 클라이언트 세션 추가
        clientSessions.add(session);
        System.out.println("WebSocket 연결 성공 - 세션 번호: " + sessionNumber + ", 클라이언트 수: " + clientSessions.size());
    }

    @OnMessage
    public void onMessage(String message, @PathParam("sessionNumber") String sessionNumber) throws IOException {
        System.out.println("비동기 메시지 수신: " + message + " from 세션 번호: " + sessionNumber);

        // 해당 세션 번호에 연결된 모든 클라이언트에게 메시지 전송 (브로드캐스트)
        List<Session> clientSessions = clients.get(sessionNumber);
        if (clientSessions != null) {
            for (Session clientSession : clientSessions) {
                if (clientSession.isOpen()) {
                    clientSession.getBasicRemote().sendText(message);
                }
            }
        }
    }

    @OnClose
    public void onClose(Session session, @PathParam("sessionNumber") String sessionNumber) {
        // 해당 세션 번호의 클라이언트 목록에서 연결 종료된 클라이언트 제거
        List<Session> clientSessions = clients.get(sessionNumber);
        if (clientSessions != null) {
            clientSessions.remove(session);
            System.out.println("WebSocket 세션 종료 - 세션 번호: " + sessionNumber + ", 남은 클라이언트 수: " + clientSessions.size());

            // 클라이언트 목록이 비어 있으면 Map에서 해당 세션 번호 제거
            if (clientSessions.isEmpty()) {
                clients.remove(sessionNumber);
            }
        }
    }

    @OnError
    public void onError(Session session, @PathParam("sessionNumber") String sessionNumber, Throwable throwable) {
        System.err.println("WebSocket 오류 - 세션 번호: " + sessionNumber + ", 에러: " + throwable.getMessage());
    }
}