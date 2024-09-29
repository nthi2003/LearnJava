package com.devteria.hello_spring_boot.Lab03;

import java.util.Arrays;

public class Bai04 {
    public static void main(String[] args) {
        int[] clus = {3 , 2 , 6 , 5 , 1};
        for (int i = 0 ; i < clus.length - 1 ; i++) {
                for (int j = i + 1 ; j < clus.length ; j++) {
                   if(clus[i] > clus[j]) {
                       int temp = clus[i];
                       clus[i] = clus[j];
                       clus[j] = temp;
                   }
                }
        }
        System.out.println(Arrays.toString(clus));


    }
}
