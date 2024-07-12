package com.tm.dto;

import com.tm.entity.PassengerInfo;
import com.tm.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
	
	private PassengerInfo passengerInfo;
	
	private PaymentInfo paymentInfo;

}
