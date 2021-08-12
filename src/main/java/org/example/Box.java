package org.example;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public float getBoxWeight() {
        return fruits.size() == 0 ? 0 : fruits.size() * fruits.get(0).getWeight();
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return getBoxWeight() == otherBox.getBoxWeight();
    }

    public void replaceAllFruitsToAnotherBox(Box<T> box) {
        box.fruits.addAll(fruits);
        fruits.clear();
    }

    public void addFruit(T fruitToAdd) {
        fruits.add(fruitToAdd);
    }

}