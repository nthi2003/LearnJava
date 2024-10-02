package com.devteria.hello_spring_boot.lab02;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Nhập cạnh : ");
        int canh = Input.nextInt();
        System.out.println("Thể tích : " + Math.pow(3 , canh));



    }
}
