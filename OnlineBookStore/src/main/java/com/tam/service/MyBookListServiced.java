package com.tam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tam.model.*;
import com.tam.reository.MyBookRepository;

@Service
public class MyBookListServiced {
	
	@Autowired 
	private MyBookRepository bookRepo;
	
	public void saveMybooks(MyBoolList book)
	{
		bookRepo.save(book);
	}
	
	public List<MyBoolList> getAllbook()
	{
		return bookRepo.findAll();
	}
	
	public void deleteById(int id)
	{
		bookRepo.deleteById(id);
	}
	
	@SuppressWarnings("deprecation")
	public void editById(int id)
	{
		bookRepo.getById(id);
	}
	
	
}
