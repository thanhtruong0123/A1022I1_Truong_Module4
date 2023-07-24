package com.example.libraryborrowingproject.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String classRoom;

    @OneToMany(mappedBy = "student")
    private Set<LoanCard> loanCardSet;

    public Student() {
    }

    public Student(Long id, String name, String classRoom, Set<LoanCard> loanCardSet) {
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
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

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public Set<LoanCard> getLoanCardSet() {
        return loanCardSet;
    }

    public void setLoanCardSet(Set<LoanCard> loanCardSet) {
        this.loanCardSet = loanCardSet;
    }
}
