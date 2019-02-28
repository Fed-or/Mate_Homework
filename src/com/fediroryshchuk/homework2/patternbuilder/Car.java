package com.fediroryshchuk.homework2.patternbuilder;

public class Car {
    private final String name;
    private final String model;
    private final String color;
    private final String engine;
    private final int seats;
    private final int maxSpeed;

    private Car(CarBuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.maxSpeed = builder.maxSpeed;
        this.model = builder.model;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car: " + this.name + " " + this.model + ", " + this.engine + ", " + this.seats + " seats, max speed " + this.maxSpeed + "kph";
    }

    public static class CarBuilder {
        private final String name;
        private final String model;
        private String color = null;
        private String engine = null;
        private int seats = 0;
        private int maxSpeed = 0;

        public CarBuilder(String name, String model) {
            this.name = name;
            this.model = model;
        }

        public CarBuilder carColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder carEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder carSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder carMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
