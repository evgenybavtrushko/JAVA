package com.lectures.lecture15;

/**
 * Created by nimf8 on 7/20/2017.
 */
public class Factory extends Thread {
    public void run() {
        System.out.println("Старт потока фабрика");
        for (int i = 0; i < 100; i++) {
            int x = (int) ((Math.random() * 4) + 1);
            for (int j = 0; j < x; j++) {
                Test.dump.throwAwayOfTheDump();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Финишь потока фабрика");
    }
}