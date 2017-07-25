package com.lectures.lecture17.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class ReadNumbers {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(new Runnable() {
            public void run() {
                int x = 0;
                while (x != -1) {
                    try {
                        x = Integer.parseInt(bufferedReader.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (x == 1) {
                        service.shutdown();
                    }
                    try {
                        sleep(x * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Я спал " + x + " секунд");
                }
            }
        });
    }
}
