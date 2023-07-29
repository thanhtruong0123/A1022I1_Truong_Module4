package com.example.libraryproject2.service;

import com.example.libraryproject2.model.Book;
import com.example.libraryproject2.model.BookCard;
import com.example.libraryproject2.model.Card;
import com.example.libraryproject2.repository.IBookCardRepository;
import com.example.libraryproject2.service.itf.IBookCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCardService implements IBookCardService {
    @Autowired
    private IBookCardRepository bookCardRepository;

    @Override
    public List<BookCard> findAll() {
        return bookCardRepository.findAll();
    }

    @Override
    public List<BookCard> getBookCardsByCardId(Long cardId) {
        return bookCardRepository.getBookCardsByCardId(cardId);
    }

    @Override
    public void save(BookCard bookCard) {
        bookCardRepository.save(bookCard);
    }
}
