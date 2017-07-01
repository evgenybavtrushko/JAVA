package com.example.test9;

import java.util.Scanner;

/**
 * Created by User on 013 13.06.17.
 */
public class Words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите два слова");
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        if (word1.equals(word2)){
            System.out.println("Отлично! Слова одинаковы");
        }
        else if (word1.equalsIgnoreCase(word2)){
            System.out.println("Хорошо. Почти одинаковы");
        }
        else if (word1.length() == word2.length()){
            System.out.println("Ну, хотя бы они одной длины");
        }
        else{
            System.out.println("Слова разной длинны!!!");
        }

    }
}
