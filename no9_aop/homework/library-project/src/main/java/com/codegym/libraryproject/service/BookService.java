package com.codegym.libraryproject.service;

import com.codegym.libraryproject.model.Book;
import com.codegym.libraryproject.repository.IBookRepository;
import com.codegym.libraryproject.service.itf.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;
    @Override
    public List<Book> showList() {
        return bookRepository.findAll();
    }
}
