package com.hcl.mortgage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mortgage.entity.Offer;
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
	
	@PostMapping("/{uid}")
	public ResponseEntity<?> getOffers(@PathVariable Long uid){ 
		List<Offer> offerList = new ArrayList<Offer>();
		String message = offerService.isEligibleUserForOffer(uid);
		if(("").equals(message)) {
			offerList = offerService.getOffersForUser(uid);
			return new ResponseEntity<List<Offer>>(offerList, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(message, HttpStatus.OK);
		}
		
	}
}
