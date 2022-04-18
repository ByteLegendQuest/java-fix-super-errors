package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CleanCatTest {
    @Test
    public void testSingle() {
        CleanCat cleanCat = new CleanCat("Tom");
        Food food = new Food("Milk", true);
        cleanCat.eat(food);
        Assertions.assertEquals(
                "Tom has eaten "
                        + Stream.of(food).filter(Food::isClean).collect(Collectors.toList()),
                cleanCat.toString());
    }

    @Test
    public void testMany() {
        CleanCat cleanCat = new CleanCat("Tom");
        List<Food> foods =
                IntStream.range(0, 10)
                        .mapToObj(
                                i -> {
                                    boolean clean = new Random().nextBoolean();
                                    return new Food("Food" + i, clean);
                                })
                        .collect(Collectors.toList());
        cleanCat.eat(foods);

        Assertions.assertEquals(
                "Tom has eaten "
                        + foods.stream().filter(Food::isClean).collect(Collectors.toList()),
                cleanCat.toString());
    }
}
