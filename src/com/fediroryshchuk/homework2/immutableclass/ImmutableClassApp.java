package com.fediroryshchuk.homework2.immutableclass;

public class ImmutableClassApp {

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
}