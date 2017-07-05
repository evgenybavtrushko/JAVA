package com.lectures.lecture8.task3;

import java.util.*;

/**
 * Created by nimf8 on 04.07.2017.
 */
public class ListOfStudentsThree {
    public static void main(String[] args) {
        List<String> lisOfStudents = new ArrayList<>(10);
        List<String> lisOfStudents2 = new ArrayList<>(10);

        lisOfStudents.add("Faraday");
        lisOfStudents.add("Tesla");
        lisOfStudents.add("Einstein");
        lisOfStudents.add("Magelan");
        lisOfStudents.add("Popov");
        lisOfStudents.add("Curie");
        lisOfStudents.add("Edison");
        lisOfStudents.add("Mendeleev");

        ListIterator<String> listIterator = lisOfStudents.listIterator(lisOfStudents.size());
        while (listIterator.hasPrevious()) {
            lisOfStudents2.add(listIterator.previous());
        }
        System.out.println(lisOfStudents);
        System.out.println(lisOfStudents2);
    }
}
