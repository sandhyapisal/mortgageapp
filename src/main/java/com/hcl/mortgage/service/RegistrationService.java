package com.hcl.mortgage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mortgage.entity.User;
import com.hcl.mortgage.repository.UserRepository;

@Service
public class RegistrationService {
	
	@Autowired
	UserRepository userRepository;
	
	public void registerUser(User user) {
		userRepository.save(user);
	}
}
