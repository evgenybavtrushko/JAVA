package com.lectures.lecture6.figures;

import com.lectures.lecture6.figures.Quadrangles.Square;
import com.lectures.lecture6.figures.circles.Circle;
import com.lectures.lecture6.figures.triangles.EquilateralTriangle;

/**
 * Created by User on 030 30.06.17.
 */
public final class ShapeUtils {
    public static void whatAFigure(Figure figure) {

        if (figure instanceof Square) {
            System.out.println("Фигура является прямоугольником");

        } else if (figure instanceof EquilateralTriangle) {
            System.out.println("\nФигура является треугольником");

        } else if (figure instanceof Circle) {
            System.out.println("\nФигура является окружностью");

        } else {
            System.out.println("Фигура не извесна");
        }
    }
}

