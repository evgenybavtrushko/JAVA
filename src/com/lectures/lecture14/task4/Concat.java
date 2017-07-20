package com.lectures.lecture14.task4;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by nimf8 on 7/20/2017.
 */
public class Concat {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 0, 6, 3, 8, 6, 3, 6);
        String str = list
                .stream()
                .map(x -> x.toString())
                .reduce((x, y) -> x + y)
                .orElse("0");
        System.out.println(str);
    }
}