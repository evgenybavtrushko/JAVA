package com.lectures.lecture8;

import com.lectures.lecture8.lecture82.task1.Count;
import com.lectures.lecture8.lecture82.task2.Unique;
import com.lectures.lecture8.lecture82.task3.Polynomial;
import com.lectures.lecture8.task4.FrequencyDictionary;
import com.lectures.lecture8.task5.Stack;
import com.lectures.lecture8.task6.Sett;
import com.lectures.lecture8.task7.Reverse;
import com.lectures.lecture8.task8.BlackBox;

/**
 * Created by User on 008 08.07.17.
 */
public class Run2 {
    public static void main(String[] args) {
        System.out.println("Частотный словарь. Слова выводятся в алфавитном порядке");
        FrequencyDictionary.main();
        System.out.println("\nЦифры числа заносятся в стек. Выводится число с цифрами в обратном порядке");
        Stack.main();
        System.out.println("\nВыводится два случайных множества. Их объединение. Их пересечение");
        Sett.main();
        System.out.println("\nВыводится случайное множество. Тоже множество отрицательные цифры в конце");
        Reverse.main();
        System.out.println("\nСоздаётся множество выводится к-ый по минимальности и n-ый по максимальности член");
        BlackBox.main();
        System.out.println("\nЦелочисленный список. Кол-во уникальных элементов. 0 при получении пустого списка");
        Count.main();
        System.out.println("\nВыводится Map и false если есть одинаковые значения значения ");
        Unique.main();
        System.out.println("\nВыводятся две HashMap содержащие многочлены. Сумма этих многочленов");
        Polynomial.main();
    }
}
