package com.lectures.lecture12.task1;

import java.io.*;

/**
 * Created by nimf8 on 7/14/2017.
 */
public class ReadingSpeed {
    public static void main() {
        File file = new File("5Mb");
        String str = "";
        long finishWriteBuffered = 0;
        long startWriteBuffered = 0;
        long finishReadBuffered = 0;
        long startReadBuffered = 0;

        long startRead = 0;
        long startWrite = 0;
        long finishWrite = 0;
        long finishRead = 0;



        startWrite = System.currentTimeMillis();
        try (FileWriter fileWriter = new FileWriter(file)) {
            while (file.length() < 5000000) {
                fileWriter.write("str");
            }
            finishWrite = System.currentTimeMillis();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fileReader = new FileReader(file)) {
            startRead = System.currentTimeMillis();
            int c = 0;
            while ((c = fileReader.read()) != -1)
                finishRead = System.currentTimeMillis();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file5Mb"))) {
            startReadBuffered = System.currentTimeMillis();
            str = bufferedReader.readLine();
            finishReadBuffered = System.currentTimeMillis();

            startWriteBuffered = System.currentTimeMillis();
            bufferedWriter.write(str);
            finishWriteBuffered = System.currentTimeMillis();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(finishWrite - startWrite);
        System.out.println(finishRead - startRead);

        System.out.println(finishWriteBuffered - startWriteBuffered);
        System.out.println(finishReadBuffered - startReadBuffered);
    }
}
