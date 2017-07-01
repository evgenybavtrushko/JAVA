package com.lectures.lecture6.figures.Quadrangles;

import com.lectures.lecture6.figures.Figure;
import com.lectures.lecture6.figures.Interfaces.GetDiagonal;
import com.lectures.lecture6.figures.Interfaces.GetPerimeterAndArea;

/**
 * Created by User on 029 29.06.17.
 */
public class Square extends Figure implements GetPerimeterAndArea, GetDiagonal {

    public static void setName(String name) {
        Square.name = name;
    }

    public static String getName() {
        return name;
    }

    private static String name = "Квадрат";
    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(2) * width;
    }

    @Override
    public double getPerimeter() {
        return width * 4;
    }

    @Override
    public double getArea() {
        return width * width;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "" + name + "\nсторона  " + width + "\nпериметр " + getPerimeter() + "\nплощадь "
                + getArea() + "\nдиагональ " + getDiagonal();
    }
}
