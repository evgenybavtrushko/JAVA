package com.lectures.lecture14.task2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nimf8 on 7/19/2017.
 */
public class String8 {
    public static void main() {
        List<String> strings = Arrays.asList("Экология Земли", "Экология", "Экология Земли", "Земли", "автомобиль", "Экология Земли",
                "автомобиль", "летит самолет");
        int x =
                (int) strings
                        .stream()
                        .filter(str -> str.length() > 8 )
                        .distinct()
                        .count();
        System.out.println(x);

    }
}
