package com.lectures.lecture14.task3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nimf8 on 7/19/2017.
 */
public class MapSum {
    public static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Телефон", 500);
        map.put("Ноутбук", 600);
        map.put("Комп", 800);
        map.put("Ридер", 200);
        map.put("Флешка", 30);
        map.put("Наушники", 60);
        map.put("Монитор", 300);
        int x =
                map.keySet()
                        .stream()
                        .filter(str -> (str.length() < 7))
                        .mapToInt(y -> map.get(y))
                        .sum();
        System.out.println(x);
    }
}
