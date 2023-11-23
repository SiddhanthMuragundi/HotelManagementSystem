package com.jsp.HotelManagementSystem.exception;

public class RoomIdnotfoundexception extends RuntimeException {

	private String message = "room id not found";

	@Override
	public String getMessage() {
		return message;
	}

	public RoomIdnotfoundexception() {
		super();
	}

	public RoomIdnotfoundexception(String message) {
		super();
		this.message = message;
	}

}
