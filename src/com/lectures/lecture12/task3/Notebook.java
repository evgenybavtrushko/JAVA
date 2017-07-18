package com.lectures.lecture12.task3;

import com.lectures.lecture12.task2.Computer;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by nimf8 on 7/18/2017.
 */
@Getter
public class Notebook extends Computer implements Serializable{
    private double sizeScreen;
    Touchpad touchpad;
    transient private double thickness;


    public Notebook(int price, String model, String system, double sizeScreen, double thickness, Touchpad touchpad){
        super(price, model, system);
        this.sizeScreen = sizeScreen;
        this.thickness = thickness;
        this.touchpad = touchpad;
    }

    public double getSizeScreen() {
        return sizeScreen;
    }

    public Touchpad getTouchpad() {
        return touchpad;
    }

    public double getThickness() {
        return thickness;
    }
}
