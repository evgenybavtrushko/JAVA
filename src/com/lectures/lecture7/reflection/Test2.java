package com.lectures.lecture7.reflection;

/**
 * Created by nimf8 on 03.07.2017.
 */
public class Test2 {
    public static void main(String[] args) {

    }
@Transaction
public static void tran(){

}
@Transaction
private double tran2() {
return 5;
}
@Deprecated
protected String tran3(){
    return " ";
}
}
