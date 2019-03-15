package com.fediroryshchuk.homework6.flowers;

public class Rose extends Flower {

    public Rose(int cost) {
        super(cost);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "cost=" +
                getCost() +
                "}";
    }
}
