package com.example.libraryproject2.service.itf;

import com.example.libraryproject2.model.BookCard;

import java.util.List;

public interface IBookCardService {
    List<BookCard> findAll();

    List<BookCard> getBookCardsByCardId(Long cardId);

    void save(BookCard bookCard);
}
