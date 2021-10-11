package com.book.service;

import com.book.domain.Book;

import java.util.Collection;

public interface BookService {
    Collection<Book> findall();
    Book findById(Long id);
    Book save(Book book);
    Book update(Book book);
    Book deleteById(Long id);
}
