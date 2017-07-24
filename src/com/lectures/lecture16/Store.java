package com.lectures.lecture16;

import java.util.concurrent.Semaphore;

/**
 * Created by nimf8 on 7/23/2017.
 */
public class Store {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        Kassa [] kassa = {new Kassa(0), new Kassa(1), new Kassa(2)};
        for (int i = 1; i < 25; i++) {
            Customer customer = new Customer(i, new ShoppingBasket(), semaphore, kassa);
            customer.start();
        }

    }

}

