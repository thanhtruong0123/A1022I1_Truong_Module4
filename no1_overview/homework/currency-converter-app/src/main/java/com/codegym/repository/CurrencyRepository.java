package com.codegym.repository;

import com.codegym.model.Currency;
import java.util.List;

public interface CurrencyRepository {
   List<Currency> getAllCurrencies();
   Currency getCurrencyByUnit(String unit);
}
