package com.example.designPattern.adapter;

public class AdapterDriver {

    public void execute(){
        NewPrinter printer = new NewPrinter();
        printer.print("Hello World!!");

    }
}
