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
        if (doorClose) {
            doorClose = false;
        }
    }

    public void closeDoor() {
        if (!doorClose) {
            doorClose = true;
        }
    }

    public void closeOpenDoor() {
        if (!doorClose) {
            doorClose = true;
        } else
            doorClose = false;
    }

    public void openWindow() {
        if (windowClose) {
            windowClose = false;
        }
    }

    public void closeWindow() {
        if (!windowClose) {
            windowClose = true;
        }
    }

    public void closeOpenWindow() {
        if (!windowClose) {
            windowClose = true;
        } else
            windowClose = false;
    }

    public void printState() {
        System.out.println((windowClose) ? "Window is close" : "Window is open");
        System.out.println((doorClose) ? "Door is close" : "Door is open");
    }

}
