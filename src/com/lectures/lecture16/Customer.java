package com.lectures.lecture16;

import java.util.concurrent.Semaphore;

/**
 * Created by nimf8 on 7/23/2017.
 */
public class Customer extends Thread {
    int id;
    ShoppingBasket shoppingBasket;
    Semaphore semaphore;
    Kassa[] kassa;


    public Customer(int id, ShoppingBasket shoppingBasket, Semaphore semaphore, Kassa[] kassa) {
        this.id = id;
        this.shoppingBasket = shoppingBasket;
        this.semaphore = semaphore;
        this.kassa = kassa;
    }

    public Good getOutOfTheBasket() {
        if (!(shoppingBasket.iSEmpty())) {
            return shoppingBasket.getOut();
        }
        return null;
    }

    public void run() {
        System.out.println("Покупатель " + id + " зашел в магазин");
        int x = (int) (Math.random() * 6);
        for (int i = 0; i < x; i++) {
            Good product = Good.values()[(int) (Math.random() * Good.values().length)];
            int y = (int) ((Math.random() * 2) + 1);
            System.out.println("Покупатель " + id + " ложит в корзину продукт " + product + " в кол-ве " + y);
            for (int j = 0; j < y; j++) {
                shoppingBasket.putIn(product);
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (shoppingBasket.iSEmpty()) {
            System.out.println("Покупатель " + id + " покидает магазин ничего не купив");
        } else {
            System.out.println("Покупатель " + id + " становится в очередь на кассу");
 //           StringBuilder stringBuilder = new StringBuilder();

            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 3; i++) {
                if (kassa[i].isFlag()) {
                    System.out.println("Покупатель " + id + " встал в кассу " + i);
                    kassa[i].calculation(this);
                }
            }
/*            while (!(shoppingBasket.iSEmpty())) {
                String str = String.valueOf(getOutOfTheBasket());
                stringBuilder.append(str).append(" ");
                System.out.println("Касса пробивает " + str + " покупателю " + id);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Касса выдает чек покупателю  " + id + " : " + stringBuilder);
*/
            semaphore.release();
            System.out.println("Покупатель " + id + " выходит из магазина");

        }
    }
}

