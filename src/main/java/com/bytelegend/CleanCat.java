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

    public void eat(List<Food> foodList) {
        List<Food> foods = foodList.stream().filter(Food::isClean).collect(Collectors.toList());
        super.eat(foods);
    }
}
