package com.fediroryshchuk.homework7.singletonpattern;

public class Speaker extends SeniorGovernmentOfficials{
    private static Speaker instance;

    private Speaker() {

    }

    public static synchronized Speaker getInstance() {
        if (instance == null) {
            instance = new Speaker();
        }
        return instance;
    }
}
