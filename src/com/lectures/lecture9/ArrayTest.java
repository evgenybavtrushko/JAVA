package com.lectures.lecture9;

/**
 * Created by nimf8 on 02.07.2017.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[3];
        try {
            array[3] = 8;
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за пределы массива");
        }
    }

}
