package com.lectures.lecture8.task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Created by nimf8 on 06.07.2017.
 */
public class FrequencyDictionaryTwo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text");
        Scanner scanner = new Scanner(file);
        String text = scanner.nextLine();
        System.out.println(text);
        //  String Text = "кот собака слон кот тигр лев собака кот лев кот лев.";
        String[] parts = (text + " ").split("\\p{P}?[ \\t\\n\\r]+");
        Map<String, Integer> animal = new HashMap<>();
        for (String i : parts) {
            animal.merge(i, 1, (a, b) -> a + b);
        }
        System.out.println(animal.get("собака"));
    }
}

