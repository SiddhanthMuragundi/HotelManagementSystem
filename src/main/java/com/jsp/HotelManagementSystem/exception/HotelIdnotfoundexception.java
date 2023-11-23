package com.jsp.HotelManagementSystem.exception;

public class HotelIdnotfoundexception extends RuntimeException {

	private String message = "hotel id not found";

	@Override
	public String getMessage() {
		return message;
	}

	public HotelIdnotfoundexception() {
		super();
	}

	public HotelIdnotfoundexception(String message) {
		super();
		this.message = message;
	}

}
