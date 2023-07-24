package com.example.libraryborrowingproject.repository;

import com.example.libraryborrowingproject.model.LoanCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILoanCardRepository extends JpaRepository<LoanCard, Long> {
}
