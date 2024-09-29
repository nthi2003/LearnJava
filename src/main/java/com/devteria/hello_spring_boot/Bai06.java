package com.devteria.hello_spring_boot;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        System.out.println("Nhập lựa chọn");
        Scanner Input = new Scanner(System.in);
        int choke = Input.nextInt();
        switch (choke) {
            case 1 :
                System.out.println("phép cộng");
                break;
            case 2 :
                System.out.println("phép tru");
                break;
            case 3:
                System.out.println("phép nhân");
                break;
            case 4:
                System.out.println("phép chia");
                break;
            default:
                System.out.println("Bạn l chọn thoát");
                System.exit(0);
        }
        int choke1  = Input.nextInt();
        Input.close();
    }
}
