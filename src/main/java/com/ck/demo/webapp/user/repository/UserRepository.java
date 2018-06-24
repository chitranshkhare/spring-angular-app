package com.ck.demo.webapp.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.ck.demo.webapp.book.domin.Book;
import com.ck.demo.webapp.user.domin.User;

public interface UserRepository extends CrudRepository<User, Long> {

	Iterable<Book> findBooksById(Long userId);

	Iterable<User> findAllByNameContainingIgnoreCase(String name);

//	Optional<Book> findByBooksBookId(Long bookId);

}
