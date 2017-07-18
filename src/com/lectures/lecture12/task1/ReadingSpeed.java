package com.lectures.lecture12.task1;

import java.io.*;

/**
 * Created by nimf8 on 7/14/2017.
 */
/*public class ReadingSpeed {
    public static void main(String[] args) {
        long startWrite = System.currentTimeMillis();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("5Mb"))) {
            {while (bufferedWriter)
            bufferedWriter.write(5);
        }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        long finishWrite = System.currentTimeMillis();

        long startRead = System.currentTimeMillis();

        try (DataInputStream dis = new DataInputStream((new FileInputStream("5Mb")))) {
            for (int i = 0; i < 5000; i++) {
                dis.read();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        long finishRead = System.currentTimeMillis();

        System.out.println("Запись по байтам " + (finishWrite - startWrite));
        System.out.println("Чтение по байтам " + (finishRead - startRead));

        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(new FileInputStream("5Mb"))) {
            inputStream.read();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream(new FileInputStream("5Mb +"))) {
            for (int i = 0; i < 5000; i++) {
                outputStream.write();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
*/