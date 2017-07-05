package com.lectures.lecture7.task5;

/**
 * Created by nimf8 on 03.07.2017.
 */
public class Test2 {

    @Transaction
    public static void tran() {
        System.out.println("Transaction is started");
    }

    @Transaction
    public double tran2() {
        System.out.println("Transaction is ended");
        return 5;
    }

    @Deprecated
    protected String tran3() {
        return " ";
    }
}
