package com.jsp.HotelManagementSystem.exception;

public class AdminIdnotfoundexception extends RuntimeException {

	private String message = "admin id not found";

	@Override
	public String getMessage() {
		return message;
	}

	public AdminIdnotfoundexception() {
		super();
	}

	public AdminIdnotfoundexception(String message) {
		super();
		this.message = message;
	}

}
