package com.lectures.lecture8.lecture82.task1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by User on 007 07.07.17.
 */
public class Count {
    public static int countUnique(List list) {
        int k = 0;
        if (list.size() != 0) {
            list.sort(Comparator.naturalOrder());
            System.out.println(list);
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()){
                if(listIterator.next() != listIterator.next())
                    k++;
                }
            }

        return k;
    }
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 30; i++) {
            list.add((int) (Math.random() * 6));
        }
        System.out.println(list);
        System.out.println(countUnique(list));
    }
}
