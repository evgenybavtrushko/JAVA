package com.lectures.lecture10.task6;

/**
 * Created by User on 008 08.07.17.
 */
public class Replace {
    public static String rip(String str) {
        String str2 = str.toLowerCase();
        StringBuilder string = new StringBuilder(str2);
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                string.deleteCharAt(i);
                i = i - 1;
            }
        }
        return String.valueOf(string);
    }

    public static void main() {
        String str = "Aaadddf   fff ddd sss ";
        System.out.println(str);
        System.out.println(rip(str));
    }
}
