package com.tm.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tm.exception.UserNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public Map<String,String>handlerUserException(UserNotFoundException ex)
	{
		Map<String,String> map=new HashMap<>();
		map.put("error message is", ex.getMessage());
		return map;
	}

}
