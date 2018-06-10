package com.ck.demo.webapp.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ck.demo.webapp.user.domin.User;
import com.ck.demo.webapp.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@GetMapping
	public Iterable<User> get(@RequestParam(required=false) User user) {
		return userService.findAll(user);
	}
	
	@GetMapping("/{id}")
	public User get(@PathVariable("id") Long id) {
		return userService.findById(id).orElse(new User());
	}
	
	@PostMapping
	public void add(@RequestParam User user) {
		
	}
	
	@PutMapping
	public void update(@RequestParam User user) {
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		userService.delete(id);
	}

}
