package com.tm.exception;

import javax.naming.InsufficientResourcesException;

public class InsuficentAmountException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsuficentAmountException(String msg)
	{
		super(msg);
	}

}
