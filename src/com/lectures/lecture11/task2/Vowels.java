package com.lectures.lecture11.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 011 11.07.17.
 */
public class Vowels {
    public static void main() {
        File file = new File("Text");
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        char[] vowels = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
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
        List stringVowels = new ArrayList();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (strings[i].charAt(0) == vowels[j]) {
                    stringVowels.add(strings[i]);
                }
            }
        }
        System.out.println(stringVowels);
    }
}



