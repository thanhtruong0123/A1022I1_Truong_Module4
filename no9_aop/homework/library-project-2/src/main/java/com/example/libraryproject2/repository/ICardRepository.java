package com.example.libraryproject2.repository;

import com.example.libraryproject2.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardRepository extends JpaRepository<Card, Long> {
    @Query(value = "SELECT MAX(card_id) FROM card", nativeQuery = true)
    Long findMaxId();
}
