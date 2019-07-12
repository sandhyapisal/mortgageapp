package com.hcl.mortgage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offer")
public class Offer {

	@Id
	@Column(name = "offer_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long offerId;
	
	@Column(name="loan_amount")
	private Long loanAmount;
	
	@Column(name="rate_of_interest")
	private Long rateOfInterest;
	
	@Column(name="tenure_in_month")
	private Long tenureInMonth;

	@Column(name="emi_per_month")
	private Long emiPerMonth;

	public Long getOfferId() {
		return offerId;
	}

	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}

	public Long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Long getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Long rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public Long getTenureInMonth() {
		return tenureInMonth;
	}

	public void setTenureInMonth(Long tenureInMonth) {
		this.tenureInMonth = tenureInMonth;
	}

	public Long getEmiPerMonth() {
		return emiPerMonth;
	}

	public void setEmiPerMonth(Long emiPerMonth) {
		this.emiPerMonth = emiPerMonth;
	}
	
	
}
