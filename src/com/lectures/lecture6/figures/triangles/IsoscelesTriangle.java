package com.lectures.lecture6.figures.triangles;

/**
 * Created by User on 030 30.06.17.
 */
public class IsoscelesTriangle extends EquilateralTriangle {

    public static String getName() {
        return name;
    }

    private static String name = "Равнобедренный треугольньк";
    private int base;

    public IsoscelesTriangle(int side, int base) {
        super(side);
        this.base = base;
    }

    @Override
    public double getHeight() {
        return Math.sqrt(Math.pow(getSide(), 2) - (Math.pow(base, 2) / 4));
    }

    @Override
    public double getPerimeter() {
        return base + getSide() * 2;
    }

    @Override
    public double getArea() {
        return (base * (Math.sqrt(Math.pow(getSide(), 2) - (Math.pow(base, 2) / 4)))) / 2;
    }

    @Override
    public String toString() {
        return "" + name + "\nоснование " + base + "\nсторона  " + getSide() + "\nпериметр " + getPerimeter() + "\nплощадь "
                + getArea() + "\nвысота " + getHeight();
    }
}
