package com.lectures.lecture10.task4;

/**
 * Created by User on 008 08.07.17.
 */
public class Initials {
    public static String initials(String str) {
        char name = ' ';
        char family = ' ';
        char middleName = ' ';

        String[] word = str.split(" ");
        name = word[0].charAt(0);
        family = word[1].charAt(0);
        middleName = word[2].charAt(0);
        return (family + "." + name + "." + middleName).toUpperCase();
    }

    public static void main(String[] args) {

        System.out.println(initials("Василий Иванов Иванович"));
    }


}
