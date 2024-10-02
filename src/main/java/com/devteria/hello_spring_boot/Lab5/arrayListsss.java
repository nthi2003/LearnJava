package com.devteria.hello_spring_boot.Lab5;

import java.util.ArrayList;

public class arrayListsss {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayList<String> b = new ArrayList<String>() ;
        a.add(2);
        b.add("Linh 2");
        a.add("HEllo");
        a.add("hl");
        System.out.println(a.toString());
        System.out.println(a.get(1));
        System.out.println(a.remove(1));
        System.out.println(a.get(1));

        System.out.println(b.toString());
    }
}
