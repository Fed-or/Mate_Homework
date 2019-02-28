package com.fediroryshchuk.homework2.immutableclass;

public class ImmutableClass {

    public static void main(String[] args) {
        Person person = new Person("Петро", "Порошенко", 55, 1);

        String firstname = person.getFirstName();
        String surname = person.getSurName();
        int age = person.getAge();
        int practiceCoding = person.getPracticeCoding();

        firstname = "Дональд";
        surname = "Трамп";
        age = 69;
        practiceCoding = 3;

        System.out.println("We calling person " + person.getFirstName() + person.getSurName());
    }

    static final class Person {
        private String firstName;
        private String surName;
        private int age;
        private int practiceCoding;

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
}