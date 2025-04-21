package com.example.designPattern.adapter;

public class PrinterAdapter {
    LegacyPrinter legacyPrinter;
    public PrinterAdapter(){
        this.legacyPrinter = new LegacyPrinter();
    }

    public void print(String message){
        this.legacyPrinter.print(message);
    }
}
