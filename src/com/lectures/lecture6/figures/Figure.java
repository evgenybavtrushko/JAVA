package com.lectures.lecture6.figures;

import com.lectures.lecture6.figures.Interfaces.GetPerimeterAndArea;

/**
 * Created by User on 029 29.06.17.
 */
public abstract class Figure implements GetPerimeterAndArea {

    public boolean areaEquel(Figure figure) {
        if (Math.round(figure.getArea()) == Math.round(this.getArea())) {
            return true;
        } else {
            return false;
        }

    }
}
