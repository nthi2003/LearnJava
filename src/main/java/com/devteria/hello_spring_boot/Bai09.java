package com.devteria.hello_spring_boot;

import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("tính giá điện");
        System.out.println("Nhập số điện");
        int Sodien = Input.nextInt();
        int Gia ;
        if( 0 <= Sodien && Sodien <=100 ) {
            Gia = 1000;
            int money = Sodien * Gia;
            System.out.println("giá 1 số điện là " + Gia);
            System.out.println("Số tền cần trả " + money);

        } else if (Sodien > 100) {
            Gia = 1500;
            int money = 100 * 1000 + (Sodien - 100) * 1500;
            System.out.println("giá 1 số điện là " + Gia);
            System.out.println("Số tền cần trả " + money);
            
        }


    }
}
