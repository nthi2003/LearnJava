package com.devteria.hello_spring_boot.Lab06;

public abstract class SinhVien {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;
    abstract void tinhDiem();
    public SinhVien(String id , String name , double price , double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    public double getPriceTax(){
        return  this.price * this.tax;
    }
    public void Info() {
        System.out.println("shshs");
    }

}
