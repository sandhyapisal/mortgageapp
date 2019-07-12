package com.hcl.mortgage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcl.mortgage.entity.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long>{
	
	@Query("Select o from Offer o where o.loanAmount  < ?1")
	public List<Offer> findByLoanAmount(Long loanAmount);
	
}
