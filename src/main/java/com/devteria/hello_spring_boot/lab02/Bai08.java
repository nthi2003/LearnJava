package com.devteria.hello_spring_boot.lab02;

import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = Input.nextInt();
        System.out.println("Nhập b");
        int b = Input.nextInt();
        System.out.println("Nhập c");
        int c = Input.nextInt();
        System.out.println("phường trinh " +a+"x'2" +"+"+ b + "+" + c+ "=0");

        if(a == 0) {
            if (a == 0 && b == 0) {
                System.out.println("chương trình vô số nghiệm");
            } else if (a == 0 && b != 0) {
                System.out.println("chương trinh vô nghiệm");

            }
        } else {
            double denta = Math.pow(b , 2) - 4*a*c ;
            if(denta < 0) {
                System.out.println("phương trình vô nghiêm");
            } else if (denta == 0) {
                int x = -b/(2*a);
                System.out.println("Nghiệm kép : " + x);
            } else if (denta > 0) {
                System.out.println("có 2 nghiệm riêng biệt");

                double x1 = (-b + Math.sqrt(denta)) / (2 * a);

                System.out.println(" x1" + x1);
                double x2 = (-b - Math.sqrt(denta)) / (2 * a);
                System.out.println(" x1" + x2);
                
            }
        }

    }
}
