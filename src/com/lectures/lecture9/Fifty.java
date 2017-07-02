package com.lectures.lecture9;

/**
 * Created by nimf8 on 02.07.2017.
 */
public class Fifty {
    public static void main(String[] args) {
        fifty();
    }

    public static void fifty() {
        int x = 0;
        int y = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 5;
            }
        }
        for (int i = 0; i < array.length; i++) {
            try {
                x = 89 / array[i];
            } catch (ArithmeticException ex) {
                y++;
                System.out.println("Деление на ноль  " + y);

            } finally {
                System.out.println("jhhh");

                }

            }
        }
    }

