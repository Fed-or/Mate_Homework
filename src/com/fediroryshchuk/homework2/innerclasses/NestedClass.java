package com.fediroryshchuk.homework2.innerclasses;

public class NestedClass {

    private String privateVariable = "private";

    public class Into {
        public void demonstration() {
            System.out.println(privateVariable);
        }
    }
}

