package com.ck.demo.webapp.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ck.demo.webapp.book.domin.Book;
import com.ck.demo.webapp.user.domin.User;
import com.ck.demo.webapp.user.repository.UserRepository;
import com.ck.demo.webapp.user.service.UserService;

@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> findAll(User user) {
		return userRepository.findAll();
	}
	
	@Override
	public Optional<User> findById(Long userId) {
		return userRepository.findById(userId);
	}
	
	@Override
	public void save(List<User> users) {
		userRepository.saveAll(users);
	}
	
	@Override
	public void save(User user) {
		userRepository.save(user);
	}
	
	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}
	
	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public void delete(List<User> users) {
		userRepository.deleteAll(users);
	}

	@Override
	public Iterable<Book> findAllBookByUserID(Long userId) {
		return userRepository.findBooksByID(userId);
	}

	@Override
	public Optional<Book> findByIdAndBookId(Long userId, Long bookId) {
		return userRepository.findByBooksBookId(bookId);
	}

}
