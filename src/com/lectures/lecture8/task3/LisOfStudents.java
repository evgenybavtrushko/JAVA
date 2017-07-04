package com.lectures.lecture8.task3;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by User on 004 04.07.17.
 */
public class LisOfStudents {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>();
        set.add("Faraday");
        set.add("Tesla");
        set.add("Einstein");
        set.add("Magelan");
        set.add("Popov");
        set.add("Curie");
        set.add("Edison");
        set.add("Mendeleev");
        System.out.println(set);
        System.out.println(set.descendingSet());
    }
}
