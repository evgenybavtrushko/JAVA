package com.example.test7;

import java.util.Scanner;

/**
 * Created by User on 013 13.06.17.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год високосный");
        }
        else {
            System.out.println(year + " год не високосный");
        }
    }
}
