package com.devteria.hello_spring_boot.Lab06;

public class SinhVienIt extends SinhVien {
    private String language;
    public SinhVienIt(String language , String id , String name , double price , double tax) {
        super(id , name , tax, price);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void getMoney(){
        System.out.println("hhhh");
        super.Info();
    }

    @Override
    void tinhDiem() {

    }

    public void Info(){
        System.out.println("con");
    }


}
