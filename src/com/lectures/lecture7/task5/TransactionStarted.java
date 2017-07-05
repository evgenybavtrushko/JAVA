package com.lectures.lecture7.task5;

import java.lang.reflect.InvocationTargetException;

import static com.lectures.lecture7.task5.AnalyzerTransaction.transaction;

/**
 * Created by nimf8 on 05.07.2017.
 */
public class TransactionStarted {
    public static void main(String[] args) {

        Test2 test2 = new Test2();
        try {
            transaction(test2);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
