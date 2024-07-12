package com.tam.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.tam.service.BookService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="my_books")

public class MyBoolList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String author;
	private int price;
	
	public MyBoolList(Integer id, String name, String author, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public MyBoolList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
	