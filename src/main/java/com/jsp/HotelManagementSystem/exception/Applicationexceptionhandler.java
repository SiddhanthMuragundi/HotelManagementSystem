package com.jsp.HotelManagementSystem.exception;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jsp.HotelManagementSystem.util.Responsestructure;

@ControllerAdvice
public class Applicationexceptionhandler extends ResponseEntityExceptionHandler {
	Responsestructure<String> responsestructure=new Responsestructure<>();
	
	@ExceptionHandler(HotelIdnotfoundexception.class)
	public ResponseEntity<Responsestructure<String>> hotelidnotfoundexception(HotelIdnotfoundexception ex)
	{
		responsestructure.setMessage("hotel id not found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Responsestructure<String>> nosuchelementexception(NoSuchElementException ex)
	{
		responsestructure.setMessage("no element found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<ObjectError> list=ex.getAllErrors();
		Map<String, String> map=new LinkedHashMap<>();
		for(ObjectError error:list)
		{
			String  fieldname=((FieldError)error).getField();
			String message=((FieldError)error).getDefaultMessage();
			map.put(fieldname, message);
		}
		return new ResponseEntity<Object>(map,HttpStatus.BAD_REQUEST);
			
		}

	public ResponseEntity<Responsestructure<String>> handleconstraintviolationexception(ConstraintViolationException ex)
	{
		responsestructure.setMessage(ex.getMessage());
		responsestructure.setData("this field cannot be null or blank");
		responsestructure.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Roomnoexception.class)
	public ResponseEntity<Responsestructure<String>> roomnoexception(Roomnoexception ex)
	{
		responsestructure.setMessage("room no not found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Roomtypeexception.class)
	public ResponseEntity<Responsestructure<String>> roomtypeexception(Roomtypeexception ex)
	{
		responsestructure.setMessage("room type not found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Roomavailabilityexception.class)
	public ResponseEntity<Responsestructure<String>> roomavailabilityexception(Roomavailabilityexception ex)
	{
		responsestructure.setMessage("room availability not found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(CustomerEmailnotfoundexception.class)
	public ResponseEntity<Responsestructure<String>> customeremailnotfoundexception(CustomerEmailnotfoundexception ex)
	{
		responsestructure.setMessage("customer email not found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AdminEmailnotfoundexception.class)
	public ResponseEntity<Responsestructure<String>> adminemailnotfoundexception(AdminEmailnotfoundexception ex)
	{
		responsestructure.setMessage("admin email not found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(BookingIdnotfoundexception.class)
	public ResponseEntity<Responsestructure<String>> bookingidnotfoundexception(BookingIdnotfoundexception ex)
	{
		responsestructure.setMessage("booking id not found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(RoomIdnotfoundexception.class)
	public ResponseEntity<Responsestructure<String>> roomidnotfoundexception(RoomIdnotfoundexception ex)
	{
		responsestructure.setMessage("room id not found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(CustomerIdnotfoundexception.class)
	public ResponseEntity<Responsestructure<String>> customeridnotfoundexception(CustomerIdnotfoundexception ex)
	{
		responsestructure.setMessage("customer id not found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AdminIdnotfoundexception.class)
	public ResponseEntity<Responsestructure<String>> adminidnotfoundexception(AdminIdnotfoundexception ex)
	{
		responsestructure.setMessage("admin id not found");
		responsestructure.setStatus(HttpStatus.NOT_FOUND.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Maxnumberpeopleexception.class)
	public ResponseEntity<Responsestructure<String>> maxnumberpeopleexception(Maxnumberpeopleexception ex)
	{
		responsestructure.setMessage(" Max limit of people for  the particular room.");
		responsestructure.setStatus(HttpStatus.BAD_REQUEST.value());
		responsestructure.setData(ex.getMessage());
		return new ResponseEntity<Responsestructure<String>>(responsestructure,HttpStatus.BAD_REQUEST);
	}
	
}
