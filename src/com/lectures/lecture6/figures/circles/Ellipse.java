package com.lectures.lecture6.figures.circles;

/**
 * Created by User on 029 29.06.17.
 */
@Deprecated
public class Ellipse extends Circle {

    public static String getName() {
        return name;
    }

    private static String name = "Элипс";
@Deprecated
    private int radiusMin;

    public Ellipse(int radius, int radiusMin) {
        super(radius);
        this.radiusMin = radiusMin;
    }

    @Override
    public double getPerimeter() {
        return 4 * (Math.PI * getRadius() * radiusMin + (getRadius() - radiusMin) * (getRadius() - radiusMin)) / (radiusMin + getRadius());
    }

    @Override
    public double getArea() {
        return Math.PI * radiusMin * getRadius();
    }

    @Override
    public String toString() {
        return "" + name + "\nменьший радиус " + radiusMin + " " + "\nрадиус  " + getRadius() + "\nдлинна окружности " + getPerimeter() + "\nплощадь "
                + getArea();
    }
}
