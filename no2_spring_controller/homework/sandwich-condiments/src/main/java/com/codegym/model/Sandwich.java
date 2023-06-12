package com.codegym.model;

public class Sandwich {
    private int id;
    private String condiment;

    public Sandwich() {
    }

    public Sandwich(int id, String condiment) {
        this.id = id;
        this.condiment = condiment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCondiment() {
        return condiment;
    }

    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }
}
