package com.hcl.mortgage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mortgage.entity.User;
import com.hcl.mortgage.repository.UserRepository;

@Service
public class RegistrationService {
	
	@Autowired
	UserRepository userRepository;
	
	/**
	 * This method is used to register user
	 * @param user This is user details
	 */
	public void registerUser(User user) {
		userRepository.save(user);
	}
}
