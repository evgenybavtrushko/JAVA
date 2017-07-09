package com.lectures.lecture10.task3;

/**
 * Created by User on 009 09.07.17.
 */
public class Word2 {
    public static boolean word(String str, String str2) {
        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        StringBuilder string = new StringBuilder(str);
        while (string.charAt(0) == ' ') {
            string.deleteCharAt(0);
        }
        while (string.charAt(string.length() - 1) == ' ' || string.charAt(string.length() - 1) == '.') {
            string.deleteCharAt(string.length() - 1);
        }
        str = String.valueOf(string);

        if (str.startsWith(str2) && str.endsWith(str2)) {
            return true;
        } else

        {
            return false;
        }

    }

    public static void main(String[] args) {

        String str = "   Море говорят, что море бесконечно. С географической точки зрения это, конечно, не так море.   ";
        String str2 = "Море";
        System.out.println(str);
        System.out.println(word(str, str2));

    }
}


