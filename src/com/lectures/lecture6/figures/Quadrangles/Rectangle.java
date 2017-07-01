package com.lectures.lecture6.figures.Quadrangles;

/**
 * Created by User on 029 29.06.17.
 */
public class Rectangle extends Square {

    public static String getName() {
        return name;
    }

    private static String name = "Прямоугольник";
    private int height;

    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(height, 2));
    }

    @Override
    public double getPerimeter() {
        return height * 2 + getWidth() * 2;
    }

    @Override
    public double getArea() {
        return height * getWidth();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "" + name + "\nсторона " + height +
                " " + "\nсторона  " + getWidth() + "\nпериметр " + getPerimeter() + "\nплощадь "
                + getArea() + "\nдиагональ " + getDiagonal();
    }
}
