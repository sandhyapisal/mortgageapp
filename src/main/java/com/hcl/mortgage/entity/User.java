package com.hcl.mortgage.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * User Name
		Phone Number
		DOB
		Emila
		Gender
		PAN
		Salary
		Property Type
		Property Address
		Property Pin code
		Property area size
 */
@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(name = "uid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private Long phone;
	
	@Column(name="pan")
	private String pan;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="salary")
	private Long salary;
	
	@Column(name="property_type")
	private String propertyType;
	
	@Column(name="property_address")
	private String propertyAddr;
	
	@Column(name="property_pin_code")
	private Long propertyPinCode;
	
	@Column(name="property_area_size")
	private Long propertyAreaSize;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getPropertyAddr() {
		return propertyAddr;
	}

	public void setPropertyAddr(String propertyAddr) {
		this.propertyAddr = propertyAddr;
	}

	public Long getPropertyPinCode() {
		return propertyPinCode;
	}

	public void setPropertyPinCode(Long propertyPinCode) {
		this.propertyPinCode = propertyPinCode;
	}

	public Long getPropertyAreaSize() {
		return propertyAreaSize;
	}

	public void setPropertyAreaSize(Long propertyAreaSize) {
		this.propertyAreaSize = propertyAreaSize;
	}
	
}
