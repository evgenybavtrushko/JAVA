package com.lectures.lecture13.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nimf8 on 7/18/2017.
 */
public class Address { public static void main() {
    String address = "0.168.255.100";
    Pattern pattern = Pattern.compile("\\b((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\b");
    Matcher matcher = pattern.matcher(address);
    if(matcher.matches()){
        System.out.println("Введенная строка адрес IPv4!!!");
    }
    else {
        System.out.println("Введенная строка не адрес IPv4!!!");
    }
}
}

