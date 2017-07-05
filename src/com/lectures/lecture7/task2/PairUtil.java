package com.lectures.lecture7.task2;

import com.lectures.lecture7.task1.Pair;

/**
 * Created by User on 030 30.06.17.
 */
public final class PairUtil {
    public static void main() {
        Pair pair = new Pair(10, "ff");
        System.out.print(pair.val + "  ");
        System.out.println(pair.val2);
        swap(pair);
        System.out.print(pair.val + "  ");
        System.out.println(pair.val2);
    }

    public static < K > Pair swap(Pair pair){
        K s = (K) pair.val;
        pair.val = pair.val2;
        pair.val2 = s;
        return pair;
    }
}
