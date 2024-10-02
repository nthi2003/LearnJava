package com.devteria.hello_spring_boot.Lab04;

public class Animal {
    int sum(int a , int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        int sum = animal.sum(7,3);
        System.out.println("check sum " + sum);
    }
}
