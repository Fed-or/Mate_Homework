package com.fediroryshchuk.homework3.carconstructor;

public class CarDoor {
    private boolean doorClose;
    private boolean windowClose;

    public CarDoor() {
        doorClose = true;
        windowClose = true;
    }

    public CarDoor(boolean door, boolean window) {
        this.windowClose = window;
        this.doorClose = door;
    }

    public void openDoor() {
        this.doorClose = false;
    }

    public void closeDoor() {
        this.doorClose = true;
    }

    public void closeOpenDoor() {
        doorClose = (!doorClose);
    }

    public void openWindow() {
        this.windowClose = false;
    }

    public void closeWindow() {
        this.windowClose = true;
    }

    public void closeOpenWindow() {
        windowClose = (!windowClose);
    }

    @Override
    public String toString() {
        return "CarDoor{" +
                "DoorClose=" + doorClose +
                ", WindowClose=" + windowClose +
                '}';
    }
}
