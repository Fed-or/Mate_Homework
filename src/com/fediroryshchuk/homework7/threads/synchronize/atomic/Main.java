package com.fediroryshchuk.homework7.threads.synchronize.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);
        new Thread(new AtomicExample(counter, "FirstThread")).start();
        new Thread(new AtomicExample(counter, "SecondThread")).start();
        new Thread(new AtomicExample(counter, "ThirdThread")).start();
        new Thread(new AtomicExample(counter, "FourthThread")).start();
    }
}
