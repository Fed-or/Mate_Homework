package com.fediroryshchuk.homework2.innerclasses;

class LocalClass {

    void getValue() {

        int sum = 40;
        System.out.println("Method of outer class");


        class IntoMethod {
            private int divisor;
            private int remainder;

            public IntoMethod() {
                divisor = 5;
                remainder = sum%divisor;
            }

            public int getDivisor() {
                return divisor;
            }

            public int getRemainder() {
                return remainder;
            }

            public int getQuotient() {
                System.out.println("Method of inner class");
                return sum / divisor;
            }
        }

        IntoMethod into = new IntoMethod();
        System.out.println("Divisor = " + into.getDivisor());
        System.out.println("Remainder = " + into.getRemainder());
        System.out.println("Quotient = " + into.getQuotient());
    }
}