package com.fediroryshchuk.homework7.singletonpattern;

public class PrimeMinister extends SeniorGovernmentOfficials{
    private static volatile PrimeMinister instance;

    private PrimeMinister() {
    }

    public static PrimeMinister getInstance() {
        PrimeMinister localInstance = instance;
        if (localInstance == null) {
            synchronized (PrimeMinister.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new PrimeMinister();
                }
            }
        }
        return localInstance;
    }
}
