package com.fediroryshchuk.homework7.threads.synchronize.phaser;

import java.util.concurrent.Phaser;

public class Main {
    public static void main(String args[]) {
        Phaser phas = new Phaser(1);
        int currentPhase;

        System.out.println("Start of theads: ");

        new TestPhaser(phas, "1");
        new TestPhaser(phas, "2");
        new TestPhaser(phas, "3");

        currentPhase = phas.getPhase();
        phas.arriveAndAwaitAdvance();
        System.out.println("Circle " + currentPhase + " is over.");

        currentPhase = phas.getPhase();
        phas.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase + " is over.");

        currentPhase = phas.getPhase();
        phas.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase + " is over.");

        phas.arriveAndDeregister();

        if (phas.isTerminated()) {
            System.out.println("Orders were completed.");
        }
    }
}
