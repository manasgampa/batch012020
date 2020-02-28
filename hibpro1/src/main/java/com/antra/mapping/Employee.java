package com.antra.mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="employee")
public class Employee {

	private Integer id;
	private String name;
	private Integer sal;
	private Address addr;
	
	//private List<Address> liAdd=new ArrayList();
	
	
	

	/*@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="emp_addr")
	public List<Address> getLiAdd() {
		return liAdd;
	}
	public void setLiAdd(List<Address> liAdd) {
		this.liAdd = liAdd;
	}*/
	
	
	@Id
	/*@GenericGenerator(strategy="increment", name="inc" )
	@GeneratedValue(generator="inc")*/
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="sal")
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="addr_Id")
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	
}
