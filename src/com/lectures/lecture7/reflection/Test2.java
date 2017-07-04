package com.lectures.lecture7.reflection;

/**
 * Created by nimf8 on 03.07.2017.
 */
public class Test2 {
    public static void main(String[] args) {

    }
@Transaction
public static void tran(){
    System.out.println("Transaction is started");

}
@Transaction
private double tran2() {
    System.out.println("Transaction is ended");
return 5;
}
@Deprecated
protected String tran3(){
    return " ";
}
}
