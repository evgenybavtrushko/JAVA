package com.lectures.lecture9;

import java.util.Scanner;

/**
 * Created by nimf8 on 02.07.2017.
 */
public class NotEnterThree {
    public static void main(String[] args) {
        try {
            notEnterThree();
        } catch (EnterThreeException e) {
            e.printStackTrace();
        }
    }
    private static void notEnterThree() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 3) {
            throw new EnterThreeException("Вводить число три почему-то нельзя!!!");

        }
    }
}
