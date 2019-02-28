package com.fediroryshchuk.homework2.sorting;

public class Main {

    public static void main(String[] args) {
        SortUtils sort = new SortUtils();

        sort.fillingUnSortArray(sort.getArray());

        SortUtils.bubbleSort(sort.getArray());
        SortUtils.shellSort(sort.getArray());
        SortUtils.insertSort(sort.getArray());
        SortUtils.selectSort(sort.getArray());
    }
}
