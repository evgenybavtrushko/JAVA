package com.lectures.lecture10.task5;

/**
 * Created by User on 008 08.07.17.
 */
public class NumberOfWords {
    public static String rip(String str) {
        StringBuilder string = new StringBuilder(str);
        for (int i = 0; i < string.length() - 1; i++) {
            if(string.charAt(i) == ' ') {
                if (string.charAt(i) == string.charAt(i + 1)) {
                    string.deleteCharAt(i);
                    i = i - 1;
                }
            }

        }
        return String.valueOf(string);
    }
    public static int numberOfWords(String str){
        String [] str2 = rip(str).split(" ");
        return str2.length;
    }

    public static void main() {
        String text = "Говорят, что море       бесконечно. С    географической    точки зрения это, конечно, не так море";
        System.out.println(text);
        System.out.println(numberOfWords(text));
    }
}
