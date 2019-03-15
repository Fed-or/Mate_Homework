package com.fediroryshchuk.homework6.flowers;

import java.util.ArrayList;

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
