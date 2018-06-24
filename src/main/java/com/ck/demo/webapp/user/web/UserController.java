package com.ck.demo.webapp.user.web;

import org.apache.commons.lang3.StringUtils;
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
	public Iterable<User> get(@RequestParam(required=false, name="user") User user, 
			@RequestParam(required=false, name="name") String name) {
		System.out.println(name);
		if (StringUtils.isBlank(name)) { 
			return userService.findAll(user);
		} else {
			return userService.findAllByName(name);
		}
	}
	
	@GetMapping("/{id}")
	public User get1(@PathVariable("id") Long id) {
		return userService.findById(id).orElse(new User());
	}
	
//	@GetMapping
//	public Iterable<User> get(@RequestParam(required=false) String name) {
//		return userService.findAllByName(name);
//	}
	
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
