package com.lectures.lecture12.task2;

import lombok.Getter;

import java.io.Serializable;

/**
 * Created by nimf8 on 7/18/2017.
 */
@Getter
public class Computer implements Serializable {
    private int price;
    private String model;
    private String system;

    public Computer(int price, String model, String system) {
        this.price = price;
        this.model = model;
        this.system = system;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getSystem() {
        return system;
    }
}

