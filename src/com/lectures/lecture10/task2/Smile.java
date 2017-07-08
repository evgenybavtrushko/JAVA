package com.lectures.lecture10.task2;

/**
 * Created by User on 008 08.07.17.
 */
public class Smile {
    public static void main(String[] args) {
        String strN = "";
        String str = "Говорят, :(что море:) бесконечно. С:( географической:( точки зрения((( это, конечно, не так";

        for(int i = 0; i < str.length()-1; i++)
            if(str.charAt(i) == ':'&& str.charAt(i+1) == '('){
            strN = str.replace(":(",":)");
            }
        System.out.println(strN);
    }
}