package com.devteria.hello_spring_boot.Lab06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SinhVienIt sit = new SinhVienIt("C++", "IT1", "Thi" , 12.0 , 11.0);
        sit.getMoney();
        sit.Info();
        System.out.println(sit.id);

        SinhVienCoKhi  sck = new SinhVienCoKhi("han" , "Ck1" , "Thi" , 12.0 , 0.1);
        System.out.println(sck.tax);

        System.out.println(sit.getLanguage());
        System.out.println("Nhap va username");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.println("nhap vao password");
        String password = scanner.nextLine();

        System.out.println(username + password);
        if(username.equals("quocthi") && password.length() > 6) {
            System.out.println("nhap dung ");
        }
        scanner.close();

    }
}
