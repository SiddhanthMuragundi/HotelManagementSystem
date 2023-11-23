package com.jsp.HotelManagementSystem.exception;

public class Maxnumberpeopleexception extends RuntimeException{

	private String  message="We can't have these many number of people in seected room";
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Maxnumberpeopleexception(String message) {
		super();
		this.message = message;
	}

	public Maxnumberpeopleexception() {
		super();
	}
	

	
	
}
