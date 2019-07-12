package com.hcl.mortgage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mortgage.entity.PropertyRate;
import com.hcl.mortgage.entity.User;
import com.hcl.mortgage.repository.PropertyRateRepository;

@Service
public class PropertyService {
	
	@Autowired
	PropertyRateRepository propRateRepo;
	
	/**
	 * This method is used to calculate property value.
	 * @param user This is user details.
	 * @return property value.
	 */
	
	public Long calculatePropertyValue(User user) {
		Long propVal = 0L;
		PropertyRate rate = propRateRepo.findByPinCode(user.getPropertyPinCode());
		if(rate!=null) {
			propVal = user.getPropertyAreaSize() *  rate.getSqFeetVal();
		}
		return propVal;
	}
}
