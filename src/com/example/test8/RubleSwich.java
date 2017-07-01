package com.example.test8;

import java.util.Scanner;

/**
 * Created by User on 013 13.06.17.
 */
public class RubleSwich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int a = sum % 10;
        String x = " рублей";
        String y = " рубль";
        String z = " рубля";
        switch (a){
            case 1:
                if (sum % 100 !=11){
                    x = y;
                }
                break;
            case 2:
            case 3:
            case 4:
                if (sum % 100 != 12 && sum % 100 != 13 && sum % 100 != 14){
                    x = z;
                }
                break;
        }
        System.out.println(x);
    }
}
