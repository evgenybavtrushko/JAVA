package com.lectures.lecture8.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by User on 004 04.07.17.
 */
public class ListOfRatingsTwo {
    public static void main(String[] args) {
        Integer highestGrade = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add((int) (Math.random() * 11));
        }
        System.out.println(list);
        for(ListIterator<Integer> listIterator = list.listIterator(); listIterator.hasNext();) {
            Integer a = listIterator.next();
            if (a > highestGrade) {
                highestGrade = a;
            }
        }
        System.out.println(list);
        System.out.println(highestGrade);
    }
}

