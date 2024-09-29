package com.devteria.hello_spring_boot;

import java.util.Scanner;

public class Bai010 {
   public  static  void Bai07() {
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
    public  static  void Bai08() {
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
    public  static  void Bai09() {
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
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in) ;
        System.out.println(">>Lựa chọn tính năng <<");
        System.out.println("++ ---------------------- ++");
        System.out.println("1.Chương trình bật nhất");
        System.out.println("2.Chương trình bật 2");
        System.out.println("3.Tính só tien điện");
        System.out.println("4. Kết thúc");
        System.out.println("++ ---------------------- ++");
        System.out.println("Sự lựa chọn của bạn");
        int choke = Input.nextInt();
        switch (choke) {
            case 1 :
                Bai07();
                break;
            case 2 :
                Bai08();
                break;
            case 3 :
                Bai09();
                break;
            default:
                System.exit(0);
        }
    }
}
