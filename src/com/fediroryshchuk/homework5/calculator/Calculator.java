package com.fediroryshchuk.homework5.calculator;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Stream;


public class Calculator {

    private static Map<Character, BinaryOperator<Double>> operations = setOperationType();

    public static double calculate(double numberOne, char operation, double numberTwo) {

        BinaryOperator<Double> op = operations.get(operation);
        return op.apply(numberOne, numberTwo);
    }

    private static Map<Character, BinaryOperator<Double>> setOperationType() {

        Map<Character, BinaryOperator<Double>> operationList = new HashMap<>();

        BinaryOperator<Double> addition = (x, y) -> (x + y);
        BinaryOperator<Double> subtraction = (x, y) -> (x - y);
        BinaryOperator<Double> multiplication = (x, y) -> (x * y);
        BinaryOperator<Double> division = (x, y) -> (x / y);
        BinaryOperator<Double> involution = (x, y) -> (Math.pow(x, y));
        BinaryOperator<Double> evolution = (x, y) -> (Math.pow(x, 1 / y));
        BinaryOperator<Double> strangeOperation = (x, y) -> (Math.pow(x, y) / (x + 117));

        operationList.put('+', addition);
        operationList.put('-', subtraction);
        operationList.put('*', multiplication);
        operationList.put('/', division);
        operationList.put('^', involution);
        operationList.put('r', evolution);
        operationList.put('&', strangeOperation);

        return operationList;
    }
}