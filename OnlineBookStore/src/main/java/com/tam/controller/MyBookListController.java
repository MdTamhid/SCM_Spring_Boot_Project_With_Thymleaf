package com.tam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tam.service.MyBookListServiced;

@Controller
public class MyBookListController {
  
	@Autowired
	private MyBookListServiced bser;
	
	@GetMapping("/deleteMyList/{id}")
	public String deleteMyBookList(@PathVariable("id") int id)
	{
		bser.deleteById(id);
		return "redirect:/my_books";
	}
	

	@GetMapping("/editMyList/{id}")
	public String editMyBookList(@PathVariable("id") int id)
	{
	
		bser.editById(id);
		return "redirect:/book_register";
	}
	
	
}
