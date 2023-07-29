package com.example.libraryborrowingproject.service.itf;

import com.example.libraryborrowingproject.model.LoanCard;

import java.util.List;

public interface ILoanCardService {
    List<LoanCard> getLoanCardList();

    LoanCard getLoanCardById(Long id);

    void save(LoanCard loanCard);
}
