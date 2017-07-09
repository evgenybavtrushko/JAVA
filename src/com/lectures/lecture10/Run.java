package com.lectures.lecture10;

import com.lectures.lecture10.task1.AdditionOfLines;
import com.lectures.lecture10.task2.Smile;
import com.lectures.lecture10.task3.Word;
import com.lectures.lecture10.task4.Initials;
import com.lectures.lecture10.task5.NumberOfWords;
import com.lectures.lecture10.task6.Replace;
import com.lectures.lecture10.task7.Zero;

/**
 * Created by User on 009 09.07.17.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("Программа выполняет конкатенацию строк в 1-вом случае 10000 итераций 2-ой  stringBuilder.append 1000000");
        AdditionOfLines.main();
        System.out.println("\n Меняет все грустные смайлы с помощью replace ");
        Smile.main();
        System.out.println("\nПроверяет наличие слова в начале и в конце строки");
        Word.main();
        System.out.println("\nВыводит инициалы");
        Initials.main();
        System.out.println("\nСчитает кол-во слов");
        NumberOfWords.main();
        System.out.println("\nЗаменяет последовательно идущие одинаковые символы одним");
        Replace.main();
        System.out.println("\nДобавляет к числу начальные ноли");
        Zero.main();
        System.out.println("\nСпасибо за внимание!!!");
    }
}
