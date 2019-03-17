package com.fediroryshchuk.homework7.threads.synchronize.phaser;

import java.util.concurrent.Phaser;

public class Main {
    public static void main(String args[]) {
        Phaser phaser = new Phaser(1);
        int currentPhase;

        System.out.println("Start of theads: ");

        new TestPhaser(phaser, "1");
        new TestPhaser(phaser, "2");
        new TestPhaser(phaser, "3");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Circle " + currentPhase + " is over.");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase + " is over.");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase + " is over.");

        phaser.arriveAndDeregister();

        if (phaser.isTerminated()) {
            System.out.println("Orders were completed.");
        }
    }
}
