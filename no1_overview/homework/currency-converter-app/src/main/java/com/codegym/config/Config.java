package com.codegym.config;
import com.codegym.repository.CurrencyRepository;
import com.codegym.repository.CurrencyRepositoryImpl;
import com.codegym.service.CurrencyService;
import com.codegym.service.CurrencyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.codegym")
public class Config {
    @Bean
    public CurrencyService currencyService() {
        return new CurrencyServiceImpl(currencyRepository());
    }

    private CurrencyRepository currencyRepository() {
        return new CurrencyRepositoryImpl();
    }
}
