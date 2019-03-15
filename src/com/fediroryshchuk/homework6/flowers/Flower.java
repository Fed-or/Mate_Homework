package com.fediroryshchuk.homework6.flowers;

public abstract class Flower {

    private int cost;

    public Flower(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "cost =" +
                getCost() +
                "}";
    }
}
