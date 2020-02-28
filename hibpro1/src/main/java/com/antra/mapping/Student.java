package com.antra.mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student")
public class Student {

	private Integer studentId;
	private String name;
	private Integer marks;
	
	
	public List<Laptop> laptops= new ArrayList<Laptop>();;
	
	/*@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)//mappedBy="st",
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}*/
	
	@Id
	@GenericGenerator(strategy="increment", name="inc" )
	@GeneratedValue(generator="inc")
	@Column(name="studentId")
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	
	@Column(name="studentName")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="studentMarks")
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	
	
}
