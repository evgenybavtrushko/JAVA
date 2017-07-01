package com.example.butterfly;//package com.example.practice3;

/**
 * Created by user on 14.06.2017.
 */
public class Butterfly {
    public static void main(String[] args) {
        String butterfly[][] = new String[5][5];
        for (int i = 0; i < butterfly.length / 2 + 1; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                if ((j < i) || (j >= (butterfly[i].length - i)))
                    butterfly[i][j] = "0";
                else
                    butterfly[i][j] = "1";
            }
        }
        for (int i = butterfly.length - 1; i >= butterfly.length / 2 + 1; i--) {
            for (int j = 0; j < butterfly[i].length; j++) {
                if ((j < (butterfly[i].length - 1 - i)) || (j > i))
                    butterfly[i][j] = "0";
                else
                    butterfly[i][j] = "1";
            }
        }
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                System.out.print(butterfly[i][j]);
            }
            System.out.println(" ");
        }
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                if (butterfly[i][j] == "1") {
                    butterfly[i][j] = "*";
                } else {
                    butterfly[i][j] = " ";
                }
            }
        }
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                System.out.print(butterfly[i][j]);
            }
            System.out.println();
        }
    }

}
