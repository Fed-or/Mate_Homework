package com.fediroryshchuk.homework7.threads.synchronize.semaphor;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String args[]) {
        Semaphore semaphore = new Semaphore(1);

        new IncrementCounter(semaphore, "A");
        new ReduceCounter(semaphore, "B");
    }
}
