package com.fediroryshchuk.homework5.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Stream;


public class Calculator {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        System.out.println("Please, enter number");
        double numberFirst = getDouble();
        System.out.println("Please, enter second number");
        double numberSecond = getDouble();
        char operation = getOperation();
        double result = calculate(numberFirst, numberSecond, operation);
        System.out.println("Result of operation: " + result);
    }

    public static double getDouble() {
        double number = 0;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Please, enter correct number");
            number = getDouble();
        }
        return number;
    }

    public static char getOperation() {
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


    public static double calculate(double numberOne, double numberTwo, char operation) {
        Map<Character, BinaryOperator<Double>> operationList = new HashMap<>();


        operationList.put('+', (numberFirst, numberSecond) -> numberFirst + numberSecond);
        operationList.put('-', (numberFirst, numberSecond) -> numberFirst - numberSecond);
        operationList.put('*', (numberFirst, numberSecond) -> numberFirst * numberSecond);
        operationList.put('/', (numberFirst, numberSecond) -> numberFirst / numberSecond);
        operationList.put('^', (numberFirst, numberSecond) -> Math.pow(numberFirst, numberSecond));
        operationList.put('r', (numberFirst, numberSecond) -> Math.pow(numberFirst, 1 / numberSecond));
        operationList.put('&', (numberFirst, numberSecond) -> Math.pow(numberFirst, numberSecond) / (numberFirst + 117));


        return Optional.ofNullable(operationList.get(operation))
                .orElseThrow(() -> new IllegalArgumentException("Incorrect symbol, try again"))
                .apply(numberOne, numberTwo);

        // блок return я подсмотрел и не понял почеу не смог сделать как ниже:
        /*
        //Why I could not make such... :
        BinaryOperator<Double> op = operationList.get(operation);

        return operationList.entrySet().stream()
                .map(e -> Stream.of(e.getKey())
                        .map(e -> e.equals(operation));
        op.apply(numberOne, numberTwo);

         */
    }
}
