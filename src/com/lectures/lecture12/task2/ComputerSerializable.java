package com.lectures.lecture12.task2;

import java.io.*;

/**
 * Created by nimf8 on 7/18/2017.
 */

public class ComputerSerializable {
    public static void main() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("computer.dat"))) {
            oos.writeObject(new Computer(700, "ideapad", "Windows"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("computer.dat"))) {
            Computer computer = (Computer) ois.readObject();
            System.out.println("price - " + computer.getPrice() + " model - " + computer.getModel() + " system - " + computer.getSystem());
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


