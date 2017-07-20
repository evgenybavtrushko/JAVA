package com.lectures.lecture14.task1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by nimf8 on 7/19/2017.
 */
public class Number {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 6, 7, 3, 15, 10, 15, 3, 7, 20);
        double sr =
                numbers
                        .stream()
                        .filter(x -> (x % 2 != 0 && x % 5 == 0))
                        .mapToDouble(x -> x)
                        .average()
                        .orElse(0.0);
        System.out.printf("%.2f" ,sr);
    }
}
