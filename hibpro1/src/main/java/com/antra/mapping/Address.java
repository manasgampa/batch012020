package com.antra.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	private Integer addressId;
	private String street;
	private String city;
	private Integer postal;
	private Employee emp;
	
	/*@ManyToOne
	@JoinColumn(name="emp_addr")
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
*/
	@Id
	@Column(name="AddressId")
	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	@Column(name="street")
	public String getStreet() {
		return street;
	}
	
	

	public void setStreet(String street) {
		this.street = street;
	}
	
	@Column(name="city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name="postal")
	public Integer getPostal() {
		return postal;
	}
	public void setPostal(Integer postal) {
		this.postal = postal;
	}
	
	
	
}
