package com.jsp.HotelManagementSystem.exception;

public class CustomerIdnotfoundexception extends RuntimeException {

	private String message = "custommer id not found";

	@Override
	public String getMessage() {
		return message;
	}

	public CustomerIdnotfoundexception() {
		super();
	}

	public CustomerIdnotfoundexception(String message) {
		super();
		this.message = message;
	}

}
