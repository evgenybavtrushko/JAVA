package com.lectures.lecture10.task5;

/**
 * Created by User on 008 08.07.17.
 */
public class Word {
    public static void main(String[] args) {
        String text = "говорят, что море     бесконечно. С    географической    точки зрения это, конечно, не так море";

        String [] strings = text.split(" ");
        System.out.println(strings.length);
    }
}
