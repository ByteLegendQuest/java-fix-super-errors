package com.bytelegend;

import java.util.List;
import java.util.stream.Collectors;

/** `CleanCat` inherits from `Cat` class, but it only eats clean food (`food.isClean()`). */
public class CleanCat extends Cat {
    public CleanCat(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food.isClean()) {
            super.eat(food);
        }
    }

    @Override
    public void eat(List<Food> foods) {
        List<Food> cleanFoods = foods.stream()
                .filter(Food::isClean)
                .collect(Collectors.toList());

        super.eat(cleanFoods);
    }
}
