package com.devteria.hello_spring_boot.Lab03;



public class Bai6 {
    public static void main(String[] args) {


        for ( int i = 1 ; i < 10; i++) {
            for (int j = 2 ; j < 10 ; j++)
            System.out.printf("%d x %d = %d " , j , i , j*i);
            System.out.println("\n");
        }
    }
}
