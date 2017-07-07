package com.lectures.lecture8.task6;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by nimf8 on 7/7/2017.
 */
public class SSSS {
    public static void main(String[] args) {
        Set set = new TreeSet();
        Set set1 = new TreeSet();
        for (int i = 0; i < 10; i++) {
            set.add((int)(Math.random() * 20));
            set1.add((int)(Math.random()*20));
        }
        System.out.println(set);
        System.out.println(set1);
    }

    public static Set dfd(){
        
    }
}
