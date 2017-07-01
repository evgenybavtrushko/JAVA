package com.lectures.lecture4.timeinterval;

/**
 * Created by User on 015 15.06.17.
 */
public class TimeInterval {
    public static void main(String[] args) {
        TimeInterval time1 = new TimeInterval(6, 1, 52);
        TimeInterval time2 = new TimeInterval(5656);
        time1.numberOfSeconds(time1);
        time2.numberOfSeconds(time2);
        time1.dataOutput(time1);
        time2.dataOutput(time2);
    }

    private int sec;
    private int min;
    private int hour;
    private int allSec;

    TimeInterval(int sec) {
        this.sec = sec % 60;
        int m = sec / 60;
        this.min = m % 60;
        this.hour = m / 60;

    }

    TimeInterval(int hour, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int numberOfSeconds(TimeInterval m) {
        allSec = sec + min * 60 + hour * 60 * 60;
        return allSec;

    }

    public void dataOutput(TimeInterval m) {
        System.out.println(m);
    }

    public String toString() {
        return this.hour + " часов " + this.min + " минут " + this.sec + " секунд\n" + this.allSec + " всего секунд";

    }
}
