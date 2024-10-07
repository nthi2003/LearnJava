package Lab09;

import java.util.Scanner;

public class Bai53 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        try {
            int a = input.nextInt();
            System.out.println();

        }catch (Exception e) {
            System.out.println("run catch ");
        }
        finally {
            System.out.println("run final");

        }


    }
}
