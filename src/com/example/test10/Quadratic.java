package com.example.test10;

import java.util.Scanner;

/**
 * Created by User on 013 13.06.17.
 */
public class Quadratic {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();
        System.out.println("Введите число с");
        int c = in.nextInt();

        int dis = discriminant(a, b, c);
        System.out.println(dis);

        if (isPositive(dis)){
            System.out.println("Корней нет - дискриминант отрицательный");
        }
        else if (isZero(dis)){
            System.out.println("Дискриминант равен 0 - корень равен " + (-b + Math.sqrt(dis)/2*a));
        }
        else {
            System.out.println("Дискриминант положительный - два корня\n первый "  + ((-b + Math.sqrt(dis))/(2*a)) + "\n второй " + ((-b - Math.sqrt(dis))/(2*a)));
        }
    }
        public static int discriminant(int a, int b, int c) {
            int dis = b * b - 4 * a * c;
            return dis;
        }
        public static boolean isPositive(int a){
            return (a < 0);
        }
        public static boolean isZero(int a){
            return (a == 0);
        }
}