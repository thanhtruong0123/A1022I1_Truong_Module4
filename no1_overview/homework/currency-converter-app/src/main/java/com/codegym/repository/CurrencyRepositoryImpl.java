package com.codegym.repository;

import com.codegym.model.Currency;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CurrencyRepositoryImpl implements CurrencyRepository {
    private List<Currency> currencies;

    public CurrencyRepositoryImpl() {
        currencies = new ArrayList<>();
        currencies.add(new Currency("USD", 1.0));
        currencies.add(new Currency("VND", 23000.0));
        currencies.add(new Currency("KOR", 1303.7));
        currencies.add(new Currency("YEN", 139.75));
        currencies.add(new Currency("YUAN", 7.13));
    }

    @Override
    public List<Currency> getAllCurrencies() {
        return currencies;
    }

    @Override
    public Currency getCurrencyByUnit(String unit) {
        return currencies.stream()
                .filter(currency -> currency.getUnit().equals(unit))
                .findFirst()
                .orElse(null);
    }
}
