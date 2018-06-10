package com.ck.demo.webapp.user.service;

import java.util.List;
import java.util.Optional;

import com.ck.demo.webapp.book.domin.Book;
import com.ck.demo.webapp.user.domin.User;

public interface UserService {

	Optional<User> findById(Long userId);

	void save(List<User> users);

	void save(User user);

	void delete(User user);
	
	void delete(Long id);

	Iterable<User> findAll(User user);

	Iterable<Book> findAllBookByUserId(Long userId);

	Optional<Book> findByIdAndBookId(Long userId, Long bookId);

}
