package com.example.libraryproject2.service;

import com.example.libraryproject2.model.Book;
import com.example.libraryproject2.repository.IBookRepository;
import com.example.libraryproject2.service.itf.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findAllById(List<Long> listId) {
        return bookRepository.findAllById(listId);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book getBookByName(String name) {
        return bookRepository.getBookByName(name);
    }

    @Override
    public void decreaseBook(Long id) {
        Book existedBook = bookRepository.findById(id).get();

        if (existedBook != null) {
            existedBook.setQuantity(existedBook.getQuantity()-1);
            bookRepository.save(existedBook);
        }
    }

    @Override
    public void increaseBook(Long id) {
        Book existedBook = bookRepository.findById(id).get();

        if (existedBook != null) {
            existedBook.setQuantity(existedBook.getQuantity()+1);
            bookRepository.save(existedBook);
        }
    }
}
