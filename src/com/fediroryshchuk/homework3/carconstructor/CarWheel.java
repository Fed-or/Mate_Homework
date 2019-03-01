package com.fediroryshchuk.homework3.carconstructor;

public class CarWheel {

    private double tyreIntegrity;

    public CarWheel() {
        tyreIntegrity = 1;
    }

    public CarWheel(double stateWheels) {
        if (stateWheels > 0 && stateWheels <= 1) {
            this.tyreIntegrity = stateWheels;
        }
    }

    public void changeTyre() {
        if (tyreIntegrity > 0 && tyreIntegrity < 0.7) {
            tyreIntegrity = 1;
        }
    }

    public void toWearTyre(int year) {
        int speed;

        for (speed = 0; speed < new Car(year).getMaxSpeed(); speed += 10) {
            tyreIntegrity -= 0.005;
        }
    }

    public double stateTyre() {
        return tyreIntegrity;
    }

    public void printStateType() {
        System.out.println("Integrity of Tyre is: " + tyreIntegrity);
    }
}