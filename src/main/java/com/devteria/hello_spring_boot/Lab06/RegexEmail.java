package com.devteria.hello_spring_boot.Lab06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    public static void main(String[] args) {
        System.out.println("");
        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
        Matcher matcher = pattern.matcher("quocthi@gma.vn");
        System.out.println(matcher.matches());
    }
}
