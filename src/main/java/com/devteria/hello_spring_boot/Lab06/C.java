package com.devteria.hello_spring_boot.Lab06;

import java.util.ArrayList;

public class C {
    public static void main(String[] args) {
        Student st = new Student("Thi" , "MD21");
        Student st1 = new Student("lhi1" , "MD211");
        Student st2 = new Student("jhi2" , "MD212");
        Student st3 = new Student("khi3" , "MD213");
        Student st4 = new Student("rhi4" , "MD214");
        ArrayList<Student> arr = new ArrayList();
        arr.add(st);
        arr.add(st1);
        arr.add(st2);
        arr.add(st3);
        arr.add(st4);
        System.out.println(arr);
        for(int i = 0 ; i < arr.size(); i++) {
            if (arr.get(i).getName().startsWith("Thi")){
                System.out.println(arr.get(i));
            }
        }



    }
}
