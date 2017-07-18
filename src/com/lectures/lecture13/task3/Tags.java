package com.lectures.lecture13.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nimf8 on 7/18/2017.
 */
public class Tags {
    public static void main(String[] args) {
        String text = "Строятся<p align =\"left\" tt=\"ff\"> </p> новые заводы, появляется <p xml:lang=\"zh\"> </p> все больше автомобилей на дорогах, запускаются ракеты и спутники.";
        Pattern pattern = Pattern.compile("<p.+?=\".+?\">");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceAll("<p>"));

    }
}

