package com.codegym.repository;

import com.codegym.model.Sandwich;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SandwichRepositoryImpl implements SandwichRepository {
    private List<Sandwich> sandwichList;

    public SandwichRepositoryImpl() {
        sandwichList = new ArrayList<>();
        sandwichList.add(new Sandwich(1, "Lettuce"));
        sandwichList.add(new Sandwich(2, "Tomato"));
        sandwichList.add(new Sandwich(3, "Mustard"));
        sandwichList.add(new Sandwich(4, "Sprouts"));
    }

    @Override
    public List<Sandwich> getAllCondiments() {
        return sandwichList;
    }
}
