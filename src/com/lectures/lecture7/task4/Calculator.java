package com.lectures.lecture7.task4;

import java.math.BigDecimal;

/**
 * Created by User on 030 30.06.17.
 */
public class Calculator<T extends Number, V extends Number> {
    private BigDecimal a;
    private BigDecimal b;

    public Calculator(T a, V b) {
        this.a = new BigDecimal(a.toString());
        this.b = new BigDecimal(b.toString());
    }

    public BigDecimal multiplication(Calculator calculator) {
        return a.multiply(b);
    }

    public BigDecimal division(Calculator calculator) {
        return a.divide(b,8,3);
    }

    public BigDecimal addition(Calculator calculator) {
        return a.add(b);
    }

    public BigDecimal difference(Calculator calculator) {
        return a.subtract(b);
    }
}
