package com.devteria.hello_spring_boot;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Nhập số : " );
        int number = Input.nextInt();
        if (number > 5) {
            System.out.println("đủ qua môn");
        } else {
            System.out.println("rớt");
        }
        System.out.println("Điểm " + number);

    }
}
