package com.devteria.hello_spring_boot.Lab06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println("2");
        Pattern pattern = Pattern.compile("0\\d{11}");
        Matcher matcher = pattern.matcher("1234565555");
        System.out.println(matcher.matches());
    }
}
