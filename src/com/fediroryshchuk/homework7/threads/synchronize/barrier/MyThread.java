package com.fediroryshchuk.homework7.threads.synchronize.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread implements Runnable {
    private CyclicBarrier barrier;
    private String name;

    MyThread(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
        new Thread(this).start();
    }
    @Override
    public void run() {
        System.out.println(name);

        try {
            barrier.await();
        } catch (BrokenBarrierException | InterruptedException e) {
            System.out.println(e);
        }
    }
}
