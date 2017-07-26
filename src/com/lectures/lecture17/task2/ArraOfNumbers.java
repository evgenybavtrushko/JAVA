package com.lectures.lecture17.task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArraOfNumbers {
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

        long startTen = System.currentTimeMillis();
        ExecutorService service = Executors.newFixedThreadPool(10);
        int maxi = 0;
        service.submit(new Runnable() {
            @Override
            public void run() {
                int maxi = 0;
                for (int i = 0; i < x.length; i++) {
                    if (x[i] > maxi) {
                        maxi = x[i];
                    }
                }
                service.shutdown();
                long finishTen = System.currentTimeMillis();
                System.out.println("" + (finishTen - startTen) + " " + maxi + " " + Thread.currentThread().getName());
            }
        });
        System.out.println(" " + (finishOne - startOne) + " " + max + " " + Thread.currentThread().getName());
    }

}
