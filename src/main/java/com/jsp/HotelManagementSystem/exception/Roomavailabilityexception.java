package com.jsp.HotelManagementSystem.exception;

public class Roomavailabilityexception extends RuntimeException {

	private String message = "Room availability not found";

	@Override
	public String getMessage() {
		return message;
	}

	public Roomavailabilityexception() {
		super();
	}

	public Roomavailabilityexception(String message) {
		super();
		this.message = message;
	}

}