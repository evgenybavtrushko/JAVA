package com.lectures.lecture8.task3;

import java.util.*;

/**
 * Created by User on 005 05.07.17.
 */
public class ListOfStudentsFour {
    public static void main(String[] args) {
        NavigableSet<Students> lisOfStudents = new TreeSet<>();

        lisOfStudents.add(new Students("Faraday"));
        lisOfStudents.add(new Students("Tesla"));
        lisOfStudents.add(new Students("Einstein"));
        lisOfStudents.add(new Students("Magelan"));
        lisOfStudents.add(new Students("Popov"));
        lisOfStudents.add(new Students("Curie"));
        lisOfStudents.add(new Students("Edison"));
        lisOfStudents.add(new Students("Mendeleev"));

        Iterator listIterator = lisOfStudents.iterator();
        while (listIterator.hasNext()) {

            System.out.println(listIterator.next().toString());
        }
    }
}
