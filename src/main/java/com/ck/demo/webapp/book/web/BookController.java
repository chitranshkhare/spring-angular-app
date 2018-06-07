package com.ck.demo.webapp.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ck.demo.webapp.book.domin.Book;
import com.ck.demo.webapp.book.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private BookService bookService; 
	
	@GetMapping
	public Iterable<Book> get(@RequestParam Book book) {
		return bookService.findAll(book);
	}
	
	@GetMapping("/{id}")
	public Book get(@PathVariable("id") Long id) {
		return bookService.findById(id).orElse(new Book());
	}
	
	@PostMapping
	public void add(@RequestParam Book book) {
		
	}
	
	@PutMapping
	public void update(@RequestParam Book book) {
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		bookService.delete(id);
	}

}
