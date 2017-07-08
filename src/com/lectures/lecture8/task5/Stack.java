package com.lectures.lecture8.task5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by User on 006 06.07.17.
 */
public class Stack {
    public static void main() {
        //       Scanner scanner = new Scanner(System.in);
        //       Integer x = scanner.nextInt();
        int x = 123456;
        Deque<Integer> deque = new ArrayDeque<>();
        while (x > 0) {
            deque.addFirst(x % 10);
            x = x / 10;
        }
        System.out.println(deque);
        while (!(deque.isEmpty())) {
            x = x * 10 + deque.pollLast();
        }
        System.out.println(x);
    }
}
