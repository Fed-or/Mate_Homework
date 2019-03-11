package com.fediroryshchuk.homework5.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        System.out.println("Please, enter number");
        double numberFirst = getDouble();
        System.out.println("Please, enter second number");
        double numberSecond = getDouble();
        char operation = getOperation();
        double result = Calculator.calculate(numberFirst, operation, numberSecond);
        System.out.println("Result of operation: " + result);
    }

    private static double getDouble() {
        double number = 0;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Please, enter correct number");
            number = getDouble();
        }
        return number;
    }

    private static char getOperation() {
        System.out.println("Enter operation: ");
        char operation;
        try {
            operation = reader.readLine().charAt(0);
        } catch (IOException e) {
            System.out.println("Enter correct operation: ");
            operation = getOperation();
        }
        return operation;
    }
}
