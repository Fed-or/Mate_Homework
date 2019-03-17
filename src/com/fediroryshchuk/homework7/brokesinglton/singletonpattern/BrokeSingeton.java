package com.fediroryshchuk.homework7.brokesinglton.singletonpattern;

import java.lang.reflect.Constructor;

public class BrokeSingeton {

    public static void main(String[] args) {
        President firstPresident = President.getInstance();
        President secondPresident = null;

        try {

            Class SecondPresident = President.class;
            President.getInstance();

            Constructor<President> constr = SecondPresident.getDeclaredConstructor();
            constr.setAccessible(true);
            secondPresident= constr.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Check instances: " + firstPresident.equals(secondPresident));
    }
}
