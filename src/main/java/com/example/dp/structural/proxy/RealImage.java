package com.example.dp.structural.proxy;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void dispaly() {
        System.out.println("Getting data from real image "+ fileName);
    }
}
