package com.hcl.mortgage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "property_rate")
public class PropertyRate {

	@Id
	@Column(name = "property_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long propId;
	
	@Column(name="property_pin_code")
	private Long pinCode;
	
	@Column(name="property_sq_feet_val")
	private Long sqFeetVal;

	public Long getPropId() {
		return propId;
	}

	public void setPropId(Long propId) {
		this.propId = propId;
	}

	public Long getPinCode() {
		return pinCode;
	}

	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}

	public Long getSqFeetVal() {
		return sqFeetVal;
	}

	public void setSqFeetVal(Long sqFeetVal) {
		this.sqFeetVal = sqFeetVal;
	}
	
	
}
