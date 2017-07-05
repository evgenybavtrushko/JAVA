package com.lectures.lecture7.task6;

import com.lectures.lecture6.figures.circles.Circle;
import com.lectures.lecture6.figures.circles.Ellipse;

/**
 * Created by nimf8 on 03.07.2017.
 */
public class Test {
    public static void main() {
        Class cl = Ellipse.class;
        Circle circle = new Circle(33);
        ClassAnalyzer.analyze(cl);
        ClassAnalyzer.analyze(circle);
        ClassAnalyzerImproved.analyze(circle);
    }
}
