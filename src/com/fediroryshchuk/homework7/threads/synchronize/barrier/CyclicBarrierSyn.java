package com.fediroryshchuk.homework7.threads.synchronize.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierSyn implements Runnable {

    @Override
    public void run() {
        System.out.println("There is barrier");
    }
}