package Lab09;

import java.util.Scanner;

public class Bai52 {
    public static void main(String[] args) {
        System.out.println("nhap x");
        Scanner input = new Scanner(System.in);
        while (true) {
            int a = input.nextInt();
            try {
                System.out.println(10/a);
                break;
            } catch ( Exception e) {
                System.out.println(a);
            }
        }

    }
}
