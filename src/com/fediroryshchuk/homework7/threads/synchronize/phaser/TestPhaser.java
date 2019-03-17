package com.fediroryshchuk.homework7.threads.synchronize.phaser;

import java.util.concurrent.Phaser;

public class TestPhaser implements Runnable {
    private Phaser phaser;
    private String name;

    TestPhaser(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " begins first phase");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " begins second phase.");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + name + " begins third phase.");
        phaser.arriveAndDeregister();
    }
}
