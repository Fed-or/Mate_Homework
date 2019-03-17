package com.fediroryshchuk.homework7.threads.synchronize.semaphor;

import java.util.concurrent.Semaphore;

public class ReduceCounter implements Runnable {
    String name;
    Semaphore smph;

    ReduceCounter(Semaphore mph, String name) {
        this.smph = smph;
        this.name = name;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Start thread " + name);
        try {
            System.out.println("Thread " + name + " are waiting permission");
            smph.acquire();
            System.out.println("Thread " + name + " are getting permission");

            for (int i = 0; i < 5; i++) {
                Count.counter--;
                System.out.println(name + ": " + Count.counter);

                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println("Thread " + name + " frees up permission");
        smph.release();
    }
}