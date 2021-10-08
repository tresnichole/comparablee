package com.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitDriver {

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 100);
        Fruit orange = new Fruit("Orange", 50);
        Fruit banana = new Fruit("Banana", 50);
        Fruit peach = new Fruit("peace", 200);
        Fruit tangerine = new Fruit("tangerine", 300);

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(apple);
        fruits.add(orange);
        fruits.add(banana);
        fruits.add(peach);
        fruits.add(tangerine);

        fruits.forEach(System.out::println);

        Collections.sort(fruits);

        fruits.forEach(System.out::println);


    }
}
