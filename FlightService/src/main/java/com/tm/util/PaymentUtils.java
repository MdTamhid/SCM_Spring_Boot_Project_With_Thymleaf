package com.tm.util;

import java.util.HashMap;
import java.util.Map;

import com.tm.exception.InsuficentAmountException;

public class PaymentUtils {
	
	private static Map<String,Double> paymentMap=new HashMap<>();
	
	static
	{
		paymentMap.put("acc1", 12000.0);
		paymentMap.put("acc2", 10000.0);
		paymentMap.put("acc3", 8000.0);
		paymentMap.put("acc4", 5000.0);
	}
	
	public static boolean validateCreditLimit(String accNo, double paidAmount)
	{
		if(paidAmount>paymentMap.get(accNo))
		{
		 throw new InsuficentAmountException("Insuffiecnt fund..!");	
		}else
		{
			return true;
		}
	}

}
