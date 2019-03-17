package com.fediroryshchuk.homework7.threads.lockers.readwritelock;

import java.util.concurrent.locks.Lock;

public class Write extends Thread {
    private Operation operation;
    private Lock writeLock;
    private static final int MAX_RESULT = 5000;

    public Write(String name, Operation operation, Lock writeLock) {
        super.setName(name);
        this.writeLock = writeLock;
        this.operation = operation;
    }

    @Override
    public void run() {
        System.out.println(super.getName() + ": start working");
        while (operation.get() < MAX_RESULT) {
            writeLock.lock();
            try {
                operation.increment();
            } finally {
                writeLock.unlock();
            }
            System.out.println(super.getName() + ": finished working");
        }
    }
}
