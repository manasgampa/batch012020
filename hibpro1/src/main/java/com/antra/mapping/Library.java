package com.antra.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="library")
public class Library {
	
	private int book_id;
	private String book_name;
	
	@Id
	@GenericGenerator(strategy="increment", name="inc" )
	@GeneratedValue(generator="inc")
	@Column(name="bool_id")
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	
	@Column(name="book_name")
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	

}
