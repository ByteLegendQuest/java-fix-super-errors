package com.bytelegend;

import java.util.ArrayList;
import java.util.List;

/**
 * `Cat` has a `eat(List<Food> foods)` method and a `eat(Food food)` method, which can simulate
 * eating food.
 */
public class Cat {
    private final String name;
    private final List<Food> eatenFoods = new ArrayList<>();

    public Cat(String name) {
        this.name = name;
    }

    public void eat(List<Food> foods) {
        eatenFoods.addAll(foods);
    }

    public void eat(Food food) {
        eatenFoods.add(food);
    }

    @Override
    public String toString() {
        return name + " has eaten " + eatenFoods;
    }
}
