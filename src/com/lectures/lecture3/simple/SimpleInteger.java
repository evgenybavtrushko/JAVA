package com.lectures.lecture3.simple;

/**
 * Created by User on 018 18.06.17.
 */
public class SimpleInteger {
    public static void main(String[] args) {
        int x = 4;
        String s ="Число " + x + " простое ";
        for(int i = 2; i < x -1; i++){
            if(x % i == 0){
                s = "Число " + x + " состовное";
                break;
            }
        }
        System.out.println(s);
    }
}
