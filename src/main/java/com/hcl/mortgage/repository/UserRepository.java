package com.hcl.mortgage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.mortgage.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	//List<User> findByIdAndPassword(Long uid, String passwd);
}
