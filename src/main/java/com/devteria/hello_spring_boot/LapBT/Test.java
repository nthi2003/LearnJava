package com.devteria.hello_spring_boot.LapBT;

public class Test {
    public static void main(String[] args) {
        Product test = new Product();
        Product pr1 = test.nhapThngTin("Thi", 20, 10);
        test.xuatThongTin(pr1);
        System.out.println("GetTaxPrice" + test.getTaxPrice(pr1.getPrice() , pr1.getTax()));


    }
}
