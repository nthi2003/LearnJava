package com.devteria.hello_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class HelloSpringBootApplication {
	public static void main(String[] args) {
		System.out.println("hello world");

		Scanner Input = new Scanner(System.in);
		System.out.println("Nhập tên của bạn " );
		String name = Input.nextLine();
	    int age = Input.nextInt();
		System.out.println(name +" nam nay " + name + age + "Tuoi");
        int a = 12;
        int b = 2;
	    int Sum = Math.max(12,2);
		System.out.println("Sum" + Sum);
		System.out.println("Nhap so nam sinh Thi");
		int age1 = Input.nextInt();
		System.out.println("Nhap nam sinh của Linh");
		int age2 = Input.nextInt();
		System.out.println("tuổi của Thi " + age1 + "&& Linh" + age2 + "ai lớn hơn " + Math.max(age1 , age2));
}
}