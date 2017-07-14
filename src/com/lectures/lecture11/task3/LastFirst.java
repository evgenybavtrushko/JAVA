package com.lectures.lecture11.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nimf8 on 7/13/2017.
 */
public class LastFirst {
    public static void main(String[] args) {
        File file = new File("Text");
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (IOException e) {
            System.out.println("Ошибка ввода выводы");
        }
        String[] strings = stringBuilder.toString().toLowerCase().split(" ");
        List list = new ArrayList();
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].charAt(strings[i].length()-1) == strings[i + 1].charAt(0)) {
                list.add(strings[i]);
                list.add(strings[i +1]);
            }
        }
        System.out.println(list);
    }
}


