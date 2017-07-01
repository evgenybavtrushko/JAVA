package com.lectures.lecture3.factorial;

/**
 * Created by User on 018 18.06.17.
 */
public class FactorialFor {
    public static void main(String[] args) {
        int x = 0;
        int factorialX = 1;
        for (int i = 1; i <= x; i++){
            factorialX *= i;
        }
        System.out.println(factorialX);
    }

}
