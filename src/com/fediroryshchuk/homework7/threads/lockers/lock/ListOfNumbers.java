package com.fediroryshchuk.homework7.threads.lockers.lock;

import java.util.Random;

public class ListOfNumbers {
    Random rnd = new Random();
    private int[] array;

    public ListOfNumbers(int size) {
        array = new int[size];
    }

    public void writeNumber() {
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
    }

    public int size() {
        return array.length;
    }
}