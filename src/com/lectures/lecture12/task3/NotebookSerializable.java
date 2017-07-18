package com.lectures.lecture12.task3;

import java.io.*;

/**
 * Created by nimf8 on 7/18/2017.
 */
public class NotebookSerializable {
    public static void main(String[] args) {
        Touchpad touchpad = new Touchpad(21, 44);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("notebook.dat"))) {
            oos.writeObject(new Notebook(700, "ideapad", "Windows", 15.6, 2.3, touchpad));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("notebook.dat"))) {
            Notebook notebook = (Notebook) ois.readObject();
            System.out.println("price - " + notebook.getPrice() + ", model - " + notebook.getModel() + ", system - " + notebook.getSystem() +
                    ", sizeScreen - " + notebook.getSizeScreen() + ", thickness - " + notebook.getThickness() + touchpad);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
