package com.fediroryshchuk.hw5;

public class Main {
    public static void main(String[] args) {
        // write your code here
        MyMap<String, Integer> myHashMap = new MyHashMap();
        myHashMap.put("First", 1);
        myHashMap.put("Second", 2);
        myHashMap.clear();

        myHashMap.put("String1", 4);
        myHashMap.put("String2", 3);
        myHashMap.put("String3", 3);
        myHashMap.put("String4", 10);

        myHashMap.put("smth", 1);
        myHashMap.put("else smth", null);
        myHashMap.put(null, 123);
        System.out.println(myHashMap.toString());

        int remove = myHashMap.remove("smth");
        System.out.println(myHashMap.get("String4"));
        System.out.println(remove);
    }
}
