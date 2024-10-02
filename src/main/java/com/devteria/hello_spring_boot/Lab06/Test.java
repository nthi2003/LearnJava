package com.devteria.hello_spring_boot.Lab06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
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
