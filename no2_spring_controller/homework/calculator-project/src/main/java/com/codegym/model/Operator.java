package com.codegym.model;

public class Operator {
    private String addiction;
    private String subtraction;
    private String multiplication;
    private String division;

    public Operator() {
    }

    public Operator(String addiction, String subtraction, String multiplication, String division) {
        this.addiction = addiction;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
    }

    public String getAddiction() {
        return addiction;
    }

    public void setAddiction(String addiction) {
        this.addiction = addiction;
    }

    public String getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(String subtraction) {
        this.subtraction = subtraction;
    }

    public String getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(String multiplication) {
        this.multiplication = multiplication;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
