package com.bytelegend;

import java.util.List;

/**
 * `CleanCat` inherits from `Cat` class, but it only eats clean food (`food.isClean()`).
 */
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
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).isClean()) {
                eat(foods.get(i));
            }
        }
    }
}
