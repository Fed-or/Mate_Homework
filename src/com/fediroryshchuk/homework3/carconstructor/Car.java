package com.fediroryshchuk.homework3.carconstructor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Car {
    private final LocalDate prodactDate;
    private String engine;
    private int maxSpeed;
    private int timeAcceleration;
    private int passengerCapacity;
    private int passenger;
    private int currentSpeed;
    private ArrayList<CarWheel> wheels;
    private ArrayList<CarDoor> doors;

    public Car(LocalDate prodactDate) {
        this.prodactDate = prodactDate;
    }

    public Car(LocalDate prodactDate, String engine, int maxSpeed,
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
        if (passenger > 0) {
            passenger--;
        } else
            System.out.println("There are not passenger in the car");
    }

    public void getOffAllPass() {
        if (currentSpeed == 0) {
            passenger = 0;
        }
    }

    public LocalDate getProdactDate() {
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
        if (indexDoor < doors.size() && indexDoor >= 0) {
            return doors.get(indexDoor);
        } else
            System.out.println("Invalid number of doors");
        return null;
    }

    public CarWheel getWheel(int indexWheel) {
        if (indexWheel < wheels.size() && indexWheel >= 0) {
            return wheels.get(indexWheel);
        } else
            System.out.println("Invalid number of wheel");
        return null;
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

    public double getCurrentMaxSpeed() {
        ArrayList<Double> stateWheels = new ArrayList<>();
        double currentMaxSpeed = 0;

        for (CarWheel wheel : wheels) {
            stateWheels.add(wheel.stateTyre());
        }
        for (int i = 0; i < stateWheels.size(); i++) {
            double worseWheel = 0;
            if (worseWheel > stateWheels.get(i)) {
                worseWheel = stateWheels.get(i);
                currentMaxSpeed = maxSpeed * worseWheel;
            }
        }
        return currentMaxSpeed;
    }

    public String toString() {
        return "Car{" + prodactDate + "year." + "Engine: " + engine + ". Max speed: "
                + maxSpeed + ". For 100km per hour is " + timeAcceleration
                + " sec. Capacity: " + passengerCapacity + ". Now inside are: "
                + passenger + " passangers. Current speed: " + currentSpeed
                + ". Current max speed: " + getCurrentSpeed() + ". Car has "
                + wheels.size() + " wheels and " + doors.size() + " doors.";
    }

    public void printStatus() {
        System.out.println(this.toString());
    }
}
