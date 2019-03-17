package com.fediroryshchuk.homework7.singletonpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoliticianSelection {
    static SeniorGovernmentOfficials senior;

    static {
        try {
            callPolitician();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void callPolitician() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();

            switch (s) {
                case "Порошенко":
                    senior = President.getInstance();
                    System.out.println("He is president");
                    break;
                case "Гройсман":
                    senior = PrimeMinister.getInstance();
                    System.out.println("He is prime-minister");
                    break;
                case "Парубий":
                    senior = Speaker.getInstance();
                    System.out.println("He is speaker");
                    break;
                default:
                    System.out.println("Unknown person. Try again...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
    }
}
