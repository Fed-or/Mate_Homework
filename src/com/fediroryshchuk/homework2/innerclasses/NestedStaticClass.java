package com.fediroryshchuk.homework2.innerclasses;

public class NestedStaticClass {

    static int outer_static = 10;

    private int outer_non_static = 20;

    private static int outer_private = 30;

    public int getOuter_non_static() {
        return outer_non_static;
    }

    protected static class Into {
        void display() {
            System.out.println("outer_x = " + outer_static);

            System.out.println("outer_private = " + outer_private);
            System.out.println("outer_private = " + new NestedStaticClass().getOuter_non_static());
        }
    }
}


