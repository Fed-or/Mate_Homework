package com.fediroryshchuk.homework2.sorting;

import java.util.Arrays;
import java.util.Random;

public class SortUtils {

    private static int LENGTH_ARRAY = 100;
    private static int[] unSortArray = new int[LENGTH_ARRAY];

    public int[] getArray() {
        return unSortArray;
    }

    public void fillingUnSortArray(int[] unSortArray) {

        Random rnd = new Random();

        for (int i = 0; i < LENGTH_ARRAY; i++) {
            unSortArray[i] = rnd.nextInt(99);
        }
    }

    public static int[] bubbleSort(int[] array) {

        for (int i = LENGTH_ARRAY - 1; i >= 1; i--) {
            for (int y = 0; y < i; y++) {
                if (array[y] > (array[y + 1])) {
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] insertSort(int[] array) {
        int key;
        for (int i = 1; i < LENGTH_ARRAY; i++) {
            key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }


    public static int[] shellSort(int[] array) {
        int x = LENGTH_ARRAY / 2;
        while (x > 0) {
            int j = 0;
            for (int i = x; i < LENGTH_ARRAY; i++) {
                int buf = array[i];
                for (j = i; j >= x && array[j - x] > buf; j -= x) {
                    array[j] = array[j - x];
                }
                array[j] = buf;
            }
            x = x / 2;
        }
        return array;
    }


    public static int[] selectSort(int[] array) {

        int temp;

        for (int i = 0; i < LENGTH_ARRAY - 1; i++) {
            int min = i;
            for (int next = i + 1; next < LENGTH_ARRAY; next++) {
                if (array[next] < array[min]) {
                    min = next;
                }
            }

            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }
}