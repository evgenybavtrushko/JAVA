package com.example.youtube;

import java.util.*;

/**
 * Created by User on 004 04.07.17.
 */
public class SortSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        set.remove(3);
        set.remove(4);
        set.remove(8);
        set.remove(3);
        System.out.println(set);
        SortedSet<Integer> set1 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set1.add(i);
        }
        Boolean a = true;
        System.out.println(set1);
        System.out.println(set.subSet(5,10));
        System.out.println(set);
        System.out.println(set1);
    }
}

 //  Integer getNextElem(Integer elem){


  //     return
  //  }
  //  Set<Integer> getPtevElems(Integer elem){
  //      return
  //  }


