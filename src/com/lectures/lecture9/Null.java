package com.lectures.lecture9;

/**
 * Created by nimf8 on 02.07.2017.
 */
public class Null {
    public static void main(String[] args) {
        try {
            name.length();
        }
        catch (NullPointerException ex){
            System.out.println("Переменная name содержит null");
        }
    }
    private static String name = null;
}

