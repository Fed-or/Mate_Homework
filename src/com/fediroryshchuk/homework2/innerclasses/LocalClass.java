package com.fediroryshchuk.homework2.innerclasses;

public class LocalClass {

    void outerMethod() {
        System.out.println("Method of outer class");
        class IntoMethod {
            public void innerMethod() {
                System.out.println("Method of inner class");
            }
        }
        IntoMethod into = new IntoMethod();
        into.innerMethod();
    }
}
