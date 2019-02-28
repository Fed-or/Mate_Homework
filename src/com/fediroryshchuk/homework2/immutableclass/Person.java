package com.fediroryshchuk.homework2.immutableclass;

final public class Person {

    private final String firstName;
    private final String surName;
    private final int age;
    private final int practiceCoding;

    public Person(String firstName, String surName, int age, int practiceCoding) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.practiceCoding = practiceCoding;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getPracticeCoding() {
        return practiceCoding;
    }
}