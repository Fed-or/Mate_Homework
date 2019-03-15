package com.fediroryshchuk.homework6.flowers;

import java.util.ArrayList;

public class Chamomile extends Flower {

    public Chamomile(int cost) {
        super(cost);
    }

    @Override
    public String toString() {
        return "Chamomile{" +
                "cost=" +
                getCost() +
                "}";
    }
}

