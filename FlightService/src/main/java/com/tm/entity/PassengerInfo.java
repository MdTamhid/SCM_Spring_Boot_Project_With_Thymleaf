package com.tm.entity;



import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Table(name="PASSENGER_INFO")
public class PassengerInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pId;
	private String name;
	private String email;
	private String source;
    private String destination;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="dd-mm-yyyy")
	private Date travleDate;
	private String pickupTime;
	private String arrivalTime;
	private double fare;
	

}