
package com.fediroryshchuk.homework6.flowers;

import java.util.List;

public class FlowerApp {

    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        System.out.println("Cash in store: " + store.getPurse());
        System.out.println();

        List<Flower> flowers = store.sell(4, 2, 3);
        for (Flower f : flowers) {
            System.out.print(f.toString() + ", ");
        }

        System.out.println();
        System.out.println("Cash in store: " + store.getPurse());// не розумію, чому тут нуль видає?
        System.out.println();

        List<Flower> flowers2 = store.sellSequence(6, 2, 1);
        for (Flower f : flowers2) {
            System.out.print(f.toString() + ", ");
        }
    }
}
