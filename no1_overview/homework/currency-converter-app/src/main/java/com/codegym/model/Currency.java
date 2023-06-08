package com.codegym.model;

public class Currency {
    private String unit;
    private double exchangeRate;

    public Currency() {
    }

    public Currency(String unit, double exchangeRate) {
        this.unit = unit;
        this.exchangeRate = exchangeRate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
