package com.lectures.lecture8.task6;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by nimf8 on 7/7/2017.
 */
public class Sett {
    public static void main() {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            set1.add((int) (Math.random() * 20));
            set2.add((int) (Math.random() * 20));
        }
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));
    }

    private static Set union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new TreeSet<>();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }

    private static Set intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new TreeSet<>();
        set.addAll(set1);
        set.retainAll(set2);
        return set;
    }
}
