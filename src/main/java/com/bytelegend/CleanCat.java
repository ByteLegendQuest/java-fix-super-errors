package com.bytelegend;

/** `CleanCat` inherits from `Cat` class, but it only eats clean food (`food.isClean()`). */
public class CleanCat extends Cat {
    public CleanCat(String name) {}

    @Override
    public void eat(Food food) {
        if (food.isClean()) {
            eat(food);
        }
    }
}
