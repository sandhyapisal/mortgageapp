package com.hcl.mortgage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mortgage.entity.Offer;
import com.hcl.mortgage.entity.User;
import com.hcl.mortgage.repository.OfferRepository;
import com.hcl.mortgage.repository.UserRepository;
import com.hcl.mortgage.util.Utility;

/**
 * This service is used to get offer's as per property value.
 */
@Service
public class OfferService {

	@Autowired
	OfferRepository offerRepo;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PropertyService propertyService;
	
	/**
	 * This method is used to get offers.
	 * @param propertyVal This is property value of user
	 * @return offers list This returns offer list.
	 */
	public List<Offer> getOffers(Long propertyVal){
		return offerRepo.findByLoanAmount(propertyVal);
		
	}
	
	/**
	 * This method is used to get offers.
	 * @param uId This is user's id
	 * @return offers list This returns offer list.
	 */
	public List<Offer> getOffersForUser(User user){
		Long propVal =  propertyService.calculatePropertyValue(user);
		return offerRepo.findByLoanAmount((propVal*80)/100);
	}
	
	
	/**
	 * This method is used to check whether user is eligible or not
	 * @param uId This is user's id
	 * @return String This returns message.
	 */
	
	public String isEligibleUserForOffer(User user) {
		String msg = "";
			
		if(Utility.getAge(user.getDob()) < 25) {
			msg = "User's age should be greater than 25 years.";
		}else if(user.getSalary() < 10000) {
			msg = "User's salary should be greater than 10,000.";
		}else if(propertyService.calculatePropertyValue(user) < 500000) {
			msg = "User's property value should be greater than 5 Lakhs.";
		}
		
		return msg;
	}
	
	
}
