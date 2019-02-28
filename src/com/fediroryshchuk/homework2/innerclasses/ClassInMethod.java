package com.fediroryshchuk.homework2.innerclasses;

public class ClassInMethod {

    void outerMethod() {
        System.out.println("Method of outer class");
        class Inner {
            public void innerMethod() {
                System.out.println("Method of inner class");
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
