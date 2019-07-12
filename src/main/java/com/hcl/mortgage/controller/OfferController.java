package com.hcl.mortgage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mortgage.entity.Offer;
import com.hcl.mortgage.entity.User;
import com.hcl.mortgage.service.OfferService;

@RestController
@RequestMapping("/offer")
public class OfferController {
	
	@Autowired
	OfferService offerService;
	
	/**
	 * This method is used to get offers
	 * @param uId This is user's id
	 * @return ResponseEntity This returns offer's list or error message.
	 */
	
	@PostMapping("/getOffers")
	public ResponseEntity<?> getOffers(@RequestBody User user){ 
		List<Offer> offerList = new ArrayList<Offer>();
		String message = offerService.isEligibleUserForOffer(user);
		if(("").equals(message)) {
			offerList = offerService.getOffersForUser(user);
			if(offerList.isEmpty()) {
				return new ResponseEntity<>("No Offer", HttpStatus.OK);
			}
			return new ResponseEntity<List<Offer>>(offerList, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(message, HttpStatus.OK);
		}
		
	}
}
