package com.devteria.hello_spring_boot.Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class bai07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử");
        int x = input.nextInt();
        int[] a = new int[x];
        for (int i = 0 ; i < x ; i++ ) {
            a[i] = input.nextInt();
        }
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//        System.out.println(a[0]);
          System.out.println(Arrays.toString(a));
          int max = a[0];
          for (int i = 0 ; i < a.length ; i++) {
                  if(a[i] > max)  max = a[i];

          }
        System.out.println(max);
        int min = a[0];
        for (int i = 0 ; i < a.length ; i++) {
            if(a[i] < min)  min = a[i];

        }
        System.out.println(min);


    }

}
