package com.fediroryshchuk.homework7.threads.synchronize.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String args[]) {
        CyclicBarrier cb = new CyclicBarrier(2, new CyclicBarrierSyn());
        System.out.println("Start threads: ");
        new MyThread(cb, "1");
        new MyThread(cb, "2");
        new MyThread(cb, "3");
        new MyThread(cb, "4");
    }
}
