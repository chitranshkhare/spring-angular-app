package com.ck.demo.webapp.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ck.demo.webapp.book.domin.Book;
import com.ck.demo.webapp.book.service.BookService;
import com.ck.demo.webapp.user.domin.User;
import com.ck.demo.webapp.user.service.UserService;

@RestController
@RequestMapping("/users/{userId}/book")
public class UserBookController {
	
	@Autowired
	private UserService userService; 
	
//	@Autowired
//	private BookService bookService;
	
	@GetMapping
	public Iterable<Book> get(@PathVariable("userId") Long userId) {
		return userService.findAllBookByUserID(userId);
	}
	
	@GetMapping("/{bookId}")
	public Book get(@PathVariable("userId") Long userId, @PathVariable("bookId") Long bookId) {
		return userService.findByIdAndBookId(userId, bookId).orElse(new Book ());
	}
	
	@PostMapping
	public void add(@RequestParam User user) {
		
	}
	
	@PutMapping
	public void update(@RequestParam User user) {
		
	}
	
	/*@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		userService.delete(id);
	}*/

}
