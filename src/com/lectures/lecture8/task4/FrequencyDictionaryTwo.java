package com.lectures.lecture8.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nimf8 on 06.07.2017.
 */
public class FrequencyDictionaryTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("text.txt");
        String text = scanner.toString();
        System.out.println(scanner.hasNextLine());
      //  String text = "кот собака слон кот тигр лев собака кот лев кот лев.";
        String[] parts = (text + " ").split("\\p{P}?[ \\t\\n\\r]+");
        Map<String, Integer> animal = new HashMap<>();
        for (String i : parts) {
            animal.merge(i, 1, (a, b) -> a + b);
        }
        System.out.println(animal.get("собака"));
    }
}

