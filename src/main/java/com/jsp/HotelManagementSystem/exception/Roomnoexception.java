package com.jsp.HotelManagementSystem.exception;

public class Roomnoexception extends RuntimeException {

	private String message = "room no not found";

	@Override
	public String getMessage() {
		return message;
	}

	public Roomnoexception() {
		super();
	}

	public Roomnoexception(String message) {
		super();
		this.message = message;
	}

}