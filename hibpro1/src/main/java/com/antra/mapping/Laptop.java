package com.antra.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="laptop")
public class Laptop {
	
	private Integer laptopId;
	private String laptopName;
	private Student st;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	//@JoinColumn(name="studentId", referencedColumnName="studentId", table="student")
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	
	@Id
	@GenericGenerator(strategy="increment", name="inc")
	@GeneratedValue(generator="inc")
	@Column(name="laptopId")
	public Integer getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(Integer laptopId) {
		this.laptopId = laptopId;
	}
	
	@Column(name="laptopName")
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	

}
