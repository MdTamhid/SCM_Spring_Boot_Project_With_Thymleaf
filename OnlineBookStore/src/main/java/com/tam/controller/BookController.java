package com.tam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tam.model.Book;
import com.tam.model.MyBoolList;
import com.tam.service.BookService;
import com.tam.service.MyBookListServiced;



@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	@Autowired
	private MyBookListServiced mybservice;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister()
	{
		return "book_register";
	}
	
	@GetMapping("/available_books")
	public ModelAndView getAllBooks()
	{
		List<Book> list = service.getAllBook();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("AllBook");
		return new ModelAndView("AllBook","book",list);
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b)
	{
		service.save(b);
	return "redirect:/available_books";
	}
	
	@GetMapping("/my_books")
	public String getMyBooks(Model model)
	{
		List<MyBoolList> list = mybservice.getAllbook();
		model.addAttribute("book",list);
		
		return "myBooks";
	}
	
	
	    @GetMapping("/mylist/{id}")
		public String getMyList(@PathVariable("id") int id)
		{
		Book b = service.getBookById(id);
		
		MyBoolList m = new MyBoolList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
		mybservice.saveMybooks(m);
		return "redirect:/my_books";
		
		}
	    
	    // Edit book by id
	    //@GetMapping("/editBook/{id}")
	    @GetMapping("/editBook/{id}")
	    public String editBook(@PathVariable("id") int id, Model model)
	    {
	    	Book b = service.getBookById(id);
	    	model.addAttribute("book", b);
	    	return "bookEdit";
	    }
	    
	  //deleteAvailableBook
		@GetMapping("/deleteAvailableBook/{id}")
		public String deleteAvailableBook(@PathVariable("id") int id)
		{
		    service.deleteById(id);
			return "redirect:/available_books";
		}
	    
	    
		/*
		 * @GetMapping("/my_books") public ModelAndView getAllBooksrecord() {
		 * List<MyBoolList> list =mybservice.getAllbook(); // ModelAndView m=new
		 * ModelAndView(); // m.setViewName("AllBook"); return new
		 * ModelAndView("AllBook","book",list); }
		 */
		
	
}
