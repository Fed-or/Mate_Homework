package com.fediroryshchuk.homework7.threads.lockers;

import com.fediroryshchuk.homework7.threads.lockers.lock.ListOfNumbers;
import com.fediroryshchuk.homework7.threads.lockers.lock.ThreadOne;
import com.fediroryshchuk.homework7.threads.lockers.lock.ThreadTwo;
import com.fediroryshchuk.homework7.threads.lockers.readwritelock.Operation;
import com.fediroryshchuk.homework7.threads.lockers.readwritelock.Read;
import com.fediroryshchuk.homework7.threads.lockers.readwritelock.Write;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        //Lock
        Lock lock = new ReentrantLock();
        ListOfNumbers listOfNumbers = new ListOfNumbers(8000);
        new Thread(new ThreadOne("WriteThread", lock, listOfNumbers)).start();
        new Thread(new ThreadTwo("ReadThread", lock, listOfNumbers)).start();

        //ReadWriteLock
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock readLock = readWriteLock.readLock();
        Lock writeLock = readWriteLock.writeLock();
        Operation operation = new Operation(1);
        new Thread(new Write("WriteLock", operation, writeLock)).start();
        new Thread(new Read("ReadThread", operation, readLock)).start();
    }
}
