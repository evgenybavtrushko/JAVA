package com.lectures.lecture6.figures.circles;

import com.lectures.lecture6.figures.Figure;
import com.lectures.lecture6.figures.Interfaces.GetPerimeterAndArea;

/**
 * Created by User on 029 29.06.17.
 */

public class Circle extends Figure implements GetPerimeterAndArea {

    private static String name = "Окружность";
    private int radius;

    public static String getName() {
        return name;
    }

    public Circle(int radius) {

        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "" + name + "\nрадиус  " + radius + "\nдлинна окружности " + getPerimeter() + "\nплощадь "
                + getArea();
    }
}