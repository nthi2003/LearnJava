package com.devteria.hello_spring_boot;

import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        System.out.println("Viết chương trình ax+b");
        Scanner Input = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = Input.nextInt();
        System.out.println("nhập b");
        int b = Input.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("chương trình vô số nghiệm");
        } else if (a == 0 && b != 0) {
            System.out.println("chương trinh vô nghiệm");
            
        }else  {
            int x = -b/a;
            System.out.println("x = " + x);
        }


    }
}
