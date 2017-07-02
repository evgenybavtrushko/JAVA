package com.lectures.lecture9;

import java.io.IOException;
/**
 * Created by nimf8 on 02.07.2017.
 */
public class OneOfThree {
    public static void main(String[] args) {
        try {
            oneOfThree();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | IllegalAccessException e) {
            System.out.println("IOException или IllegalAccessException");
        }

    }

    private static void oneOfThree() throws IllegalAccessException, IOException, ClassNotFoundException {
        int x = (int) (Math.random() * 10);
        if (x <= 0) {
            throw new IllegalAccessException("Не коректная ширина" + x);
        } else if (x < 5) {
            throw new IOException();
        } else {
            throw new ClassNotFoundException();
        }
    }

}
