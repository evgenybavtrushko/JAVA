package com.example.ex;

import java.util.Scanner;

/**
 * Created by User on 013 13.06.17.
 */
public class RealData {
    public static void main(String[] args) {
        real(21,56,85);
    }
        public static boolean real(int day, int month, int year) {
        String unreal = day + "." + month + "." + year + " нереальная дата";
        String result = day + "." + month + "." + year + " реальная дата";

        if (day > 0 && day < 32 && month > 0 && month < 13 && year > 0) {
            if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) { //Check for months in which 30 days
                result = unreal;
            } else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {            //Check for a leap year
                    if (day > 29) {
                        result = unreal;
                    }
                } else if (day > 28) {
                    result = unreal;
                }
            }
        } else {
            result = unreal;
        }

        System.out.println(result);
        return result.equals(unreal);
}
    }

