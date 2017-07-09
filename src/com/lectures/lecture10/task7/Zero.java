package com.lectures.lecture10.task7;

/**
 * Created by User on 009 09.07.17.
 */
public class Zero {
    public static String replaceEnd(int x){
        String str = String.valueOf(x);
        StringBuilder string = new StringBuilder("0000000000");
        if(string.length() > str.length()) {
            string.replace(string.length() - str.length(), string.length(), str);
            return String.valueOf(string);
        }
        return str;
    }
   // public static String division(int x){
    //    String str = String.valueOf(x);
     //   str.

//        return ;
 //   }
    public static String deleteStart(int x){
        String str = String.valueOf(x);
        StringBuilder string = new StringBuilder("0000000000");
        if(string.length() > str.length()) {
            string.append(str).delete(0, str.length());
            return String.valueOf(string);
        }
        return str;

    }



    public static void main(String [] args) {
        System.out.println(replaceEnd(123));
 //       System.out.println(division(2522));
        System.out.println(deleteStart(101));
    }
}
//*/