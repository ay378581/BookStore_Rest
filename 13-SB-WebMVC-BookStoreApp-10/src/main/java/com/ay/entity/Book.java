package com.ay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Book_DTLS")
public class Book {

	@Id
	@GeneratedValue
	@Column(name = "Book_ID")
	private Integer id;

	@Column(name = "Book_Name")
	private String name;
	
	@Column(name = "Book_Price")
	private String price;
	
	@Column(name = "Book_Author")
	private String author;

}
