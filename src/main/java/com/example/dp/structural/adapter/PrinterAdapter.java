package com.example.dp.structural.adapter;

public class PrinterAdapter implements NewPrinter   {

    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }
    @Override
    public void print(String text) {
        legacyPrinter.printLegacy(text);
    }
}
