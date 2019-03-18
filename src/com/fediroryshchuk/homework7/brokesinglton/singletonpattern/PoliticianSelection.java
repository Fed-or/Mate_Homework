package com.fediroryshchuk.homework7.brokesinglton.singletonpattern;

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

    public static void callPolitician() throws IOException {


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String s = null;
            s = reader.readLine();

            switch (s) {
                case SeniorGovernmentOfficials.PRESIDENT:
                    senior = President.getInstance();
                    System.out.println("He is president");
                    break;
                case SeniorGovernmentOfficials.PRIME_MINISTER:
                    senior = PrimeMinister.getInstance();
                    System.out.println("He is prime-minister");
                    break;
                case SeniorGovernmentOfficials.SPEAKER:
                    senior = Speaker.getInstance();
                    System.out.println("He is speaker");
                    break;
                default:
                    System.out.println("Unknown person. Try again...");
            }

        }
    }
}
