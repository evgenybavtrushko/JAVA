package com.lectures.lecture9;

/**
 * Created by nimf8 on 02.07.2017.
 */
public class Fifty {
    public static void main(String[] args) {
        int[] array = new int[100];
        int i = 0;
        try {
            fifty();
        } catch (ArithmeticException ex) {
            i++;
            System.out.println("Деление на ноль" + i);
        }
        finally {

        }
    }
    public static void fifty() throws ArithmeticException {
        int x = 0;
        int[] array = new int[100];
        for (int i : array) {
            if (i % 2 == 0) {
                array[i] = 5;
            }
        }
        for (int i:array) {
          x = 89 /array[i];

        }
        System.out.println(array[3]);
    }
}
