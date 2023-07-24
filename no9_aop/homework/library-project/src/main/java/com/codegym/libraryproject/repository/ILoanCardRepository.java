package com.codegym.libraryproject.repository;

import com.codegym.libraryproject.model.LoanCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILoanCardRepository extends JpaRepository<LoanCard, Long> {
}
