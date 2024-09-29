package com.devteria.hello_spring_boot;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên : ");
        String name = Input.nextLine();
        System.out.println("Nhập điểm  : " );
        int poins = Input.nextInt();
        System.out.println("Sinh viên tên " + name + " diểm " + poins) ;

    }
}
