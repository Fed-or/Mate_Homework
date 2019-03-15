package com.fediroryshchuk.homework6.flowers;

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
