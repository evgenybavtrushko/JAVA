package com.example.test3;

/**
 * Created by User on 011 11.06.17.
 */
public class Solution {
    public static void main(String[] args) {
        int sum = 11;
        if (sum % 10 == 1 && sum % 100 != 11){
            System.out.println(sum + " рубль");
        }
        else if (sum % 10 > 1 && sum % 10 < 5 && sum % 100 != 12 && sum % 100 != 13 && sum % 100 != 14) {
            System.out.println(sum + " рубля");
        }
        else{
            System.out.println(sum + " рублей");
        }
    }
}
