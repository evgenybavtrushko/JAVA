package ru;
import lombok.Getter;
/**
 * Created by User on 001 01.07.17.
 */
public class Main {
    @Getter
    private static OrderLogic logic;

    public static void main(String[] args) {
        logic = new OrderLogic();
        logic.doOrder();
    }
}
