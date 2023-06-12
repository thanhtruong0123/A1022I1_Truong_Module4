package com.codegym.service;

import com.codegym.model.Sandwich;
import com.codegym.repository.SandwichRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichServiceImpl implements SandwichService {
    private SandwichRepository sandwichRepository;

    public SandwichServiceImpl(SandwichRepository sandwichRepository) {
        this.sandwichRepository = sandwichRepository;
    }

    @Override
    public List<Sandwich> getAllCondiments() {
        return sandwichRepository.getAllCondiments();
    }
}
