package com.lectures.lecture9;

/**
 * Created by nimf8 on 02.07.2017.
 */
public class Fifty {
    public static void main(String[] args) {
        try {
            fifty();
        }
        catch (ArithmeticException ex){
            System.out.println("Нельзя делить на ноль!!!");
        }
        finally {
            System.out.println("finally Выполняется всегда!!!");
        }
    }

    public static void fifty() throws ArithmeticException {
        int x = 9;
        x =  (x / (int)(Math.random()*2));
            }
        }

