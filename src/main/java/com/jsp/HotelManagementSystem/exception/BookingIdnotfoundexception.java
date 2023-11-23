package com.jsp.HotelManagementSystem.exception;

public class BookingIdnotfoundexception extends RuntimeException {

	private String message = "booking id not found";

	@Override
	public String getMessage() {
		return message;
	}

	public BookingIdnotfoundexception() {
		super();
	}

	public BookingIdnotfoundexception(String message) {
		super();
		this.message = message;
	}

}
