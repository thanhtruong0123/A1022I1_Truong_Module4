package com.example.libraryproject2.service;

import com.example.libraryproject2.model.Card;
import com.example.libraryproject2.repository.ICardRepository;
import com.example.libraryproject2.service.itf.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService implements ICardService {
    @Autowired
    private ICardRepository cardRepository;

    @Override
    public List<Card> findAll() {
        List<Card> loanCardList = cardRepository.findAll();
        return loanCardList;
    }

    @Override
    public Card findById(Long id) {
        return cardRepository.findById(id).get();
    }

    @Override
    public Card getLoanCardById(Long id) {
        return cardRepository.findById(id).get();
    }

    @Override
    public void save(Card loanCard) {
        cardRepository.save(loanCard);
    }

    @Override
    public Long findMaxId() {
        return cardRepository.findMaxId();
    }
}
