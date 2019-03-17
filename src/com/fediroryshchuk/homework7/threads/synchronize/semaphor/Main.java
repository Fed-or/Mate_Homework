package com.fediroryshchuk.homework7.threads.synchronize.semaphor;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String args[]) {
        Semaphore smph = new Semaphore(1);

        new IncrementCounter(smph, "A");
        new ReduceCounter(smph, "B");
    }
}
