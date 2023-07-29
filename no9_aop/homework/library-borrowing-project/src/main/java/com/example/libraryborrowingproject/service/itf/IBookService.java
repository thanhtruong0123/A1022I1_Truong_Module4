package com.example.libraryborrowingproject.service.itf;

import com.example.libraryborrowingproject.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> showList();

    Book getBookById(Long id);

    Book getBookByName(String name);

    void decreaseBook(Long id);

    void increaseBook(Long id);
}
