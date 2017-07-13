package com.lectures.lecture11.task6;

import java.io.File;

/**
 * Created by nimf8 on 7/13/2017.
 */
public class ListFile {
    public static void main(String args[]) {
        String x[] = new File("c:/Windows").list();
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]);
    }
}