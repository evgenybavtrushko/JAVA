package com.lectures.lecture12.task3;

import lombok.Getter;

import java.io.Serializable;

/**
 * Created by nimf8 on 7/18/2017.
 */
@Getter
public class Touchpad implements Serializable {
    private double width;
    private double length;

    @Override
    public String toString() {
        return " Touchpad " +
                " width = " + width +
                ", length = " + length;
    }

    public Touchpad(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
