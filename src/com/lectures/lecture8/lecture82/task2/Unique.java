package com.lectures.lecture8.lecture82.task2;

import java.util.*;

/**
 * Created by User on 007 07.07.17.
 */
public class Unique {
    public static boolean isUnique(Map<String, String> map) {
        List<String> list = new ArrayList<>(map.values());
        Set<String> set = new HashSet<>(map.values());
//        System.out.println(set);
        if (list.size() > set.size()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main() {
        Map<String, String> map = new HashMap<>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Perkins");
        map.put("Perkins", "Stepp");

        System.out.println(map);
        System.out.println(isUnique(map));
    }
}
