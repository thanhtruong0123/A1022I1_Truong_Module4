package com.example.libraryborrowingproject.repository;

import com.example.libraryborrowingproject.model.LoanCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoanCardRepository extends JpaRepository<LoanCard, Long> {
}
