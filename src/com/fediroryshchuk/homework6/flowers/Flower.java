package com.fediroryshchuk.homework6.flowers;

import java.util.ArrayList;

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
