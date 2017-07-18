package com.lectures.lecture11.task7;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nimf8 on 7/13/2017.
 */
public class JavaCode {
    public static void main() {
        List list = new ArrayList();
        List list2 = new ArrayList();
        String s;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Projects java\\src\\com\\lectures\\lecture6\\figures\\circles\\circle.java"))) {
            while ((s = bufferedReader.readLine()) != null) {
                list.add("\n" + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder((String) list.get(i));
            list2.add(stringBuilder.reverse());
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text3"))) {
            Iterator iterator = list2.iterator();
            while (iterator.hasNext()) {
                bufferedWriter.write(String.valueOf(iterator.next()));
            }
        } catch (IOException ex) {
            System.out.println("cc");
        }
        System.out.println(list);
        System.out.println(list2);
    }
}
