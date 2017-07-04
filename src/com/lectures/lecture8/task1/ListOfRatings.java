package com.lectures.lecture8.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by User on 004 04.07.17.
 */

public class ListOfRatings {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 30; i++) {
            list.add((int) (Math.random() * 11));
        }
        System.out.println(list);
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer a = listIterator.next();
            if(a < 4){
                listIterator.remove();
            }
            if (listIterator.next() < 4) {
                listIterator.remove();
            }
        }
        System.out.println(list);
        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + (startTime - timeSpent) + "милисекунд");
    }
}
