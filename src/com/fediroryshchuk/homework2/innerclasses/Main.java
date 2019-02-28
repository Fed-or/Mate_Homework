package com.fediroryshchuk.homework2.innerclasses;

public class Main {
    public static void main(String[] args) {
        InnerStaticClass.Into nestedObject = new InnerStaticClass.Into();
        nestedObject.display();

        NestedClass.Into inner = new NestedClass().new Into();
        inner.demonstration();


    }
}

