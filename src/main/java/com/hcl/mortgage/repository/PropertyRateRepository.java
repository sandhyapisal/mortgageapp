package com.hcl.mortgage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.mortgage.entity.PropertyRate;

public interface PropertyRateRepository extends JpaRepository<PropertyRate, Long>{
	
	public PropertyRate findByPinCode(Long pinCode);
	
}
