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

import com.jsp.HotelManagementSystem.dto.Admin;
import com.jsp.HotelManagementSystem.service.Adminservice;
import com.jsp.HotelManagementSystem.util.Responsestructure;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/admin")
public class Admincontroller {

	@Autowired
	private Adminservice adminservice;

	@ApiOperation(value = "save admin",notes = "api is used to save admin")
	@ApiResponses(value = {@ApiResponse(code = 201,message = "admin succesfully created"),
			@ApiResponse(code = 404,message = "admin not saved give proper input")})
	@PostMapping
	public ResponseEntity<Responsestructure<Admin>> saveAdmin(@RequestBody Admin admin, @RequestParam int hid) {
		return adminservice.saveAdmin(admin, hid);

	}

	@ApiOperation(value = "update admin",notes = "api is used to update admin")
	@ApiResponses(value = {@ApiResponse(code = 200,message = "admin succesfully updated"),
			@ApiResponse(code = 404,message = "admin not updated give proper input")})
	@PutMapping
	public ResponseEntity<Responsestructure<Admin>> updateAdmin(@RequestBody Admin admin, @RequestParam int aid) {
		return adminservice.updateAdmin(aid, admin);

	}

	@ApiOperation(value = "delete admin",notes = "api is used to delete admin")
	@ApiResponses(value = {@ApiResponse(code = 200,message = "admin succesfully deleted"),
			@ApiResponse(code = 404,message = "admin not deleted give proper input")})
	@DeleteMapping
	public ResponseEntity<Responsestructure<Admin>> deleteAdmin(@RequestParam int aid) {
		return adminservice.deleteAdmin(aid);

	}

	@ApiOperation(value = "get admin by id", notes = "api is used to get admin details based on id")
	@ApiResponses(value = {@ApiResponse(code = 302, message = "successfully found admin"),
			@ApiResponse(code = 404, message = "admin not found give proper input")})
	@GetMapping("/adminbyid")
	public ResponseEntity<Responsestructure<Admin>> getAdminbyid(@RequestParam int aid) {
		return adminservice.getAdminbyid(aid);

	}

	@ApiOperation(value = "get admin by email", notes = "api is used to get admin details based on email")
	@ApiResponses(value = {@ApiResponse(code = 302, message = "successfully found admin"),
			@ApiResponse(code = 404, message = "admin not found give proper input")})
	@GetMapping("/adminbyemail")
	public ResponseEntity<Responsestructure<Admin>> getAdminbyemail(@RequestParam String email) {
		return adminservice.getadminbyemail(email);

	}

	@ApiOperation(value = "get all admins", notes = "api is used to get all admin details")
	@ApiResponses(value = {@ApiResponse(code = 302, message = "successfully found all admins"),
			@ApiResponse(code = 404, message = "admins not found give proper input")})
	@GetMapping("/getalladmin")
	public ResponseEntity<Responsestructure<List<Admin>>> getallAdmin() {
		return adminservice.getallAdmin();
	}

	@ApiOperation(value = "login admin by email", notes = "api is used to login admin using email and password")
	@ApiResponses(value = {@ApiResponse(code = 302, message = "successfully logged in the admin"),
			@ApiResponse(code = 404, message = "admin unable to log in give proper input")})
	@GetMapping("/loginadmin")
	public ResponseEntity<Responsestructure<Admin>> loginAdmin(@RequestParam String email, @RequestParam String password) {
		return adminservice.loginAdmin(email, password);

	}
}










