package com.lectures.lecture3.summa;//package com.example.practice3;

/**
 * Created by user on 14.06.2017.
 */
public class Summa {
    public static void main(String[] args) {
        int number[] = new int[10];
        int max = number[0];
        int min = number[0];
        int indexMin = 0;
        int indexMax = 0;
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }

        for (int i = 1; i < number.length; i++) {
            if (min >= number[i]) {
                min = number[i];
                indexMin = i;
            }
            if (max <= number[i]) {
                max = number[i];
                indexMax = i;
            }
        }
        if (indexMin < indexMax) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                sum += number[i];
            }
        } else {
            for (int i = indexMax + 1; i < indexMin; i++) {
                sum += number[i];
            }
        }
        System.out.println("\n" + sum);
    }
}
