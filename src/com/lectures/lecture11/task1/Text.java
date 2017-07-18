package com.lectures.lecture11.task1;

import java.io.*;

/**
 * Created by User on 011 11.07.17.
 */
public class Text {
    public static void main() {
        File file = new File("Text");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        } catch (IOException e) {
            System.out.println("Ошибка ввода выводы");
        }
    }
}