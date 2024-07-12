package com.tm.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="new_user")
public class User {
    
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
	private String name;
	private String address;
	private double salary;
	private int age;
}
