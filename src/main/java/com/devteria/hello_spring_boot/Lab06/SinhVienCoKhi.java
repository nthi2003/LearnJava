package com.devteria.hello_spring_boot.Lab06;

public class SinhVienCoKhi extends SinhVien {
    private String skill;
    public SinhVienCoKhi(String skill , String id, String name , double price , double tax) {
        super(id , name , price , tax);
        this.skill = skill;
    }

    @Override
    void tinhDiem() {

    }
}
