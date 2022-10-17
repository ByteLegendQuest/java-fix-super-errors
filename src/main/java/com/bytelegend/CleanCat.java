package com.bytelegend;

import java.util.stream.Collectors;
import java.util.List;

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
        super.eat(foods.stream().filter(Food::isClean).collect(Collectors.toList()));
    }
}
