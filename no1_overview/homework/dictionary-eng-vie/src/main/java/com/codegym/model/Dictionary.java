package com.codegym.model;

public class Dictionary {
    private String engWord;

    private String vieWord;

    public Dictionary() {
    }

    public Dictionary(String engWord, String vieWord) {
        this.engWord = engWord;
        this.vieWord = vieWord;
    }

    public String getEngWord() {
        return engWord;
    }

    public void setEngWord(String engWord) {
        this.engWord = engWord;
    }

    public String getVieWord() {
        return vieWord;
    }

    public void setVieWord(String vieWord) {
        this.vieWord = vieWord;
    }
}
