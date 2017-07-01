package com.example.test8;

import java.util.Scanner;

/**
 * Created by User on 013 13.06.17.
 */
public class RubleIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        if (sum % 10 == 1 && sum % 100 != 11) {
            System.out.println(sum + " рубль");
        } else if (sum % 10 > 1 && sum % 10 < 5 && sum % 100 != 12 && sum % 100 != 13 && sum % 100 != 14) {
            System.out.println(sum + " рубля");
        } else {
            System.out.println(sum + " рублей");
        }
    }
}