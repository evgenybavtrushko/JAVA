package com.lectures.lecture8.lecture82.task1;

import java.util.*;

/**
 * Created by User on 007 07.07.17.
 */
public class Count {
    public static int countUnique(List list) {
        Set <List> set = new HashSet<>(list);
        return list.size()- set.size();
    }
    public static void main(String[] args) {
        List <Integer>list1 = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 6));
        }

        System.out.println(list);
        System.out.println(countUnique(list));

        System.out.println(countUnique(list1));

    }
}
