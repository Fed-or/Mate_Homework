package com.fediroryshchuk.homework2.innerclasses;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Nested static class: ");

        NestedStaticClass.Into nestedObject = new NestedStaticClass.Into();
        nestedObject.display();

        System.out.println();
        System.out.println("Nested non-static class: ");

        InnerNonStaticClass.Into inner = new InnerNonStaticClass().new Into();
        inner.demonstration();

        System.out.println();
        System.out.println("Local class: ");

        LocalClass outer = new LocalClass();
        outer.getValue();
    }
}

