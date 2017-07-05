package com.lectures.lecture8.task3;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by User on 004 04.07.17.
 */
public class LisOfStudents {
    public static void main(String[] args) {

        NavigableSet<String> lisOfStudents = new TreeSet<>();

        lisOfStudents.add("Faraday");
        lisOfStudents.add("Tesla");
        lisOfStudents.add("Einstein");
        lisOfStudents.add("Magelan");
        lisOfStudents.add("Popov");
        lisOfStudents.add("Curie");
        lisOfStudents.add("Edison");
        lisOfStudents.add("Mendeleev");

        System.out.println(lisOfStudents);
        System.out.println(lisOfStudents.descendingSet());
    }
}
