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
        StringBuilder str = new StringBuilder();
        String s;
        String y = "";
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
            str.delete(0, str.length());
            for (int i = 0; i < s.length(); i++) {
                char x = 0;
                if (Character.isDigit(x = s.charAt(i))) {
                    x = 0;
                    str.delete(0, str.length());
                    while (Character.isDigit(x = s.charAt(i))) {
                        str.append(x);
                        i++;
                    }
                }
                if (str.length() > y.length()) {
                    y = str.toString();
                }
            }
            System.out.println(y);

        }
    }
}