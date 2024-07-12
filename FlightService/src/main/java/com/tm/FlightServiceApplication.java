package com.tm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tm.dto.FlightBookingAcknowledgement;
import com.tm.dto.FlightBookingRequest;
import com.tm.service.FlightBookingService;

@SpringBootApplication
@RestController
public class FlightServiceApplication {
	
	@Autowired
	private FlightBookingService flightservice;
	
	@PostMapping("/flightBookTicket")
	public FlightBookingAcknowledgement flightBookingTicekt(@RequestBody FlightBookingRequest request)
	{
		 FlightBookingAcknowledgement ticket = flightservice.bookFlightTieckt(request);
		 return ticket;
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightServiceApplication.class, args);
	}

}
