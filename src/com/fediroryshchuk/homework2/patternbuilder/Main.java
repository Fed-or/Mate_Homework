package com.fediroryshchuk.homework2.patternbuilder;

public class Main {

    public static void main(String[] args) {
        Car carOne = new Car.CarBuilder("Renault", "Fluence")
                .carColor("green")
                .carEngine("diesel")
                .carMaxSpeed(200)
                .carSeats(5)
                .build();
        System.out.println(carOne);
    }
}
