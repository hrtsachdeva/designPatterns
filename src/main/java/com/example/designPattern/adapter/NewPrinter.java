package com.example.designPattern.adapter;

public class NewPrinter implements Printer {
    PrinterAdapter printerAdapter;
    public NewPrinter(){
        printerAdapter = new PrinterAdapter();
    }

    @Override
    public void print(String message) {
        printerAdapter.print(message);
    }
}
