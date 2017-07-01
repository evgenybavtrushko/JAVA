package com.lectures.lecture7;

/**
 * Created by User on 030 30.06.17.
 */
public class Pair<K, V> {
    private K val;
    private V val2;

    public Pair(K val, V val2) {
        this.val = val;
        this.val2 = val2;
    }

    public K getVal() {
        return val;
    }

    public void setVal(K val) {
        this.val = val;
    }

    public V getVal2() {
        return val2;
    }

    public void setVal2(V val2) {
        this.val2 = val2;
    }
}
