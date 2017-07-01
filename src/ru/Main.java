package ru;

/**
 * Created by User on 001 01.07.17.
 */
public class Main {
    private static OrderLogic logic;

    public static void main(String[] args) {
        logic = new OrderLogic();
        logic.doOrder();
    }
}
