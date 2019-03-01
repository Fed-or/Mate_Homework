package com.fediroryshchuk.homework3.carconstructor;

import java.util.ArrayList;

public class Car {
    private final int prodactDate;
    private String engine;
    private int maxSpeed;
    private int timeAcceleration;
    private int passengerCapacity;
    private int passenger;
    private int currentSpeed;
    private ArrayList<CarWheel> wheels;
    private ArrayList<CarDoor> doors;

    public Car(int prodactDate) {
        this.prodactDate = prodactDate;
    }

    public Car(int prodactDate, String engine, int maxSpeed,
               int timeAcceleration, int passengerCapacity,
               int passenger, int currentSpeed) {
        this.prodactDate = prodactDate;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.timeAcceleration = timeAcceleration;
        this.passengerCapacity = passengerCapacity;
        this.passenger = passenger;
        this.currentSpeed = currentSpeed;
        wheels = new ArrayList<>();
        doors = new ArrayList<>();

    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void getPass() {
        if (passenger < passengerCapacity) {
            passenger++;
        }
    }

    public void getOffPass() {
        if (passenger > 1) {
            passenger--;
        }
    }

    public void getOffAllPass() {
        if (currentSpeed == 0) {
            passenger = 0;
        }
    }

    public int getProdactDate() {
        return prodactDate;
    }

    public String getEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getTimeAcceleration() {
        return timeAcceleration;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public CarDoor getDoor(int indexDoor) {
        return doors.get(indexDoor);
    }

    public CarWheel getWheel(int indexWheel) {
        return wheels.get(indexWheel);
    }

    public void removeAllWheels() {
        if (currentSpeed == 0) {
            wheels.clear();
        }
    }

    public void setWheels(int newWheels) {
        for (int i = 0; i < newWheels; i++)
            wheels.add(new CarWheel());

    }

    public double getPossibilityMaxSpeed() {
/*        if (passenger > 0) {


        // тут мне надо еще пару часов подумать
*/
        return passenger;
    }


        public void printCarState () {
            System.out.println("Year: " + prodactDate + ".");

            System.out.println("Engine: " + engine + ".");
            System.out.println("Max speed:  " + maxSpeed + ".");
            System.out.println("For 100km per hour is " + timeAcceleration + " sec.");
            System.out.println("Capacity: " + passengerCapacity + ". ");
            System.out.println("Now inside are: " + passenger + " passangers.");
            System.out.println("Current speed: " + currentSpeed + ".");
            System.out.println("Current max speed: " + getPossibilityMaxSpeed());
            System.out.println("Car has " + wheels.size() + " wheels and " + doors.size() + " doors.");
            System.out.println();
        }
    }
