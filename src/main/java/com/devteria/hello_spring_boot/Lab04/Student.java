package com.devteria.hello_spring_boot.Lab04;

public class Student {

    private String name;
    private int  age;
    String email;

    public Student(String name , int age) {
           this.name = name;
           this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void getEmail(String email) {
        System.out.println("hhh");
    }
    void getEmail(int a) {
        System.out.println("hhh");
    }


}
