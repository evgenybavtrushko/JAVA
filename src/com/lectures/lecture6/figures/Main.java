package com.lectures.lecture6.figures;

import com.lectures.lecture6.figures.Quadrangles.Rectangle;
import com.lectures.lecture6.figures.Quadrangles.Square;
import com.lectures.lecture6.figures.circles.Circle;
import com.lectures.lecture6.figures.circles.Ellipse;
import com.lectures.lecture6.figures.triangles.EquilateralTriangle;
import com.lectures.lecture6.figures.triangles.IsoscelesTriangle;

/**
 * Created by User on 029 29.06.17.
 */
public class Main {


    public static void main(String[] args) {
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10,20);
        Circle circle = new Circle(5);
        Ellipse ellipse = new Ellipse(10,5);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(10);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(10,15);

        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(ellipse);
        System.out.println(equilateralTriangle);
        System.out.println(isoscelesTriangle);

        System.out.println(toString(square.areaEquel(rectangle)));
        System.out.println(toString(square.areaEquel(circle)));
        System.out.println(toString(square.areaEquel(ellipse)));
        System.out.println(toString(square.areaEquel(equilateralTriangle)));
        System.out.println(toString(square.areaEquel(isoscelesTriangle)));
        System.out.println(toString(circle.areaEquel(rectangle)));
        System.out.println(toString(circle.areaEquel(ellipse)));
        System.out.println(toString(circle.areaEquel(equilateralTriangle)));
        System.out.println(toString(circle.areaEquel(isoscelesTriangle)));
        System.out.println(toString(equilateralTriangle.areaEquel(isoscelesTriangle)));

        ShapeUtils.whatAFigure(isoscelesTriangle);
        ShapeUtils.whatAFigure(equilateralTriangle);
    }

    private static boolean toString(boolean b) {
        return b;
    }
}
