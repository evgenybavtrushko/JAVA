package com.lectures.lecture3.factorial;

/**
 * Created by User on 018 18.06.17.
 */
public class FactorialWhile {
    public static void main(String[] args) {
        int x = 5;
        int factorialX = 1;
        int i = 1;
        while (i <= x){
            factorialX *= i;
            i++;
        }
        System.out.println(factorialX);
    }
}
