package com.lectures.lecture8.lecture82.task3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 008 08.07.17.
 */
public class Polynomial {
    public static void main() {
        int degree = 6;
        Map<Integer, Integer> polynomial = new HashMap<>();
        Map<Integer, Integer> polynomial2 = new HashMap<>();
        Map<Integer, Integer> sumOfPolynomials = new HashMap<>();

        for (int i = 0; i < degree; i++) {
            polynomial.put(i, (int) (Math.random() * 5));
            polynomial2.put(i, (int) (Math.random() * 5));
            sumOfPolynomials.put(i, polynomial.get(i) + polynomial2.get(i));
        }

        System.out.println(polynomial.entrySet());
        System.out.println(polynomial2.entrySet());
//        System.out.println(sumOfPolynomials.entrySet());

        for (int i = degree - 1; i >= 1; i--) {
            System.out.print(sumOfPolynomials.get(i) + " * 10^" + i + " + ");

        }
        System.out.println(sumOfPolynomials.get(0));
    }
}
