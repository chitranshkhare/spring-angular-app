package com.ck.demo.webapp.book.repository;

import org.springframework.data.repository.CrudRepository;

import com.ck.demo.webapp.book.domin.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
