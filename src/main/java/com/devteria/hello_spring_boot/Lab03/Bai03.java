package com.devteria.hello_spring_boot.Lab03;

import java.util.Arrays;

public class Bai03 {
    public static void main(String[] args) {
        String[] nyc = {"anh" , "mẫn"} ;
        nyc[0] = "linh";
        String[] nyc2 = new String[5];
        nyc2[0] = "Thi";
        System.out.println(nyc2[0]);
        System.out.println(Arrays.toString(nyc));
        String[] cars = {"bmw" , "sh" , "tt" , "xzz"};
        for(int i = 0 ; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
