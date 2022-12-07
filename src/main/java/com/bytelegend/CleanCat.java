package com.bytelegend;

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
    public void eat(List<Food> foodList) {
        for (Food food:foodList) {
            if (food.isClean()) {
                super.eat(food);
            }
        }
    }
}
