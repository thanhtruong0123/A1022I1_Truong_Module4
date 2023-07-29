package com.example.libraryproject2.service.itf;

import com.example.libraryproject2.model.Card;

import java.util.List;

public interface ICardService {
    List<Card> findAll();

    Card findById(Long id);

    Card getLoanCardById(Long id);

    void save(Card loanCard);

    Long findMaxId();
}
