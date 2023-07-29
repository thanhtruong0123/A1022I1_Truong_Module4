package com.example.libraryproject2.service.itf;

import com.example.libraryproject2.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    List<Book> findAllById(List<Long> listId);

    Book getBookById(Long id);

    Book getBookByName(String name);

    void decreaseBook(Long id);

    void increaseBook(Long id);
}
