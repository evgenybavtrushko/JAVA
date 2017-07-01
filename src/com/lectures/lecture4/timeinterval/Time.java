package com.lectures.lecture4.timeinterval;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 017 17.06.17.
 */
public class Time {
    public static void main(String[] args) throws IOException {
        int difference = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество часов, минут и секунд промежутка времени ");
        int hour = Integer.parseInt(reader.readLine());
        int min = Integer.parseInt(reader.readLine());
        int sec = Integer.parseInt(reader.readLine());

        TimeInterval time1 = new TimeInterval(hour,min,sec);

        System.out.println("Введите количество часов, минут и секунд промежутка времени ");
        int hour2 = Integer.parseInt(reader.readLine());
        int min2 = Integer.parseInt(reader.readLine());
        int sec2 = Integer.parseInt(reader.readLine());

        TimeInterval time2 = new TimeInterval(hour2, min2, sec2 );

        if(time1.numberOfSeconds(time1) > time2.numberOfSeconds(time2)){
            difference = time1.numberOfSeconds(time1) - time2.numberOfSeconds(time2);
        }
        else{
            difference = time2.numberOfSeconds(time2) - time1.numberOfSeconds(time1);
        }

        TimeInterval time3 = new TimeInterval(difference);
        time3.numberOfSeconds(time3);
        time3.dataOutput(time3);
    }
}
