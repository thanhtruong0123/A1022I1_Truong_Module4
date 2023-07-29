package com.example.libraryproject2.repository;

import com.example.libraryproject2.model.BookCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface IBookCardRepository extends JpaRepository<BookCard, Long> {
    @Query(value = "SELECT * FROM book_card WHERE card_card_id = :cardId", nativeQuery = true)
    List<BookCard> getBookCardsByCardId(@Param("cardId") Long id);
}
