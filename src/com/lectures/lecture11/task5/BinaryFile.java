package com.lectures.lecture11.task5;

import java.io.*;

/**
 * Created by nimf8 on 7/13/2017.
 */
public class BinaryFile {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("text2.bin"))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) (Math.random() * 10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("text2.bin"))) {
            for (int i = 0; i < 20; i++) {
                System.out.print((y = dis.readInt()) + " ");
                x += y;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("\n" + x);
        System.out.println((double) x / 20);

    }
}