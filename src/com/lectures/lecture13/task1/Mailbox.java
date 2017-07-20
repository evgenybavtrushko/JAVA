package com.lectures.lecture13.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nimf8 on 7/18/2017.
 */
public class Mailbox {
    public static void main() {
        String mail = "nimf87@mail.org";
        Pattern pattern = Pattern.compile("\\b[A-Za-z]\\w*@\\w+\\.(org||com)\\b");
        Matcher matcher = pattern.matcher(mail);
        if(matcher.matches()){
            System.out.println("Введенная строка адрес электронной почты!!!");
        }
        else {
            System.out.println("Введенная строка не адрес электронной почты!!!");
        }
    }
}
