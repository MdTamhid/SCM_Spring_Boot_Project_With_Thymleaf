package com.tm.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.dto.FlightBookingAcknowledgement;
import com.tm.dto.FlightBookingRequest;
import com.tm.entity.PassengerInfo;
import com.tm.entity.PaymentInfo;
import com.tm.repository.PassengerInfoRepository;
import com.tm.repository.PaymentInfoRepository;
import com.tm.util.PaymentUtils;

import jakarta.transaction.Transactional;

@Service
public class FlightBookingService {
	
	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	@Transactional
	public FlightBookingAcknowledgement bookFlightTieckt(FlightBookingRequest request)
	{
		
		PassengerInfo passengerInfo=request.getPassengerInfo();
		passengerInfo=passengerInfoRepository.save(passengerInfo);
		
		PaymentInfo paymentInfo=request.getPaymentInfo();
		
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());
		
		paymentInfo.setPassengerId(passengerInfo.getPId());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepository.save(paymentInfo);
		
		return new FlightBookingAcknowledgement("SUCCESS",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
	}

}
