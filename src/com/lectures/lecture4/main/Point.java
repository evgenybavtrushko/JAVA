package com.lectures.lecture4.main;

/**
 * Created by User on 017 17.06.17.
 */
public class Point {
    public static void main(String[] args) {
           }

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point m) {
        return Math.sqrt(x * x + y * y);
    }

    public String toString() {
        return this.x + "  " + this.y;

    }
}
