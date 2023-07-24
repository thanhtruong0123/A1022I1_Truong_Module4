package com.example.libraryborrowingproject.service;

import com.example.libraryborrowingproject.model.Book;
import com.example.libraryborrowingproject.repository.IBookRepository;
import com.example.libraryborrowingproject.service.itf.IBookService;
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
