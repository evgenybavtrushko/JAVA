package com.lectures.lecture9;

import java.util.Scanner;

/**
 * Created by nimf8 on 02.07.2017.
 */
public class ScannerFive {
    public static void main(String[] args) {

        try {
            scannerF();
        } catch (ScannerFiveException e) {
            e.printStackTrace();
        }
    }

    public static void scannerF() throws ScannerFiveException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 5) {
                throw new ScannerFiveException();
            }
        }
    }
}
