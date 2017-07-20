package com.lectures.lecture13.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nimf8 on 7/18/2017.
 */
public class PhoneNumber {
    public static void main() {
        String text = "Вымирают +375292689084 целые  r+375448654320 из-за вырубки 375338654320 лесов, многие " +
                "водные +375378654320 млекопитающие и рыбы +375254563425 давно находятся +375254533425e";
        StringBuilder str = new StringBuilder(text);
        Pattern pattern = Pattern.compile(" \\+375(25|29|33|44)\\d{7}\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            str.insert(matcher.start() + 4, '(');
            str.insert(matcher.start() + 7, ')');
            str.insert(matcher.start() + 11, '-');
            str.insert(matcher.start() + 14, '-');
            matcher.reset();
        }
        System.out.println(str);
    }
}

