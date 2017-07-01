package com.lectures.lecture3.equals;

/**
 * Created by User on 015 15.06.17.
 */
public class Equals {
    public static void main(String[] args) {
        String marks1[][] = new String[10][10];
       // marks1[2][3]= "df";
        String marks2[][] = new String[10][10];
        equals(marks1, marks2);

    }
    public static boolean equals(String[][] marks1, String[][] marks2){
        boolean b = true;

        for (int i = 0; i < marks1.length; i++){
            for(int j =0; j< marks1[0].length; j++){
                if(marks1[i][j] != marks2[i][j]){
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b);
    return b;
    }
    public static boolean equals(int [][] marks1, int[][] marks2) {
        boolean b = true;

        for (int i = 0; i < marks1.length; i++) {
            for (int j = 0; j < marks1[0].length; j++) {
                if (marks1[i][j] != marks2[i][j]) {
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b);
        return b;
    }
}
