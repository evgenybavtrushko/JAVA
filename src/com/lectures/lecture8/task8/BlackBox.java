package com.lectures.lecture8.task8;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by User on 006 06.07.17.
 */
public class BlackBox extends LinkedHashSet {
    Integer k = 0;

    public BlackBox() {
    }
    @Override
    public boolean add(Object o) {
        if(super.add(o)){
            k++;
        }
        return super.add(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return super.addAll(c);
    }

    @Override
    public String toString() {
        return "BlackBox{" +
                "k=" + k +
                "} " + super.toString();
    }
 //   public int der(){

  //  }

    public static void main(String[] args) {
       BlackBox blackBox = new BlackBox();
       blackBox.add(1);
       blackBox.add(2);
       blackBox.add(3);
       blackBox.add(4);
       blackBox.add(5);
       blackBox.add(6);
       BlackBox blackBox1 = new BlackBox();
       blackBox1.addAll(blackBox);
       blackBox1.add(2);
       System.out.println(blackBox);
       System.out.println(blackBox1);


    }
}
