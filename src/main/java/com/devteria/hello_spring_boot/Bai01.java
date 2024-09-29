package com.devteria.hello_spring_boot;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhập chiều  dài : " );
        int D = Scanner.nextInt();
        System.out.println("Nhập chiều  rộng : " );
        int R = Scanner.nextInt();
        System.out.println("Chi vi hình :  " + ( D * R) * 2 );
        System.out.println("Diện tích  :  " + D * R );
        System.out.println("Cạnh nhỏ nhất  :  " + Math.min(D , R) );
    }
}
