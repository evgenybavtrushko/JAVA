package com.lectures.lecture13.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nimf8 on 7/18/2017.
 */
public class HexadecimalNumber {
    public static void main(String[] args) {
        String hexadecimal = "Строятся новые 0x4A43F заводы, появ 0Xf23ляется все бол0x43F ьше 0X44a3b автомобилей на дорогах, запускаются ракеты и спутники.";
        Pattern pattern = Pattern.compile("\\b-?0[xX][\\dA-fa-f]+\\b");
        Matcher matcher = pattern.matcher(hexadecimal);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
