package com.lectures.lecture8.task8;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by User on 006 06.07.17.
 */
public class BlackBox<Integer> extends TreeSet {
    public Integer min(int k) {
        Integer x = null;
        if (k > this.size()) {
            System.out.print("Такого числа нет ");
            return null;
        } else {
            Iterator<Integer> iterator = this.iterator();
            for (int i = 0; i < k; i++) {
                x = iterator.next();
            }
            return x;
        }
    }

    public Integer max(int n) {
        Integer x = null;
        if (n > this.size()) {
            System.out.println("Такого числа нет ");
            return null;
        } else {
            Iterator<Integer> iterator = this.iterator();
            for (int i = 0; i < this.size() - n + 1; i++) {
                x = iterator.next();
            }
            return x;
        }

    }

    public static void main() {
        BlackBox blackBox = new BlackBox();
        for (int i = 0; i < 10; i++) {
            blackBox.add((int) (Math.random() * 20));
        }
        System.out.println(blackBox);
        System.out.println(blackBox.min(2));
        System.out.println(blackBox.max(2));
    }
}



