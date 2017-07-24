package com.lectures.lecture16;

import java.util.Stack;

/**
 * Created by nimf8 on 7/23/2017.
 */
public class ShoppingBasket {

    Stack<Good> products = new Stack<>();

    public boolean iSEmpty() {
        return products.isEmpty();
    }

    public void putIn(Good product) {
        products.add(product);
    }

    public Good getOut() {
        if (products.isEmpty()) {
            System.out.println("В корзине нет товаров");
            return null;
        } else {
            return products.pop();
        }
    }
}