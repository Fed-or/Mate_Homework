package com.fediroryshchuk.homework2.innerclasses;

public class AnonymousClass {   // i did`not understand, how works this class, need declare
    static ParentClass anonymous = new ParentClass() {
        @Override
        public void show() {
            super.show();
            System.out.println("Method of inner anonymous class");
        }
    };

    public static void main(String[] args) {
        anonymous.show();
    }
}

class ParentClass {
    public void show() {
        System.out.println("Method of superclass");
    }
}