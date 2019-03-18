package com.fediroryshchuk.homework7.singletonpattern;

import java.time.LocalDate;

public class President extends SeniorGovernmentOfficials {

    private static volatile President instance;

    private President() {
    }

    public static President getInstance() {
        President localInstance = instance;
        if (localInstance == null) {
            synchronized (President.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new President();
                }
            }
        }
        return localInstance;
    }
}
