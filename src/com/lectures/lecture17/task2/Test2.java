package com.lectures.lecture17.task2;

public class Test2 {
    public static void main(String[] args) {
        int max = 0;
        int[] x = new int[100000000];
        for (int i = 0; i < 100000000; i++) {
            x[i] = (int) (Math.random() * 300) + 1;
        }
        long startOne = System.currentTimeMillis();
            for (int i = 0; i < x.length; i++) {
                if (x[i] > max) {
                    max = x[i];
                }
            }
        long finishOne = System.currentTimeMillis();
        System.out.println(" " + (finishOne - startOne) + " " + max + " " + Thread.currentThread().getName());
    }

}
