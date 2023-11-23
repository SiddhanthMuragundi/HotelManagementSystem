package com.jsp.HotelManagementSystem.exception;

public class CustomerEmailnotfoundexception extends RuntimeException {

	private String message = "email not found";

	@Override
	public String getMessage() {
		return message;
	}

	public CustomerEmailnotfoundexception() {
		super();
	}

	public CustomerEmailnotfoundexception(String message) {
		super();
		this.message = message;
	}

}