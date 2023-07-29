package com.example.libraryborrowingproject.service;

import com.example.libraryborrowingproject.model.LoanCard;
import com.example.libraryborrowingproject.repository.ILoanCardRepository;
import com.example.libraryborrowingproject.service.itf.ILoanCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanCardService implements ILoanCardService {
    @Autowired
    private ILoanCardRepository loanCardRepository;

    @Override
    public List<LoanCard> getLoanCardList() {
        List<LoanCard> loanCardList = loanCardRepository.findAll();
        return loanCardList;
    }

    @Override
    public LoanCard getLoanCardById(Long id) {
        return loanCardRepository.findById(id).get();
    }

    @Override
    public void save(LoanCard loanCard) {
        loanCardRepository.save(loanCard);
    }
}
