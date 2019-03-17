package com.fediroryshchuk.homework7.threads.concuurents;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyWriteConcurrent {
    private static List<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        list.add("Book №1");
        list.add("Book №2");
        list.add("Book №3");
        list.add("Book №4");
        list.add("Book №5");

        new Thread(new Runnable() {
            @Override
            public void run() {
                Iterator<String> itrList = list.iterator();
                while (itrList.hasNext()) {
                    String str = itrList.next();
                    System.out.println("Thread One:" + str);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                list.add("Book №6");
                Iterator<String> itrList = list.iterator();
                while (itrList.hasNext()) {
                    String str = itrList.next();
                    System.out.println("Thread Two:" + str);
                }
            }
        }).start();
    }
}
