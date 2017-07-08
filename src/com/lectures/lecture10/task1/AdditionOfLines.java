package com.lectures.lecture10.task1;

/**
 * Created by User on 008 08.07.17.
 */
public class AdditionOfLines {
    public static void main(String[] args) {
        String f = "";
        String s = "";
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            s = s + "bob";
        }
        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + (startTime - timeSpent) + "милисекунд");
        long startTime2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(f);
        for(int i = 0; i < 1000000; i++){
            stringBuilder.append("sid");
        }
        long timeSpent2 = System.currentTimeMillis();
        System.out.println("программа выполнялась " + (startTime2 - timeSpent2) + "милисекунд");
    }
}
