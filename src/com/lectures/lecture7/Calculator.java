package com.lectures.lecture7;

/**
 * Created by User on 030 30.06.17.
 */
public abstract class Calculator {
    public static <Number> double multiplication(double x, double y) {
        return x * y;
    }

    public static <Number> double division(double x, double y) {
        return x / y;

    }

    public static <Number> double addition(double x, double y) {
        return x + y;

    }

    public static <Number> double difference(double x, double y) {
        return x - y;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Calculator.multiplication(10.23, 20));
        System.out.println(Calculator.division(10, 20));
        System.out.println(Calculator.addition(10, 20));
        System.out.println(Calculator.difference(10, 20));
    }
}

//multiplication multiplication addition difference


