package com.example.rundom;//package com.example.practice3;

/**
 * Created by user on 14.06.2017.
 */
public class RandomNumbers {
    public static void main(String[] args) {
        int marks[] = new int[4];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) ((Math.random() * 9 + 1) * 10);
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < marks.length - 1; i++) {
            if (marks[i] < marks[i + 1]) {
                count++;
            }
        }
        if (count == 3) {
            System.out.println("\nМассив строго возрастающий");
        } else {
            System.out.println("\nМассив не возрастающий");
        }
    }
}
