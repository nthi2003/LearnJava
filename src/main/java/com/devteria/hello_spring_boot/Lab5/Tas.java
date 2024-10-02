package com.devteria.hello_spring_boot.Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> test = new ArrayList();
        while(true) {
            System.out.println("nhap vao so thuc bat kì");
            double Check = input.nextDouble();
            test.add(Check);
            input.nextLine();
            System.out.println("Y or N ???");
            String option = input.nextLine();
            if(option.equals("N") || option.equals("n")) {
                break;
            }

        }
        System.out.println("Check arr" + test );
        double sum = 0;
        for (int i = 0 ; i< test.size() ; i ++){
            sum += test.get(i);
        }
        System.out.println(sum);
    }
}
