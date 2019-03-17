package com.fediroryshchuk.homework7.singletonpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoliticianSelection {
    public static SeniorGovernmentOfficials senior;

    static {
        try {
            callPolitician();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void callPolitician() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (s.equals(SeniorGovernmentOfficials.PRESIDENT)) {
            senior = President.getInstance();
        } else if (s.equals(SeniorGovernmentOfficials.PRIME_MINISTER)) {
            senior = PrimeMinister.getInstance();
        } else if (s.equals(SeniorGovernmentOfficials.SPEAKER)) {
            senior = Speaker.getInstance();
        }
    }
}
