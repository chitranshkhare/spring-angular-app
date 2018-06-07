package com.ck.demo.webapp.book.service;

import java.util.List;
import java.util.Optional;

import com.ck.demo.webapp.book.domin.Book;

public interface BookService {
	
	Iterable<Book> findAll(Book book);
	
	Optional<Book> findById(Long id);

	void save(List<Book> books);

	void save(Book book);

	void delete(Book book);
	
	void delete(Long id);

}
