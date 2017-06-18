package com.eworldtrade.model.dto;

public class ResponseMessage {
	
	int responseCode;
	String message;
	
	public ResponseMessage(int responseCode) {
		this.responseCode = responseCode;
	}
	
	public ResponseMessage(String message) {
		this.message = message;
	}
	
	
	public ResponseMessage(int responseCode, String message) {
		this.responseCode = responseCode;
		this.message = message;
	}
	
	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
