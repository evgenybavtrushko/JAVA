package com.lectures.lecture6.figures.triangles;

import com.lectures.lecture6.figures.Figure;
import com.lectures.lecture6.figures.Interfaces.GetHeight;
import com.lectures.lecture6.figures.Interfaces.GetPerimeterAndArea;

/**
 * Created by User on 029 29.06.17.
 */
public class EquilateralTriangle extends Figure implements GetPerimeterAndArea, GetHeight {

    private static String name = "Равносторонний треугольньк";

    public static String getName() {
        return name;
    }

    private int side;

    public EquilateralTriangle(int side) {
        this.side = side;
    }

    @Override
    public double getHeight() {
        return (side * Math.sqrt(3)) / 2;
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }

    @Override
    public double getArea() {
        return (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "" + name + "\nсторона  " + side + "\nпериметр " + getPerimeter() + "\nплощадь "
                + getArea() + "\nвысота " + getHeight();
    }
}

