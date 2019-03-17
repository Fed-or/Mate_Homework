package com.fediroryshchuk.homework7.brokesinglton.singletonpattern;

public class Speaker extends SeniorGovernmentOfficials {
    private static volatile Speaker instance;

    public static Speaker getInstance() {
        Speaker localInstance = instance;
        if (localInstance == null) {
            synchronized (Speaker.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Speaker();
                }
            }
        }
        return localInstance;
    }
}
