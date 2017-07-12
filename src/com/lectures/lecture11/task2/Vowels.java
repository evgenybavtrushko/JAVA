package com.lectures.lecture11.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 011 11.07.17.
 */
public class Vowels {
    public static void main(String[] args) {
        File file = new File("Text");
        String line;
        String str = "";
        char[] dd = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                str = str + " " + line;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (IOException e) {
            System.out.println("Ошибка ввода выводы");
        }
        String[] strings = str.split(" ");
        List stringVowels = new ArrayList();
        for (int i = 1; i < strings.length; i++) {
            for (int j = 0; j < dd.length; j++) {
                if (strings[i].charAt(0) == dd[j]) {
                    stringVowels.add(strings[i]);
                }
            }
        }
        System.out.println(stringVowels);
    }
}



