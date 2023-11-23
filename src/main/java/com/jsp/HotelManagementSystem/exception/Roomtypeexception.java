package com.jsp.HotelManagementSystem.exception;

public class Roomtypeexception extends RuntimeException {

	private String message = "id not found";

	@Override
	public String getMessage() {
		return message;
	}

	public Roomtypeexception() {
		super();
	}

	public Roomtypeexception(String message) {
		super();
		this.message = message;
	}

}