package com.lectures.lecture11.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nimf8 on 7/14/2017.
 */
public class LargestNumber {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String s;
        String y;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("number"))) {
            while ((s = bufferedReader.readLine()) != null) {
                list.add("\n" + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            y = "";
            s = iterator.next().toString();
            for (int i = 0; i < s.length(); i++) {
                char x;
                stringBuilder.delete(0, stringBuilder.length());
                if (Character.isDigit(x = s.charAt(i))) {
                    while (Character.isDigit(x = s.charAt(i))) {
                        stringBuilder.append(x);
                        i++;
                    }
                }
                if (stringBuilder.length() > y.length()) {
                    y = stringBuilder.toString();
                }
            }
            System.out.println(y);

        }
    }
}