package com.lectures.lecture16;

/**
 * Created by nimf8 on 7/23/2017.
 */
public class Kassa extends Thread {
    private int id;


    boolean flag = true;

    public boolean isFlag() {
        return flag;
    }

    public Kassa(int id) {
        this.id = id;
    }

    public synchronized void calculation(Customer customer) {
        flag = false;
        StringBuilder stringBuilder = new StringBuilder();

        while (!(customer.shoppingBasket.iSEmpty())) {
            String str = String.valueOf(customer.getOutOfTheBasket());
            stringBuilder.append(str).append(" ");
            System.out.println("Касса " + id + " пробивает " + " " + str);
          try {
               sleep(10);
          } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Касса " + id + " выдает чек " + stringBuilder + "покупателю " + customer.id);
        flag = true;
    }

}

