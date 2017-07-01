package com.example.test;

/**
 * Created by User on 011 11.06.17.
 */
public class HelloWorld{
    public static void main(String[] args){
        int s = 3745698, sec, m, min, h, hour, d, day, w, week;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        w = (d - day) / 7;
        System.out.println(w + " Недель \n " + day + " дней \n " + hour + " часов\n " + min + " минут \n " + sec + " секунд \n ");
    }
}

