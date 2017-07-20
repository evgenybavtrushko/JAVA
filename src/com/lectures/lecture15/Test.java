package com.lectures.lecture15;

/**
 * Created by nimf8 on 7/20/2017.
 */
public class Test {
    public static void main(String[] args) {
        Dump dump = new Dump();
        System.out.println(dump);

        dump.throwAwayOfTheDump();
        System.out.println(dump);
int i = 0;
      while (!(dump.dumpIsEmpty())) {
          dump.pickUpInTheDump();
                  i++;
      }
        System.out.println(dump);
        System.out.println(i);

    }
}
