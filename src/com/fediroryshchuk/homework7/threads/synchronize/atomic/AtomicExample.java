package com.fediroryshchuk.homework7.threads.synchronize.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample extends Thread {
    private AtomicInteger counter;

    public AtomicExample(AtomicInteger counter, String name) {
        super.setName(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Value - " + counter.getAndIncrement() + " for " + super.getName());
    }
}
