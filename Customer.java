package com.zwiggy.models;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private long customerId;
	
	@Column(name="customer_name")
	private String CustomerName;
	
	@Column(name="customer_number")
	private long MobileNumber;
	
	@Column(name="customer_email")
	private String Email;
	
//	@Column(name="Order_FK")
	@OneToOne(mappedBy = "customer",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name ="Order_FK" )
	private Order order;
	
	public Customer() {		
	}

	public Customer(long customerId, String customerName, long mobileNumber, String email) {
		
		this.customerId = customerId;
		CustomerName = customerName;
		MobileNumber = mobileNumber;
		Email = email;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
	
	

}
