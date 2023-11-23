package com.jsp.HotelManagementSystem.exception;

public class AdminEmailnotfoundexception extends RuntimeException {

	private String message = "email not found";

	@Override
	public String getMessage() {
		return message;
	}

	public AdminEmailnotfoundexception() {
		super();
	}

	public AdminEmailnotfoundexception(String message) {
		super();
		this.message = message;
	}

}