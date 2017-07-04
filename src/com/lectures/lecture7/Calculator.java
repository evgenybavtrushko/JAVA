package com.lectures.lecture7;

import java.math.BigDecimal;

/**
 * Created by User on 030 30.06.17.
 */
public  class Calculator <T , V> {
    private BigDecimal a;
    private BigDecimal b;

    public Calculator(T a, V b) {
        this.a = new BigDecimal(a.toString());
        this.b = new BigDecimal(b.toString());
    }
}

   /* }
    public Number multiplication(Calculator calculator) {
        return value * value2;
    }

    public T division(T value, T value2) {
        return value * value2;

    }

    public static <T> double addition(T value, T value2) {
        return value * value2;

    }

    public static <T> double difference(T value, T value2) {
        return value * value2;
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

    public static void main(String[] args) {
        Calculator <Integer> calculator = new Calculator<>(10,78);
        System.out.println(calculator.multiplication(calculator));
    }*/
