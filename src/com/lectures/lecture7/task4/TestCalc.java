package com.lectures.lecture7.task4;

/**
 * Created by nimf8 on 05.07.2017.
 */
public class TestCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10.6,2.6);

        System.out.println(calculator.multiplication(calculator));
        System.out.println(calculator.division(calculator));
        System.out.println(calculator.addition(calculator));
        System.out.println(calculator.difference(calculator));
    }
}
