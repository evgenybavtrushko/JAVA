package com.lectures.lecture8.task7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 006 06.07.17.
 */
public class Reverse {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        while (list.size() != 10) {
            list.add((int) ((Math.random() * 20) - 10));
        }
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
