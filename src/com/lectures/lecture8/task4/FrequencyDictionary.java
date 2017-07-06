package com.lectures.lecture8.task4;

import java.util.*;

/**
 * Created by nimf8 on 05.07.2017.
 */
public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "кот собака слон кот тигр лев собака кот лев кот лев";
        String[] parts = (text + " ").split("\\p{P}?[ \\t\\n\\r]+");
        Map<String, Integer> animal = new HashMap<>();
        for (String i : parts) {
            if (animal.get(i) == null) {
                animal.put(i, 1);
            } else {
                animal.put(i, animal.get(i) + 1);
            }
        }
        System.out.println(animal.get("кот"));
    }
}