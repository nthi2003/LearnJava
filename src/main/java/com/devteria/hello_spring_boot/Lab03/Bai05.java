package com.devteria.hello_spring_boot.Lab03;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("tìm số nguyễn tố");
        int number = input.nextInt();

        int count = 0;
        for ( int i = 2 ; i < number - 1 ; i++) {
            if(number % i == 0) {
                System.out.println("ước số khác" + i);
                count++;
                break;

            }
        }
        if (count == 0) {
            System.out.printf("%d là số nguyên tố" , number);
        } else {
            System.out.printf("%d  k là số nguyên tố" , number);
        }
    }
}
