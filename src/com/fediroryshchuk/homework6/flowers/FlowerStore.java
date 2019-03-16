package com.fediroryshchuk.homework6.flowers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlowerStore {

    private int purse;

    public int getPurse() {
        return purse;
    }

    public List<Flower> sell(int numberOfRose, int numberOfChamomile, int numberOfTulip) {
        List<Flower> flowers = new ArrayList<>();
        flowers.addAll(Stream.generate(() -> new Rose(100))
                .limit(numberOfRose)
                .collect(Collectors.toList()));

        flowers.addAll(Stream.generate(() -> new Chamomile(70))
                .limit(numberOfChamomile)
                .collect(Collectors.toList()));
        flowers.addAll(Stream.generate(() -> new Tulip(45))
                .limit(numberOfTulip)
                .collect(Collectors.toList()));
        return flowers;
    }

    public List<Flower> sellSequence(int numberOfRose, int numberOfChamomile, int numberOfTulip) {
        int sizeBouquet = numberOfRose + numberOfChamomile + numberOfTulip;
        List<Flower> flowers = new ArrayList<>();
        int index = 0;
        purse = 0;

        while (index < sizeBouquet) { // а чи можна це якось рекурсією оптимизувати??!
            if (numberOfRose > 0) {
                flowers.add(index++, new Rose(100));
                numberOfRose--;
            }
            if (numberOfChamomile > 0) {
                flowers.add(index++, new Chamomile(70));
                numberOfChamomile--;
            }

            if (numberOfTulip > 0) {
                flowers.add(index++, new Tulip(45));
                numberOfTulip--;
            }
        }
        putMoneyIntoPurse(costOfBouquet(flowers));

        return flowers;
    }

    private int costOfBouquet(List<Flower> bouquet) {
        return bouquet.stream().mapToInt(Flower::getCost).sum();
    }

    private void putMoneyIntoPurse(int cost) {
        this.purse += cost;
    }
}
