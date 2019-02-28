package com.fediroryshchuk.homework2.innerclasses;

public class NestedStaticClass {

    static int outerStatic = 10;

    private int outerNonStatic = 20;

    private static int outerPrivate = 30;

    public int getOuterNonStatic() {
        return outerNonStatic;
    }

    private static class Into {
        void display() {
            System.out.println("outerX = " + outerStatic);

            System.out.println("outerPrivate = " + outerPrivate);
            System.out.println("outerPrivate = " + new NestedStaticClass().getOuterNonStatic());
        }
    }
}