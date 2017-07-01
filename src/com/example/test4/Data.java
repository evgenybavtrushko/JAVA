package com.example.test4;

import java.util.Scanner;

/**
 * Created by User on 011 11.06.17.
 */
public class Data {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер дня");
        int day = in.nextInt();
        System.out.println("Введите номер месяца");
        int month = in.nextInt();
        System.out.println("Введите год");
        int year = in.nextInt();
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;
        if (month == 4 || month == 6 || month == 9 || month == 11){     //Check for months in which 30 days
            if(day > 29) {                                              //Check for the last day of the month
                nextDay = 1;
                nextMonth = month + 1;
            }
        }
        else if (month > 11) {                                           //Check for the last month of the year
            if (day > 30) {                                              //Check for the last day of the month
                nextDay = 1;
                nextMonth = 1;
                nextYear = year + 1;
            }
        }
        else if (month == 2){                                           //Check for the february month
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){   //Check for a leap year
                if (day > 28){                                          //Check for the last day of the month
                    nextDay = 1;
                    nextMonth = month + 1;
                }
            }
            else {
                if (day > 27){                                           //Check for the last day of the month
                    nextDay = 1;
                    nextMonth = month + 1;
                }
            }
        }
        else {
            if (day > 30){                                                //Check for the last day of the month
                nextDay = 1;
                nextMonth = month + 1;
            }
        }

            System.out.println("Следующий день " + nextDay + "." + nextMonth + "." + nextYear);
        }
    }

// 31 28 31 30 31 30 31 31 30 31 30 31