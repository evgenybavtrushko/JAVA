package com.lectures.lecture8.task4;

import java.util.*;

/**
 * Created by nimf8 on 05.07.2017.
 */
public class FrequencyDictionary {
    public static void main() {
        String text = "кот собака слон кот тигр лев собака кот лев кот лев собака слон кот тигр лев собака кот";
        String[] animal = text.split(" ");
        Map<String, Integer> animals = new TreeMap<>();
        for (String i : animal) {
            animals.merge(i, 1, (a, b) -> a + b);
        }
        System.out.println(animals.entrySet());

    }
}


//           if (animal.get(i) == null) {
//               animal.put(i, 1);
//           } else {
//               animal.put(i, animal.get(i) + 1);
//           }
//  for (String i : animals.keySet()) {
//       System.out.println(i + " " + animals.get(i));
//   }
