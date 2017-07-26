package com.lectures.lecture17.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Test4 {
    static int[] x = new int[100000000];
    static int i = 0;
    static int max = 0;
    static List maximum = new ArrayList();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int i = 0; i < 100000000; i++) {
            x[i] = (int) (Math.random() * 300) + 1;
        }
        long startTen = System.currentTimeMillis();
        FutureTask task = new FutureTask(callable);
        Thread t = new Thread(task);
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (i = 0; i < 100000000; i += 10000000) {
            service.submit(t);
            maximum.add(task.get());
        }
        service.shutdown();

        System.out.println(maximum.stream().reduce((s1, s2) -> s1.equals(s2) ? s1 : s2).orElse(0));
        long finishTen = System.currentTimeMillis();
        System.out.println("" + (finishTen - startTen) + " " + (Thread.currentThread().getName()));

    }

    static Callable<Integer> callable = new Callable<Integer>() {
        @Override
        public Integer call() {
            int maxi = 3;
            for (int j = i; j < i + 10000000; j++) {
                if (x[j] > maxi) {
                    maxi = x[j];
                }
            }
            return maxi;
        }
    };
}