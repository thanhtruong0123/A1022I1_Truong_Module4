package com.example.libraryproject2.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String classRoom;

    @OneToMany(mappedBy = "student")
    private List<Card> cardList;

    public Student() {
    }

    public Student(Long id, String name, String classRoom, List<Card> cardList) {
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.cardList = cardList;
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

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
}
