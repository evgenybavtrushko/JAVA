package com.lectures.lecture11;

import com.lectures.lecture11.task1.Text;
import com.lectures.lecture11.task2.Vowels;
import com.lectures.lecture11.task3.LastFirst;
import com.lectures.lecture11.task4.LargestNumber;
import com.lectures.lecture11.task5.BinaryFile;
import com.lectures.lecture11.task6.ListFile;
import com.lectures.lecture11.task7.JavaCode;

/**
 * Created by nimf8 on 7/14/2017.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("Выводится файл с многострочным текстом");
        Text.main();
        System.out.println("\nВыводятся все слова начинающиеся с гласной буквы");
        Vowels.main();
        System.out.println("\nВыводится пара слов поседняя буква совпадает с первой");
        LastFirst.main();
        System.out.println("\nВыводится наибольшее число цифр идущих подряд в каждой строке.");
        LargestNumber.main();
        System.out.println("\n20 случайных чисел записывается в бинарный файл. Выводится на консоль. Среднее.");
        BinaryFile.main();
        System.out.println("\nСписок файлов и катологов");
        ListFile.main();
        System.out.println("\nКаждая строка в обратном порядке");
        JavaCode.main();
    }
}
