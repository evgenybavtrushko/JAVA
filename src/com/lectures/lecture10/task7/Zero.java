package com.lectures.lecture10.task7;

/**
 * Created by User on 009 09.07.17.
 */
public class Zero {
    public static String replaceEnd(int x) {
        String str = String.valueOf(x);
        StringBuilder string = new StringBuilder("0000000000");
        if (string.length() > str.length()) {
            string.replace(string.length() - str.length(), string.length(), str);
            return String.valueOf(string);
        }
        return str;
    }

    public static String sub(int x) {
        String str = "0000000000" + x;
        str = str.substring(str.length() - 10);
        return str;
    }

    public static String deleteStart(int x) {
        String str = String.valueOf(x);
        StringBuilder string = new StringBuilder("0000000000");
        if (string.length() > str.length()) {
            string.append(str).delete(0, str.length());
            return String.valueOf(string);
        }
        return str;

    }


    public static void main() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            replaceEnd(1);
        }
        long timeSpent = System.currentTimeMillis();

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sub(1);
        }
        long timeSpent2 = System.currentTimeMillis();

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            deleteStart(1);
        }
        long timeSpent3 = System.currentTimeMillis();
        System.out.println("1  " + (timeSpent - startTime) + "\n2  " + (timeSpent2 - startTime2) + "\n3  " + (timeSpent3 - startTime3));
    }
}