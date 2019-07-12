package com.hcl.mortgage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mortgage.entity.User;
import com.hcl.mortgage.service.RegistrationService;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationSeirvice;
	
	/**
	 * This method is used to register user
	 * @param user This is user details
	 */
	@PostMapping("/registerUser")
	public void addUser(@RequestBody User user){
		
		registrationSeirvice.registerUser(user);
	}
}
