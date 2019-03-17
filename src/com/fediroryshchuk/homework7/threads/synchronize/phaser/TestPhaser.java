package com.fediroryshchuk.homework7.threads.synchronize.phaser;

import java.util.concurrent.Phaser;

public class TestPhaser implements Runnable {
    Phaser phas;
    String name;

    TestPhaser(Phaser phaser, String name) {
        this.phas = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " begins first circle");
        phas.arriveAndAwaitAdvance();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thead " + name + " begins second circle.");
        phas.arriveAndAwaitAdvance();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " begins third circle.");

        phas.arriveAndDeregister();
    }
}
