package com.jsp.HotelManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.HotelManagementSystem.dto.Customer;
import com.jsp.HotelManagementSystem.service.Customerservice;
import com.jsp.HotelManagementSystem.util.Responsestructure;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/customer")
public class Customercontroller {

	@Autowired
	public Customerservice customerservice;
	
	@ApiOperation(value = "save customer",notes = "api is used to save customer")
	@ApiResponses(value = {@ApiResponse(code = 201,message = "customer succesfully created"),
			@ApiResponse(code = 404,message = "customer not saved give proper input")})
	@PostMapping
	public ResponseEntity<Responsestructure<Customer>> saveCustomer(@RequestBody Customer customer)
	{
		return customerservice.saveCustomer(customer);
	}
	
	@ApiOperation(value = "update customer",notes = "api is used to update customer")
	@ApiResponses(value = {@ApiResponse(code = 200,message = "customer succesfully updated"),
			@ApiResponse(code = 404,message = "customer not updated give proper input")})
	@PutMapping
	public ResponseEntity<Responsestructure<Customer>> updateCustomer(@RequestParam int cid, @RequestBody Customer customer)
	{
		return customerservice.updateCustomer(cid, customer);
	}
	
	@ApiOperation(value = "delete customer",notes = "api is used to delete customer")
	@ApiResponses(value = {@ApiResponse(code = 200,message = "customer succesfully deleted"),
			@ApiResponse(code = 404,message = "customer not deleted give proper input")})
	@DeleteMapping
	public ResponseEntity<Responsestructure<Customer>> deleteCustomer(@RequestParam int cid)
	{
		return customerservice.deleteCustomer(cid);
	}
	
	@ApiOperation(value = "get customer by id",notes = "api is used to get customer details based on id")
	@ApiResponses(value = {@ApiResponse(code = 302,message = "succesfully found customer"),
			@ApiResponse(code = 404,message = "customer not found give proper input")})
	@GetMapping
	public ResponseEntity<Responsestructure<Customer>> getCustomerbyid(@RequestParam int cid)
	{
		return customerservice.getCustomerbyid(cid);
	}
	
	@ApiOperation(value = "get customer by email",notes = "api is used to get customer details based on email")
	@ApiResponses(value = {@ApiResponse(code = 302,message = "succesfully found customer"),
			@ApiResponse(code = 404,message = "customer not found give proper input")})
	@GetMapping("/customerbyemail")
	public ResponseEntity<Responsestructure<Customer>> getCustomerbyemail(@RequestParam String c_email)
	{
		return customerservice.getCustomerbyemail(c_email);
	}
	
	@ApiOperation(value = "get all customer",notes = "api is used to get all customer details")
	@ApiResponses(value = {@ApiResponse(code = 302,message = "succesfully found all customers"),
			@ApiResponse(code = 404,message = "customers not found give proper input")})
	@GetMapping("/getallcustomers")
	public ResponseEntity<Responsestructure<List<Customer>>> getallcustomer()
	{
		return customerservice.getallCustomers();
	}
	
	@ApiOperation(value = "login customer by id",notes = "api is used to login customer using details customer id")
	@ApiResponses(value = {@ApiResponse(code = 302,message = "succesfully log in the customer"),
			@ApiResponse(code = 404,message = "customer unable to log in give proper input")})
	@GetMapping("/customerlogin")
	public ResponseEntity<Responsestructure<Customer>> loginCustomer(@RequestParam String email,@RequestParam String password) {
		return customerservice.loginCustomer(email, password);
		
	}
}
