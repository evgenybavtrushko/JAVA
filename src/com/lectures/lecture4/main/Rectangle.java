package com.lectures.lecture4.main;

/**
 * Created by User on 017 17.06.17.
 */
public class Rectangle {
    public static void main(String[] args) {
    }

    private Point leftTop;
    Point rightLower;
    int length;
    int width;

    public Rectangle(Point leftTop, Point rightLower) {
        this.leftTop = leftTop;
        this.rightLower = rightLower;
    }

    public int area(Rectangle rectangle) {
        length = Math.abs(leftTop.getX() - rightLower.getX());
        width = Math.abs(rightLower.getY() - leftTop.getY());
        return length * width;
    }

    public double diagonalLlength(Rectangle rectangle) {
        return  Math.sqrt(length * length + width * width);
    }


    public String toString() {
        return this.length + " длина прямоугольника \n" + this.width + " ширина прямоугольника ";
    }
}
