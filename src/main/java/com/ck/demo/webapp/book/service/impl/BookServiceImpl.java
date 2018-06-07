package com.ck.demo.webapp.book.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ck.demo.webapp.book.domin.Book;
import com.ck.demo.webapp.book.repository.BookRepository;
import com.ck.demo.webapp.book.service.BookService;

public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Iterable<Book> findAll(Book book) {
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> findById(Long id) {
		return bookRepository.findById(id);
	}

	@Override
	public void save(List<Book> books) {
		bookRepository.saveAll(books);
	}

	@Override
	public void save(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void delete(Book book) {
		bookRepository.delete(book);
	}

	@Override
	public void delete(Long id) {
		bookRepository.deleteById(id);
		
	}

}
