package com.example.designPattern.itegtrator;

public class Book {

    String name;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    int price;

    public Book(String name, int price){
        this.name= name;
        this .price = price;
    }
}
