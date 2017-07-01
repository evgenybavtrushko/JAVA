package com.example.test2;

/**
 * Created by User on 011 11.06.17.
 */
public class Solution {
    public static void main(String[] args) {
        double a = 0  , b = 1, rad = 1;

        if (Math.sqrt(a*a +b*b) <= rad)
            System.out.println("Картонка полностью закрывает отверстие");
        else
            System.out.println("Картонка не полностью закрывает отверстие");

    }
}
