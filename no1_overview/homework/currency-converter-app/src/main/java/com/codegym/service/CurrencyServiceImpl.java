package com.codegym.service;

import com.codegym.model.Currency;
import com.codegym.repository.CurrencyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {
    private CurrencyRepository currencyRepository;

    public CurrencyServiceImpl(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    @Override
    public List<Currency> getAllCurrencies() {
        return currencyRepository.getAllCurrencies();
    }

    @Override
    public double convertedCurrency(double amount, String fromCurrencyUnit, String toCurrencyUnit) {
        Currency fromCurrency = currencyRepository.getCurrencyByUnit(fromCurrencyUnit);
        Currency toCurrency = currencyRepository.getCurrencyByUnit(toCurrencyUnit);

        double convertedAmount = amount * (toCurrency.getExchangeRate() / fromCurrency.getExchangeRate());

        return convertedAmount;
    }
}
