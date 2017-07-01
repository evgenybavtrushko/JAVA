package com.lectures.lecture4.main;

/**
 * Created by User on 017 17.06.17.
 */
public class Main {
    public static void main(String[] args) {
        Point leftTop = new Point(10, 30);
        Point rightLower = new Point(5, 35);
        leftTop.distance(leftTop);
        rightLower.distance(rightLower);

        Rectangle rectangle = new Rectangle(leftTop, rightLower);
        rectangle.area(rectangle);
        rectangle.diagonalLlength(rectangle);
        System.out.println(rectangle);


        System.out.println(rectangle.area(rectangle) + "  площадь прямоугольника \n"
                + rectangle.diagonalLlength(rectangle) + " диоганаль прямоугольника");
    }

}
