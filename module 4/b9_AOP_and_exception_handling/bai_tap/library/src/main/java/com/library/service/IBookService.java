package com.library.service;

import com.library.exception.NotAvailableException;
import com.library.exception.WrongCodeException;
import com.library.model.Book;
import com.library.model.Code;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    void save(Book book);

    Book findById(Integer id);

    void borrow(Book book, Integer usedCode);

    void delete(Integer id);

    Code getNextAvailableCode(Book book) throws NotAvailableException;

    void returnBook(Book book, Integer returnCode) throws NotAvailableException, WrongCodeException;

    boolean checkNoUsedCode(Book book);
}
