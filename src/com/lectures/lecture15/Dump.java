package com.lectures.lecture15;

import java.util.Stack;

/**
 * Created by nimf8 on 7/20/2017.
 */
public class Dump {
    private Stack<Details> details = new Stack<>();

    public boolean dumpIsEmpty() {
        return this.details.empty();
    }


    public void throwAwayOfTheDump() {
        this.details.push(Details.values()[(int) (Math.random() * Details.values().length)]);
    }

    public Details pickUpInTheDump() {
        return this.details.pop();
    }

    public Dump() {
        for (int i = 0; i < 20; i++) {
            this.details.push(Details.values()[(int) (Math.random() * Details.values().length)]);
        }
    }

    @Override
    public String toString() {
        return "Dump{" +
                "details=" + details +
                '}';
    }
}
