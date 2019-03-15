package com.fediroryshchuk.homework6.flowers;

public class Tulip extends Flower {

    public Tulip(int cost) {
        super(cost);
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "cost=" +
                getCost() +
                "}";
    }
}
