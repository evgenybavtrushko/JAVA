package com.lectures.lecture11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nimf8 on 7/13/2017.
 */
public class JavaCode {
    public static void main(String[] args) throws FileNotFoundException {
        List list = new ArrayList();
        List list2 = new ArrayList();
        String s;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Projects java\\src\\com\\lectures\\lecture6\\figures\\circles\\circle.java"))) {
            while ((s = bufferedReader.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder((String) list.get(i));
            list2.add(stringBuilder.reverse());
        }
        System.out.println(list);
        System.out.println(list2);
    }
}
