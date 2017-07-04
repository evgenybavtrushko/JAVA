package com.lectures.lecture8.task3;

import java.util.*;

/**
 * Created by User on 004 04.07.17.
 */
public class LisOfStudentsTwo {
    public static void main(String[] args) {
        List<String> lisOfStudents = new ArrayList<>();
        List<String> lisOfStudents2 = new ArrayList<>();
        lisOfStudents.add("Faraday");
        lisOfStudents.add("Tesla");
        lisOfStudents.add("Einstein");
        lisOfStudents.add("Magelan");
        lisOfStudents.add("Popov");
        lisOfStudents.add("Curie");
        lisOfStudents.add("Edison");
        lisOfStudents.add("Mendeleev");
        ListIterator<String> listIterator = lisOfStudents.listIterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next();
             }

       // while (listIterator.hasPrevious()) {
      //      lisOfStudents2.add(listIterator.previous());
      //  }
            System.out.println(lisOfStudents);
            System.out.println(lisOfStudents2);


        }
    }
