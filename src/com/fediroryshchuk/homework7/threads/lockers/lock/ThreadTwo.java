package com.fediroryshchuk.homework7.threads.lockers.lock;

import java.util.concurrent.locks.Lock;

public class ThreadTwo extends Thread {
    private ListOfNumbers list;
    private Lock locker;

    public ThreadTwo(String name, Lock lock, ListOfNumbers list) {
        super.setName(name);
        this.locker = lock;
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println(super.getName() + ": start working");
        while (true) {
            if (locker.tryLock()) {
                System.out.println("The size of array is " + list.size());
                break;
            } else {
                System.out.println(super.getName() + ": waiting");
            }
        }
        System.out.println(super.getName() + ": stop working");
    }
}
