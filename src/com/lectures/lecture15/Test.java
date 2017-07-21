package com.lectures.lecture15;

/**
 * Created by nimf8 on 7/20/2017.
 */
public class Test {
    static Dump dump = new Dump();
    static Factory factory = new Factory();
    static MadScientist madScientist = new MadScientist();
    static MadScientist madScientist1 = new MadScientist();

    public static void main(String[] args) {

        System.out.println(dump);
        factory.start();
        madScientist.start();
        madScientist1.start();
        try {
            madScientist.join();
            madScientist1.join();
            factory.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(madScientist.getCount());
        System.out.println(madScientist1.getCount());
        System.out.println(madScientist.getList());
        System.out.println(madScientist1.getList());
        System.out.println(dump);
        if (madScientist.getCount() > madScientist1.getCount()) {
            System.out.println("madScientist выиграл");
        } else if (madScientist.getCount() < madScientist1.getCount()) {
            System.out.println("madScientist1 выиграл");
        } else {
            System.out.println("Ничья");
        }
        System.out.println("Финишь главного потока");
    }
}


