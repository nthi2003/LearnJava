package com.devteria.hello_spring_boot.lab02;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Nhập tiền");
        int money = Input.nextInt();
        if (money < 10) {
            System.out.println("Không đóng thuế");
        } else if (10 <= money && money<= 15) {
            System.out.println("thuế 10%");
        } else if (10 <= money && money <= 30) {
            System.out.println("thuế 20%");
            
        } else if (money > 30) {
            System.out.println("Thuế 50%");
        }
    }
}
