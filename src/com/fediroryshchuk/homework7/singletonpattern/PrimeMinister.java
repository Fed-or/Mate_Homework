package com.fediroryshchuk.homework7.singletonpattern;

public class PrimeMinister extends SeniorGovernmentOfficials{
    private static PrimeMinister instance;

    private PrimeMinister() {

    }

    public static synchronized PrimeMinister getInstance() {
        if (instance == null) {
            instance = new PrimeMinister();
        }
        return instance;
    }
}

