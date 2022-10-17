package com.bytelegend;

import java.util.stream.Collectors;

/** `CleanCat` inherits from `Cat` class, but it only eats clean food (`food.isClean()`). */
public class CleanCat extends Cat {
    public CleanCat(String name) {}

    @Override
    public void eat(Food food) {
        if (food.isClean()) {
            eat(food);
        }
    }

    @Override
    public void eat(List<Food> foods) {
        eatenFoods.addAll(foods.stream().filter(f -> f.isClean()).collect(Collectors.toList()));
    }
}
