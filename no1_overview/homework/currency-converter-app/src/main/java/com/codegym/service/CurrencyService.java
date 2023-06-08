package com.codegym.service;

import com.codegym.model.Currency;

import java.util.List;

public interface CurrencyService {
    List<Currency> getAllCurrencies();
    double convertedCurrency(double amount, String fromCurrencyUnit, String toCurrencyUnit);
}
