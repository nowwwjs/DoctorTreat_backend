package com.doctorTreat.app.doctor;

import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SMS_Service {
	private static final String API_KEY = "NCS18IZYO9RQTOML";
	private static final String API_SECRET = "41NBB8ARUZPKPFZXLPNSKXVFVGPSLJOB";
	private static final String FROM_NUMBER = "01047502177";

	public String sendVerificationSms(String to) throws CoolsmsException {
		Message coolsms = new Message(API_KEY, API_SECRET);
		String verificationCode = generateVerificationCode();

		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", to);
		params.put("from", FROM_NUMBER);
		params.put("type", "SMS");
		params.put("text", "인증번호는 [" + verificationCode + "] 입니다.");

		JSONObject obj = (JSONObject) coolsms.send(params);
		System.out.println(obj.toString());

		return verificationCode;
	}

	private String generateVerificationCode() {
		Random random = new Random();
		StringBuilder code = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			code.append(random.nextInt(10));
		}
		return code.toString();
	}

}
