package com.lectures.lecture9;


/**
 * Created by nimf8 on 02.07.2017.
 */
public class Cause {
    public static void main(String[] args) {
        try {
            exception();
         } catch (ArrayIndexOutOfBoundsException e) {
                throw new EnterThreeException("Потому что ArrayIndexOutOfBoundsException");
        }

    }

    public static void exception()throws ArrayIndexOutOfBoundsException {
        int[] array = new int[9];
        array[10] = 5;

    }
}

