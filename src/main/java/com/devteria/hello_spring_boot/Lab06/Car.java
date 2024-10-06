package com.devteria.hello_spring_boot.Lab06;

public class Car extends Verhical {
    private String modelName = "mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + myCar.modelName);
    }
}