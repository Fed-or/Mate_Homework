package com.fediroryshchuk.homework3.carconstructor;

public class CarWheel {

    private double tyreIntegrity;
    private static final double GOOD_TYRE = 1;
    private static final double BAD_TYRE = 0;


    public CarWheel() {
        tyreIntegrity = GOOD_TYRE;
    }

    public CarWheel(double stateWheels) {
        if (stateWheels > BAD_TYRE && stateWheels <= GOOD_TYRE) {
            this.tyreIntegrity = stateWheels;
        }
    }

    public void changeTyre() {
        if (tyreIntegrity > 0 && tyreIntegrity < 0.5) {
            tyreIntegrity = GOOD_TYRE;
        }
    }

    public void toWipeTyre(double wipe) {
        tyreIntegrity = ((tyreIntegrity - wipe/100) > 0) ? tyreIntegrity : 0;
    }

    public double stateTyre() {
        return tyreIntegrity;
    }

    public void printStateType() {
        System.out.println("Integrity of Tyre is: " + tyreIntegrity);
    }
}
