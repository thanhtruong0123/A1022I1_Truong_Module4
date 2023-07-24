package com.example.libraryborrowingproject.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String author;
    private String description;
    private int quantity;

    @OneToMany(mappedBy = "book")
    private Set<LoanCard> loanCardSet;

    public Book() {
    }

    public Book(Long id, String name, String author, String description, int quantity, Set<LoanCard> loanCardSet) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.description = description;
        this.quantity = quantity;
        this.loanCardSet = loanCardSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<LoanCard> getLoanCardSet() {
        return loanCardSet;
    }

    public void setLoanCardSet(Set<LoanCard> loanCardSet) {
        this.loanCardSet = loanCardSet;
    }
}
