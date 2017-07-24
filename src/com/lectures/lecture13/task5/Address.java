package com.lectures.lecture13.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nimf8 on 7/18/2017.
 */
public class Address {
    public static void main(String[] args) {
    String address = "0.168.225.1";
    Pattern pattern = Pattern.compile("\\b((25[0-5]|2[0-4]\\d|[1]?\\d\\d?)\\.)((25[0-5]|2[0-4]\\d|[1]?[1-9]\\d?)\\.){2}(25[0-5]|2[0-4]\\d|[1]?[1-9]\\d?)\\b");
    Matcher matcher = pattern.matcher(address);
    if(matcher.matches()){
        System.out.println("Введенная строка адрес IPv4!!!");
    }
    else {
        System.out.println("Введенная строка не адрес IPv4!!!");
    }
}
}

