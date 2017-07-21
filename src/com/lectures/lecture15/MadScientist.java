package com.lectures.lecture15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nimf8 on 7/20/2017.
 */
public class MadScientist extends Thread {
    private List<Details> list = new ArrayList<>();
    private int count;
    private static final List<Details> robot = new ArrayList<>();

    public void run() {
        System.out.println("Старт потока УЧЕНЫЙ");
        for (int i = 0; i <= 100; i++) {
            list.add(Test.dump.pickUpInTheDump());
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (list.containsAll(robot)) {
                list.removeAll(robot);
                count++;
            }
        }
        System.out.println("Финишь потока УЧЕНЫЙ");
    }

    public List<Details> getList() {
        return list;
    }

    public void setList(List<Details> list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static List<Details> getRobot() {
        return robot;
    }

    public MadScientist() {
        for (int i = 0; i < Details.values().length; i++) {
            robot.add(Details.values()[i]);
        }

    }
}

