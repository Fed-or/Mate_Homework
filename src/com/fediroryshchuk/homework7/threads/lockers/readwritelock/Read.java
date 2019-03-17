package com.fediroryshchuk.homework7.threads.lockers.readwritelock;

import java.util.concurrent.locks.Lock;

public class Read extends Thread {
    private Operation operation;
    private Lock readLock;
    private static final int MAX_RESULT = 5000;

    public Read(String name, Operation operation, Lock readLock) {
        super.setName(name);
        this.readLock = readLock;
        this.operation = operation;
    }

    @Override
    public void run() {
        System.out.println(super.getName() + ": start working");
        while (operation.get() < MAX_RESULT) {
            readLock.lock();
            try {
                System.out.println("We use the number: " + operation.get());
                System.out.println(operation.square(operation.get()));
                System.out.println(operation.cube(operation.get()));
            }
            finally {
                readLock.unlock();
            }
        }
        System.out.println(super.getName() + ": finished working");
    }
}
