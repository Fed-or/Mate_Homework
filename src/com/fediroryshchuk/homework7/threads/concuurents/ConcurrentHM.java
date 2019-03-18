package com.fediroryshchuk.homework7.threads.concuurents;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHM {
    private final static ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ConcurrentHM ob = new ConcurrentHM();
        new Thread(new FirstThread()).start();
        new Thread(new SecondThread()).start();
        new Thread(new ReadThread()).start();
    }

    static class FirstThread implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                hashMap.put(i, "A");
            }
        }
    }

    static class SecondThread implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                hashMap.put(i, "B");
            }
        }
    }

    static class ReadThread implements Runnable {
        @Override
        public void run() {
            Iterator<Integer> ite = hashMap.keySet().iterator();
            while (ite.hasNext()) {
                Integer key = ite.next();
                System.out.println(key + ") - " + hashMap.get(key));
            }
        }
    }
}
