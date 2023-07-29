package com.example.libraryproject2.model;

import javax.persistence.*;

@Entity
public class BookCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(columnDefinition = "book_id", referencedColumnName = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(columnDefinition = "card_id", referencedColumnName = "card_id")
    private Card card;

    public BookCard() {
    }

    public BookCard(Long id, Book book, Card card) {
        this.id = id;
        this.book = book;
        this.card = card;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
